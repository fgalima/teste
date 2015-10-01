package br.com.hightechcursos.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.hightchcursos.entidades.Usuario;

public class UsuarioDAO {

	private Connection con = Conexao.getConnection();
	
	
	public void cadastrar(Usuario usuario){
		//monta sql
	String sql = "INSERT INTO USUARIO(nome, login, senha) values (?,?,?)";
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	}

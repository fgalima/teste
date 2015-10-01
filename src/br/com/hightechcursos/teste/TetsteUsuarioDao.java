package br.com.hightechcursos.teste;

import br.com.hightchcursos.entidades.Usuario;
import br.com.hightechcursos.jdbc.UsuarioDAO;

public class TetsteUsuarioDao {

	public static void main(String[] args) {
	Usuario usu = new Usuario();
	usu.setNome("ruan");
	usu.setLogin("ru");
	usu.setSenha("123");
	UsuarioDAO  usuDao = new UsuarioDAO();
	usuDao.cadastrar(usu);

	}

}

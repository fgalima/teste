package br.com.hightechcursos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	public static Connection getConnection() throws SQLException {
		Connection con = null;

		try {
			
			Class.forName("org.postgresql.Driver");
			//referencia para um objeto de conexao
			con = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/cjweb1",
					"postgres", "postgres");
			
			System.out.println("Conectado!");
		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

}
		
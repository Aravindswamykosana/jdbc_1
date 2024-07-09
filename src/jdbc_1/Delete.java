package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		try {
			//load and register.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish the connection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "root");
			//creation of statement.
			Statement s = con.createStatement();
			//execution os stmt.
			s.execute("delete from table1 where name='chiru' ");
			//close.
			s.close();
			con.close();
			System.out.println("welcome.......");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

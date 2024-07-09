package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class PreparedStmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("update table1 set slno=5 where slno=20 ");
		//ps.execute();
		int res = ps.executeUpdate();
		ps.close();
		con.close();
		System.out.println("data inserted");
	}

}

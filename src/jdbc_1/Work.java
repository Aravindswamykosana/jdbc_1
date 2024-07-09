package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class Work {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		Statement s = con.createStatement();
		ResultSet res = s.executeQuery("select name from table1 ");
		//ArrayList al=new ArrayList();
		TreeSet al=new TreeSet();
		while(res.next()) {
			al.add(res.getString("name"));
		}
		System.out.println(al);
		s.close();
		con.close();
	}
}

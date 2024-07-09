package jdbc_1;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ExecuteMethods {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		Statement s = con.createStatement();
		//boolean res = s.execute("insert into table1 values(15,'chiru','ch@gmail.com','lo',45612352)");
		//int res = s.executeUpdate("insert into table1 values(14,'chiru','ch@gmail.com','lo',45612352)");
		 ResultSet res = s.executeQuery("select name from table1 order by slno");
		 while(res.next()) {
//			 int slno=res.getInt(1);
//			 System.out.println(slno);
			 System.out.println(res.getString("name"));
//			 System.out.println(res.getString("email"));
//			 System.out.println(res.getInt("phone"));
			 System.out.println("-----------");
		 }
		System.out.println(res);
		s.close();
		con.close();
	}

}

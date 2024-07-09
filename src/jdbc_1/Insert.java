package jdbc_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert{
	public static void main(String[] args) {
		try {
			//login&&register.
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish the conection.
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root","root");
			//creation of statement.
			Statement s = con.createStatement();
			//execution of statement.
			s.execute("insert into table1 values(0,'rabbani','raabs@gamil.com','hiiiii',522586139)");
			//close.
			con.close();
			s.close();
			System.out.println("hi welcome.....!");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}

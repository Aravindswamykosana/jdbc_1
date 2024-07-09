package jdbc_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class DynamicFectchData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("ente the email:");
		String email=sc.next();
		System.out.println("enter the phone:");
		int phno=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("select * from table1 where email=? and phone=?");
		ps.setString(1,email);
		ps.setInt(2, phno);
		ResultSet r = ps.executeQuery();
		while(r.next()) {
			System.out.println(r.getInt(1));
			System.out.println(r.getString("name"));
			System.out.println(r.getString("email"));
			System.out.println(r.getInt(5));
		}
		ps.close();
		con.close();
	}
}

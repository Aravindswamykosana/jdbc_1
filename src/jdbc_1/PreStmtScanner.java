package jdbc_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class PreStmtScanner {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("enter the id:");
		int id=sc.nextInt();
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the email:");
		String email=sc.next();
		System.out.println("enter the dummy:");
		String dum=sc.next();
		System.out.println("enter the phno:");
		int ph=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("insert into table1 values(?,?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2,name);
		ps.setString(3,email);
		ps.setString(4, dum);
		ps.setInt(5, ph);
		int res=ps.executeUpdate();
		ps.close();
		con.close();
		System.out.println("inserted "+res+" row");
	}
}

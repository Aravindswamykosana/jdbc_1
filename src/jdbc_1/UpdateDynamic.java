package jdbc_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class UpdateDynamic {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the updated name:");
//		String name=sc.next();
//		System.out.println("enter the name:");
//		String name1=sc.next();
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root","root");
//		PreparedStatement ps = con.prepareStatement("update table1 set name=? where name=?");
//		ps.setString(1,name);
//		ps.setString(2, name1);
//		int r = ps.executeUpdate();
//		System.out.println("updated succesfully "+r+" row");
//		ps.close();
//		con.close();
		System.out.println("enter the id:");
		int id=sc.nextInt();
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the email:");
		String email=sc.next();
		System.out.println("enter the phno:");
		long phno=sc.nextLong();
		System.out.println("enter the PWD:");
		String pwd=sc.next();
		System.out.println("enter the marks:");
		double marks=sc.nextDouble();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase?user=root&password=root");
		PreparedStatement ps = con.prepareStatement("insert into student values(?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setLong(4, phno);
		ps.setString(5,pwd);
		ps.setDouble(6, marks);
		int res = ps.executeUpdate();
		System.out.println("inserted data sucessfully:"+res+" row");
		ps.close();
		con.close();
	}
}

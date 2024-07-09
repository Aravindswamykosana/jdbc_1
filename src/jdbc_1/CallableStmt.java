package jdbc_1;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStmt {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase","root","root");
		CallableStatement cs = con.prepareCall("call dbase.insert(?,?,?,?,?,?)");
		System.out.println("enter the id:");
		int id=sc.nextInt();
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the email:");
		String email=sc.next();
		System.out.println("enter the phno:");
		long phno=sc.nextLong();
		System.out.println("enter the pwd:");
		String pwd=sc.next();
		System.out.println("enter the marks:");
		double marks=sc.nextDouble();
		cs.setInt(1,id);
		cs.setString(2,name);
		cs.setString(3,email);
		cs.setLong(4, phno);
		cs.setString(5, pwd);
		cs.setDouble(6, marks);
		cs.execute();
		cs.close();
		con.close();
		System.out.println("inserted");
	}
}

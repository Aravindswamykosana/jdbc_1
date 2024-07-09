package jdbc_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class CallableStmtUpadate {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		FileInputStream stream=new FileInputStream("dbconfig.properties");
		Properties prop=new Properties();
		prop.load(stream);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase",prop);
		CallableStatement cs = con.prepareCall("call dbase.update1(?,?,?,?,?,?,?)");
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
		System.out.println("enter the updated name");
		String name1=sc.next();
		cs.setInt(1,id);
		cs.setString(2,name);
		cs.setString(3,email);
		cs.setLong(4, phno);
		cs.setString(5, pwd);
		cs.setDouble(6, marks);
		cs.setString(7,name1);
		int res = cs.executeUpdate();
		cs.close();
		con.close();
		System.out.println("data is updated from "+res+" row");
	}
}

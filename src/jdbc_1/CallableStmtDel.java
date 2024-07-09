package jdbc_1;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class CallableStmtDel{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		FileInputStream stream=new FileInputStream("dbconfig.properties");
		Properties prop=new Properties();
		prop.load(stream);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase",prop);
		CallableStatement cs = con.prepareCall("call dbase.delete('sams'");
	}
}


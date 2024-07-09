package jdbc_1;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.cj.jdbc.Driver;

public class SecondStepGetConn{

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		DriverManager.registerDriver(new Driver());
		FileInputStream stream=new FileInputStream("dbconfig.properties");
		Properties properties=new Properties();
		properties.load(stream);
		DriverManager.getConnection("jdbc:mysql://localhost:3306/db1?createDatabaseIfNotExist=true",properties);
		System.out.println("advance java load done.........");
	}
}

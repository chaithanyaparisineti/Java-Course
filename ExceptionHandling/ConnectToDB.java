package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDB {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver class loaded successfully");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Batch74","root","root");
		System.out.println("your connection had been established");
		
		Statement stmt=con.createStatement();
		
		String sql="select * from emp";
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"|");
			System.out.println(rs.getString(2)+"|");
			System.out.println(rs.getString(3)+"|");	
		}
		}catch(ClassNotFoundException| SQLException e) {
			System.err.println("in catch");
		}
	}	
}



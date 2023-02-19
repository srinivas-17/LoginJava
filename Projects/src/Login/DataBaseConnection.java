//package Login;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DataBaseConnection {
//
//	public Connection getConnection() throws ClassNotFoundException, SQLException {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root","Srinivas@17");
//		Statement st = conn.createStatement();
//		ResultSet rs = st.executeQuery("select * from login");
//		
//		while(rs.next()) {
//			
//		}
//		return conn;
//	}
//}

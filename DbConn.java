package helloworld;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConn {
	public static void main(String[] args) throws SQLException {
		Connection c=DriverManager.getConnection("jdbc:mariadb://localhost:3306/car?user=root");
		Statement st=c.createStatement();
		/*String query="INSERT INTO cars(car_name,car_speed) VALUES ('Mercedes',100)";
		int sonuc=st.executeUpdate(query);
		System.out.println(sonuc);
		st.close();
		String query1="INSERT INTO cars(car_name,car_speed) VALUES (?,?)";
		PreparedStatement pt=c.prepareStatement(query1); 
		pt.setString(1, "Tofaş");
		pt.setInt(2, 100);
		pt.executeUpdate();
		pt.close(); */
		ResultSet rs=st.executeQuery("Select * From cars");
		while(rs.next()) {
			System.out.println(rs.getString("car_name")+" - "+rs.getInt("car_speed")); }
} }

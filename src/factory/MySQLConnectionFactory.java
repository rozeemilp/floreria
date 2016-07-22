package factory;

import java.sql.Connection;
import java.sql.DriverManager;

public final class MySQLConnectionFactory extends ConnectionDb {
	
	public MySQLConnectionFactory(){
		//this.params = params;
		this.open();
		
	}
	
	@Override
	public Connection open(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection("jdbc:mysql://localhost/floreria","root","");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return this.connection;
	}
	public static ConnectionDb conectar(){
		return new MySQLConnectionFactory();
	}
	 	
}

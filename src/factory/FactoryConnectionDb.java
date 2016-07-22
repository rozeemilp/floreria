package factory;

public class FactoryConnectionDb {
	public static final int MYSQL = 1;
	//public static String[] confing

	public static ConnectionDb open(){
		return new MySQLConnectionFactory();
	}
}

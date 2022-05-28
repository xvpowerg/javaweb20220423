package tw.com.listener;

public class DbTools {
	private static String dbName,dbPassword;
	private static DbTools  dbTools;
	private DbTools(String dbName, String dbPassword) {
		super();
		this.dbName = dbName;
		this.dbPassword = dbPassword;
	}
	
	 static void initDbTools(String dbName, 
			 String dbPassword) {
		 dbTools = new DbTools(dbName,dbPassword);
		 
	}
	
	 public static DbTools getDbTools() {
		 	return dbTools;
	 }
	 
	 
	 public static String getDBName() {
		 return  dbName;
	 }
	 
	 public static String getPassword() {
		 return dbPassword;
	 }
}

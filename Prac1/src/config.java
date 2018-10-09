import java.io.FileReader;
import java.util.Properties;

public class config {
	static void print () {
		
		// This code sets up the File Reader Objects and points to the config file		
		try(FileReader reader =  new FileReader("config")) {
	        Properties properties = new Properties();
	        properties.load(reader);

	        
	        // Some Strings (remember case sensitive)
	        String username = properties.getProperty("username");
	        String email = properties.getProperty("email");
	        String password = properties.getProperty("password");

	        
	        // Verification using println
	        System.out.println(username);
	        System.out.println(email);
	        System.out.println(password);
	        
	       
	       }catch (Exception e) {;
	       e.printStackTrace();
	       }
	}
}
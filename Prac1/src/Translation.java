import java.util.Locale;
import java.util.ResourceBundle;


public class Translation {

	static String country = System.getProperty("profile.country");
	static String language = System.getProperty("profile.language");

	String s1;
	String s2;
	String s3;
	String s4;
	String s5;
	String s6;
	String s7;
	String s8;
	
	void setCountry(String country) {
		Translation.country = country;
	}

	void setLanguage(String language) {
		Translation.language = language;
	}
	
	void Translate() {
		Locale currentLocale;
		ResourceBundle messages;
		
		currentLocale = new Locale(language, country);
		
		messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
		s1 = messages.getString("Welcome");
		s2 = messages.getString("Category");
		s3 = messages.getString("Product");
		s4 = messages.getString("Buy");
		s5 = messages.getString("Return");
		s6 = messages.getString("Consult");
		s7 = messages.getString("Stock");
		s8 = messages.getString("exit");
	}

	String getS1() {
		return s1;
	}
	
	String getS2() {
		return s2;
	}
	
	String getS3() {
		return s3;
	}
	
	String getS4() {
		return s4;
	}
	
	String getS5() {
		return s5;
	}
	
	String getS6() {
		return s6;
	}
	
	String getS7() {
		return s7;
	}

	String getS8() {
		return s8;
	}

}
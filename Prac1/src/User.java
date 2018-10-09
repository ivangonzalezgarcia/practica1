public class User {
	String email;
	String password;
	String login;
	String lastlogin;
	
	private User (String u_email, String u_password, String u_login, String u_lastlogin) {
		email = u_email;
		password = u_password;
		login = u_login;
		lastlogin = u_lastlogin;
	}
}

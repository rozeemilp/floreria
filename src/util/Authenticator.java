package util;

public class Authenticator {
	 
		public String authenticate(String username, String password) {
			if (("ro".equalsIgnoreCase(username))
					&& ("1".equals(password))) {
				return "admin";
			} else {
				return "failure";
			}
}
}
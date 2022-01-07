package googleLoginRegisterService;

public class GoogleLoginRegisterService {
	
	public GoogleUser register(String email,String password) {
		GoogleUser googleUser = new GoogleUser();
		googleUser.setEmail(email);
		googleUser.setPassword(password);
		return googleUser;
	}
	
	public void login(String email,String password) {
		System.out.println("Google ile giriþ yapýldý");
	}

}

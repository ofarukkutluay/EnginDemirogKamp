package core.adapters;

import entities.concretes.User5;
import googleLoginRegisterService.GoogleLoginRegisterService;

public class GoogleAdapter implements RegisterAdapter {
	
	GoogleLoginRegisterService glrService = new GoogleLoginRegisterService();

	@Override
	public User5 register(String email, String password) {
		User5 user = new User5(); 
		var gUser = glrService.register(email, password);
		user.setEmail(gUser.getEmail());
		user.setPassword(gUser.getPassword());
//		user.setFirstName(gUser.getFirstName());
//		user.setLastName(gUser.getLastName());
		user.setFirstName("Elif");
		user.setLastName("Demir");
		user.setId(12);
		
		return user;
		
	}
	
}

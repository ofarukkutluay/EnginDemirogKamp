package business.concretes;

import business.abstracts.LoginService;
import dataAccess.abstracts.User5Dao;
import entities.concretes.LoginUser;

public class LoginManager implements LoginService {

	User5Dao user5Dao;

	public LoginManager(User5Dao user5Dao) {
		this.user5Dao = user5Dao;
	}

	@Override
	public void login(LoginUser loginUser) {
		var user = this.user5Dao.getByEmail(loginUser.getEmail());
		if (user != null) {
			if (loginUser.getPassword() == user.getPassword()) {
				System.out.println(user.getFirstName() + " " + user.getLastName() + " Giri� Ba�ar�l�");
			} else {
				System.out.println("�ifre hatal�");
			}
		} else {
			System.out.println("Kullan�c� Bulunamad�");
		}

	}

}

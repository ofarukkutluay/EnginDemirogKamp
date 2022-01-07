package Concrete;

import Abstract.UserCheckService;
import Entities.User4;

public class UserCheckManager implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User4 user) {
		return true;
	}
	

}

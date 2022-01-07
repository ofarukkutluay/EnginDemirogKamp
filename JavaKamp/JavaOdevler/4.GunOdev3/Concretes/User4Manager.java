package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User4;

public class User4Manager implements UserService {
	
	private UserCheckService userCheckService;
	private List<User4> users = new ArrayList<User4>();
	
	public User4Manager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void add(User4 user) {
		if (this.userCheckService.checkIfRealPerson(user)) {
			this.users.add(user);
			System.out.println(user.getFirstName() + " m��teri eklendi!");
		}else {
			System.err.println("Ger�ek m��teri de�ilsiniz!");
		}	
	}

	@Override
	public void update(User4 user) {
		if (this.userCheckService.checkIfRealPerson(user)) {
			boolean dataGeldiMi=false;
			int index = 0;
			for (int i=0; i<this.users.size();i++) {
				User4 user1 = this.users.get(i);
				if (user.getId()==user1.getId()) {
					index = i;
					dataGeldiMi=true;
					break;
				}
			}
			if (dataGeldiMi) {
				this.users.set(index, user);
				System.out.println(user.getFirstName() + " m��teri g�ncellendi!");
			}else {			
				System.err.println("Data bulunamad�!");
			}
		}else {
			System.err.println("Ger�ek m��teri de�ilsiniz! Bilgileri tekrar g�zden ge�iriniz!");
		}	
		
	}

	@Override
	public void delete(User4 user) {
		this.users.remove(user);
		System.out.println(user.getFirstName() + " m��teri silindi!");
	}

	@Override
	public void getAll() {
		for (User4 user4 : users) {
			System.out.println( "Id : " + user4.getId() +" Ad� : " +user4.getFirstName() + " Soyad� : " + user4.getLastName() + " TC Numaras� : " + user4.getNationaltyId() +  " Do�um Tarihi : "+ user4.getDateOfBirth() );
		}
	}

}

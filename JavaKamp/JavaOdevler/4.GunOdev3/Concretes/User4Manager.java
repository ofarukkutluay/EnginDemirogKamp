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
			System.out.println(user.getFirstName() + " müþteri eklendi!");
		}else {
			System.err.println("Gerçek müþteri deðilsiniz!");
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
				System.out.println(user.getFirstName() + " müþteri güncellendi!");
			}else {			
				System.err.println("Data bulunamadý!");
			}
		}else {
			System.err.println("Gerçek müþteri deðilsiniz! Bilgileri tekrar gözden geçiriniz!");
		}	
		
	}

	@Override
	public void delete(User4 user) {
		this.users.remove(user);
		System.out.println(user.getFirstName() + " müþteri silindi!");
	}

	@Override
	public void getAll() {
		for (User4 user4 : users) {
			System.out.println( "Id : " + user4.getId() +" Adý : " +user4.getFirstName() + " Soyadý : " + user4.getLastName() + " TC Numarasý : " + user4.getNationaltyId() +  " Doðum Tarihi : "+ user4.getDateOfBirth() );
		}
	}

}

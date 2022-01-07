package dataAccess.concretes;

import java.util.List;

import java.util.ArrayList;

import dataAccess.abstracts.User5Dao;
import entities.concretes.User5;

public class InMemoryUser5Dao implements User5Dao {
	
	static List<User5> users = new ArrayList<User5>();

	@Override
	public void create(User5 user) {
		users.add(user);
		
	}

	@Override
	public User5 getById(int id) {
		boolean dataGeldiMi=false;
		int index = 0;
		for (int i=0; i<this.users.size();i++) {
			User5 user1 = this.users.get(i);
			if (id==user1.getId()) {
				index = i;
				dataGeldiMi=true;
				break;
			}
		}
		if (dataGeldiMi) {
			return this.users.get(index);
		}else {			
			
			return null;
		}
	}

	@Override
	public void update(User5 user) {
		boolean dataGeldiMi=false;
		int index = 0;
		for (int i=0; i<this.users.size();i++) {
			User5 user1 = this.users.get(i);
			if (user.getId()==user1.getId()) {
				index = i;
				dataGeldiMi=true;
				break;
			}
		}
		if (dataGeldiMi) {
			this.users.set(index, user);
			System.out.println(user.getEmail() + " müþteri güncellendi!");
		}else {			
			System.err.println("Data bulunamadý!");
		}
	}

	@Override
	public void delete(User5 user) {
		users.remove(user);
		
	}

	@Override
	public List<User5> getAll() {
		return users;
	}

	@Override
	public User5 getByEmail(String email) {
		boolean dataGeldiMi=false;
		int index = 0;
		for (int i=0; i<this.users.size();i++) {
			User5 user1 = this.users.get(i);
			if (email==user1.getEmail()) {
				index = i;
				dataGeldiMi=true;
				break;
			}
		}
		if (dataGeldiMi) {
			return this.users.get(index);
		}else {			
			return null;
		}
	}

}

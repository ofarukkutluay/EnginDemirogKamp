package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User5;

public interface User5Dao {
	void create(User5 user);
	User5 getById(int id);
	void update(User5 user);
	void delete(User5 user);
	List<User5> getAll();
	User5 getByEmail(String email);

}

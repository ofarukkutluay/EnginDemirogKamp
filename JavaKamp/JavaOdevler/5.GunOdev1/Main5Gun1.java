import business.concretes.LoginManager;
import business.concretes.User5Manager;
import core.adapters.GoogleAdapter;
import dataAccess.concretes.InMemoryUser5Dao;
import entities.concretes.LoginUser;
import entities.concretes.User5;

public class Main5Gun1 {

	public static void main(String[] args) {
		User5 omer = new User5(1,"Ömer","Kutluay","omer@omer.com","12345");
		User5 ozlem = new User5(2,"Özlem","Kutluay","ozlem@omer.com","123456");
		User5 ahmet = new User5(3,"ahmet","Kutluay","ahmetomer.com","123456");
		User5 ali = new User5(4,"Ali","Kutlu","ali@omer.com","123456");
		User5 agah = new User5(5,"Agah","Kuralsýz","agah@omer.com","123456");
		User5 recep = new User5(6,"Recep","Kuralsýz","ozlem@omer.com","123456");
		
		System.out.println("----------------------------------------------------");
		
		User5Manager user5Manager = new User5Manager(new InMemoryUser5Dao());
		
		user5Manager.add(omer);
		user5Manager.add(ozlem);
		user5Manager.add(ahmet);
		user5Manager.add(ali);
		user5Manager.add(agah);
		user5Manager.add(recep);
		
		System.out.println("----------------------------------------------------");
		
		User5Manager user5GoogleManager = new User5Manager(new InMemoryUser5Dao(),new GoogleAdapter());
		User5 elif = new User5("elif@elif.com","123456");
		
		user5GoogleManager.add(elif);
		
		System.out.println("----------------------------------------------------");
		
		for (User5 user : user5Manager.getAll()) {
			System.out.println(user.getId() + " " + user.getEmail());
		}
		
		System.out.println("----------------------------------------------------");
		
		System.out.println(user5Manager.getById(5).getEmail());
		
		System.out.println("----------------------------------------------------");
		
		LoginUser login1 = new LoginUser("ozlem@omer.com","123456");
		
		LoginManager loginManager = new LoginManager(new InMemoryUser5Dao());
		
		loginManager.login(login1);
	

	}

}

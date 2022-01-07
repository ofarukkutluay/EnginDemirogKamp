package business.concretes;

import java.util.List;
import java.util.regex.Pattern;

import business.abstracts.User5Service;
import core.adapters.RegisterAdapter;
import core.utilities.DogrulamaTikService;
import core.utilities.EmailSendService;
import dataAccess.abstracts.User5Dao;
import entities.concretes.User5;

public class User5Manager implements User5Service {

	User5Dao user5Dao;
	RegisterAdapter registerAdapter;
	EmailSendService emailSendService = new EmailSendService();
	DogrulamaTikService dogrulamaService = new DogrulamaTikService();

	public User5Manager(User5Dao user5Dao) {
		this.user5Dao = user5Dao;
	}

	public User5Manager(User5Dao user5Dao, RegisterAdapter registerAdapter) {
		this.user5Dao = user5Dao;
		this.registerAdapter = registerAdapter;
	}

	@Override
	public void add(User5 user) {

		if (dogrulamaService.tikladiMi()) {
			if (checkIfEmail(user.getEmail())) {
				if (isValidPassword(user.getPassword())) {
					if (isValidEmail(user.getEmail())) {
						if (registerAdapter != null) {
							var result = registerAdapter.register(user.getEmail(), user.getPassword());
							user5Dao.create(result);
							System.out.println("Google ile Kullanýcý kayýt edildi");
						} else {
							if (isNameValid(user.getFirstName()) && isNameValid(user.getLastName())) {

								this.user5Dao.create(user);
								this.emailSendService.send(user.getEmail(), user.getFirstName());
								System.out.println("Kullanýcý kayýt edildi");

							} else {
								System.out.println("Adnýz ve Soyadýnýz en az 2 karakter olmalýdýr!");
							}
						}

					} else {
						System.out.println("Mail doðru karakterde deðil");
					}
				} else {
					System.out.println("Þifre en az 6 karakter olmalýdýr");
				}
			} else {
				System.out.println("Bu mail daha önce kayýt edilmiþ");
			}
		} else {
			System.out.println("Doðrulanmadý!");
		}

	}

	@Override
	public User5 getById(int id) {
		var result = this.user5Dao.getById(id);
		return result;
	}

	@Override
	public void update(User5 user) {
		if (checkIfEmail(user.getEmail())) {
			if (isValidPassword(user.getPassword())) {
				if (isValidEmail(user.getEmail())) {
					if (isNameValid(user.getFirstName()) && isNameValid(user.getLastName())) {
						this.user5Dao.update(user);
						this.emailSendService.send(user.getEmail(), user.getFirstName());
						System.out.println("Kullanýcý kayýt edildi");
					} else {
						System.out.println("Adnýz ve Soyadýnýz en az 2 karakter olmalýdýr!");
					}

				} else {
					System.out.println("Mail doðru karakterde deðil");
				}
			} else {
				System.out.println("Þifre en az 6 karakter olmalýdýr");
			}
		} else {
			System.out.println("Bu mail daha önce kayýt edilmiþ");
		}

	}

	@Override
	public void delete(User5 user) {
		this.user5Dao.delete(user);

	}

	@Override
	public List<User5> getAll() {
		var result = this.user5Dao.getAll();
		return result;
	}

	@Override
	public User5 getByEmail(String email) {
		var result = this.user5Dao.getByEmail(email);
		return result;
	}

	private boolean isValidPassword(String password) {
		if (password.length() >= 6) {
			return true;
		}
		return false;
	}

	private boolean isValidEmail(String email) {
		String EMAIL_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
		Pattern pattern = Pattern.compile(EMAIL_PATTERN, Pattern.CASE_INSENSITIVE);
		return pattern.matcher(email).find();
	}

	private boolean isNameValid(String name) {
		if (name.length() >= 2) {
			return true;
		}
		return false;
	}

	private boolean checkIfEmail(String email) {
		var result = this.getByEmail(email);
		if (result == null) {
			return true;
		}
		return false;
	}

}

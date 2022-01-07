import java.time.LocalDate;

import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.CustomerCheckManager;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main4Gun2 {

	public static void main(String[] args) {
		Customer customer = new Customer(1,"Ömer Faruk","Kutluay",LocalDate.of(1993, 9, 23),"1111111111");
		
		BaseCustomerManager manager = new StarbucksCustomerManager(new MernisServiceAdapter());
		manager.save(customer);
		
		
	}

}

import java.time.LocalDate;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GameSaleManager;
import Concrete.User4Manager;
import Concrete.UserCheckManager;
import Entities.Campaign;
import Entities.Game;
import Entities.GameSale;
import Entities.User4;

public class Main4Gun3 {

	public static void main(String[] args) {

		User4 omer = new User4(1, "Ömer Faruk", "Kutluay", "23634785623", LocalDate.of(1993, 9, 23));
		User4 ahmet = new User4(2, "Ahmet", "Kubilay", "12765436234", LocalDate.of(1996, 6, 25));
		User4 omerUpdated = new User4(1, "Ömer", "Kutluay", "12345678912", LocalDate.of(1992, 9, 23));

		User4Manager userManager = new User4Manager(new UserCheckManager());
		userManager.add(ahmet);
		userManager.add(omer);
		userManager.update(omerUpdated);
		userManager.getAll();
		
		System.out.println("----------------------------------------------");
		
		Game gta = new Game(1,"GTA V",350);
		Game cs = new Game(2,"Counter Strike",150);
		Game pubg = new Game(3,"PUBG",400);
		
		GameManager gameManager = new GameManager();
		gameManager.add(gta);
		gameManager.add(pubg);
		gameManager.add(cs);
		gameManager.getAll();
		
		System.out.println("----------------------------------------------");
		
		Campaign yilBasi = new Campaign(1, "1B2C", "Yýlbaþý Ýndirimi", 15);
		Campaign yeniUye = new Campaign(2,"yeniuye","Yeni üye indirimi", 30);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(yilBasi);
		campaignManager.add(yeniUye);
		campaignManager.getAll();
		
		System.out.println("----------------------------------------------");
		
		GameSale csSale = new GameSale(1, omer.getId(), cs.getId(), cs.getPrice());
		GameSale gtaSale = new GameSale(2,ahmet.getId(),gta.getId(),gta.getPrice());
		GameSale pubgSale = new GameSale(3,ahmet.getId(),pubg.getId(),pubg.getPrice());
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		gameSaleManager.add(csSale);
		gameSaleManager.add(gtaSale, campaignManager.getByDiscountCode("1B2C").getDiscountRate());
		gameSaleManager.add(pubgSale, campaignManager.getByDiscountCode("yeniuye").getDiscountRate());
		gameSaleManager.getAll();
		
		

	}

}

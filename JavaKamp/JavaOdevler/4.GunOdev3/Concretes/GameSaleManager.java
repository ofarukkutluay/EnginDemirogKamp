package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.GameSaleService;
import Entities.GameSale;

public class GameSaleManager implements GameSaleService {
	List<GameSale> gameSales = new ArrayList<GameSale>();
	
	public GameSaleManager() {}

	
	@Override
	public void add(GameSale gameSale) {
		this.gameSales.add(gameSale);
		System.out.println(gameSale.getSalePrice() + " Fiyattan Sat�� Ger�ekle�ti!");
	}
	
	public void add(GameSale gameSale,double discountRate) {
		
		double discountPrice = gameSale.getSalePrice()-(gameSale.getSalePrice()*(discountRate/100));
		GameSale newGameSale=new GameSale(gameSale.getId(), gameSale.getUserId(), gameSale.getGameId(), discountPrice);
		this.gameSales.add(newGameSale);
		System.out.println(gameSale.getSalePrice() + " Fiyattan indirim yap�larak " + newGameSale.getSalePrice() + " TL den sat�� Ger�ekle�ti!");
	}

	@Override
	public void getAll() {
		for (GameSale gameSale : gameSales) {
			System.out.println(gameSale.getGameId() + " id li oyun " + gameSale.getUserId() + " id li kullan�c�ya "  + gameSale.getSalePrice() + " fiyattan sat�lm��t�r.");
		}
		
	}

}

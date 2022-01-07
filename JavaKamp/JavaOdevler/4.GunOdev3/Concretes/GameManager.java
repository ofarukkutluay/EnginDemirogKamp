package Concrete;

import java.util.ArrayList;
import java.util.List;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {
	
	List<Game> games = new ArrayList<Game>();

	@Override
	public void add(Game game) {
		this.games.add(game);
	}

	@Override
	public void update(Game game) {
		boolean dataGeldiMi=false;
		int index = 0;
		for (int i=0; i<this.games.size();i++) {
			Game game1 = this.games.get(i);
			if (game.getId()==game1.getId()) {
				index = i;
				dataGeldiMi=true;
				break;
			}
		}
		
		if (dataGeldiMi) {
			this.games.set(index, game);
			System.out.println(game.getName() + " oyun g�ncellendi!");
		}else {			
			System.err.println("Data bulunamad�!");
		}

	}

	@Override
	public void delete(Game game) {
		this.games.remove(game);

	}

	@Override
	public void getAll() {
		for (Game game : games) {
			System.out.println("Id : " + game.getId() + " Ad�: " + game.getName() + " Fiyat�: " + game.getPrice());
		}

	}

}

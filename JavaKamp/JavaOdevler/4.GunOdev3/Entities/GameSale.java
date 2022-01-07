package Entities;

import Abstract.Entity4;

public class GameSale implements Entity4 {
	private int id;
	private int userId;
	private int gameId;
	private double salePrice;
	
	
	public GameSale() {}

	public GameSale(int id, int userId, int gameId, double salePrice) {
		this.id = id;
		this.userId = userId;
		this.gameId = gameId;
		this.salePrice = salePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		
		this.salePrice = salePrice;
	}

	
	

}

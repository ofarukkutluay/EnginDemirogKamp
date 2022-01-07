package Entities;

import Abstract.Entity4;

public class Campaign implements Entity4 {
	private int id;
	private String discountCode;
	private String name;
	private double discountRate;
	
	public Campaign() {}
	
	public Campaign(int id, String discountCode, String name, double discountRate) {
		super();
		this.id = id;
		this.discountCode = discountCode;
		this.name = name;
		this.discountRate = discountRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}

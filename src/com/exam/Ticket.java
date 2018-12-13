package com.exam;

public class Ticket {
	String origin;
	String destination;
	int price;
	int quantity;

	public Ticket(String origin, String destination, int price, int quantity) {
		this.destination = destination;
		this.origin = origin;
		this.price = price;
		this.quantity = quantity;
	}

	public String get() {
		int a = price * quantity;
		String get = origin + "\t" + destination + "\t" + price + "\t" + quantity + "\t" + a;
		return get;
	}
}

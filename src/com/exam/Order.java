package com.exam;

import java.util.ArrayList;

public class Order {
	ArrayList trip = new ArrayList();
	public void add(Ticket ticket) {
	trip.add(ticket);
	}
		
	public void print(){
	System.out.println("Result¡G");
	for(int i=0;i<trip.size();i++){
		Ticket t=(Ticket)trip.get(i);
		System.out.println(t.get());
	}	
	}
}

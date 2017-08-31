package com.restaurant.orders;

import java.util.ArrayList;

import com.restaurant.items.Item;

public class PayBill {


	
	public double payableAmount(PlaceOrder order) {
		
		ArrayList<Order> pay = new ArrayList<>(order.getOrder());
		ArrayList<Item> bill = new ArrayList<>(order.getPay());
		double result = 0.0;
		
		for(int i = 0; i < pay.size(); i++) {
			
			String temp = pay.get(i).getName();
			int q = pay.get(i).getQuantity();
			
			if(bill.get(i).getname().equals(temp)) {
				
				result += bill.get(i).getCost()*q;
			}
		}
		
		return result;
	}
	
	public void printOrders(PlaceOrder order) {
		
		ArrayList<Order> pay = new ArrayList<>(order.getOrder());
		
		
		for(int i = 0; i < pay.size(); i++) {
			
			System.out.println(pay.get(i));
		}
		
		
		
		
	}
}

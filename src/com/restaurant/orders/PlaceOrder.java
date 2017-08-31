package com.restaurant.orders;

import java.util.ArrayList;

import com.restaurant.items.Item;
import com.restaurant.menu.Menu;

public class PlaceOrder {

	private ArrayList<Order> orders;
	private ArrayList<Item> availableItems;
	
	private ArrayList<Item> paying;
	
	public PlaceOrder(Menu menu) {
		
		this.availableItems = new ArrayList<>(menu.getItems());
		
		this.orders = new ArrayList<>();
		
		this.paying = new ArrayList<>();
		
	}
	
	public void orderItem(String item,int quantity) {
		
		for(int i = 0; i <availableItems.size(); i++) {
			
			String st = availableItems.get(i).getname();
			
			int q = availableItems.get(i).getQuantity();
			
			if(st.equals(item) && q >= quantity) {
				
				paying.add(availableItems.get(i));
				Order o = new Order(availableItems.get(i),quantity);
				
				orders.add(o);
				
			}
			
		}
		
	}
	
	public ArrayList<Order> getOrder(){
		
		return orders;
	}
	public ArrayList<Item> getPay(){
		
		return paying;
	}
	
	public void displayItems() {
		
		for(int i = 0; i <availableItems.size(); i++) {
			
			String st = availableItems.get(i).toString();
			System.out.println(st);
			

		}
		
	}
}

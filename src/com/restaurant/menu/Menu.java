package com.restaurant.menu;

import java.util.ArrayList;

import com.restaurant.items.Item;

public class Menu {

	private ArrayList<Item> items;
	
	
	public Menu() {
		super();
		
		this.items = new ArrayList<>();
	}
	
	public int itemsSize() {
		
		return items.size();
	}
	
	public ArrayList<Item> getItems() {
		
		
		return items;
		
	}
	

	public void addItem(Item item) {
		
		items.add(item);
	}
	
	public void displayItems() {
		
		for(int i = 0; i <items.size(); i++) {
			
			String st = items.get(i).toString();
			System.out.println(st);
		}
		
	}
	
	public void removeItems(Item obj) {
		
		for(int i = 0; i <items.size(); i++) {
			
			if(items.get(i).equals(obj)) {
				
				items.remove(i);
				
			}
		}
	}
	
	@Override
	public String toString() {
		
		String result = "";
		
		for(int i = 0; i < items.size(); i++) {
			
			result +=items.get(i).toString();
		}
		
		return result;
	}
	
	
	
}

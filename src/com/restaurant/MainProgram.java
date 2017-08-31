package com.restaurant;

import com.restaurant.items.Coffee;
import com.restaurant.items.Item;
import com.restaurant.items.Juices;
import com.restaurant.items.Sandwich;
import com.restaurant.items.Tea;
import com.restaurant.items.vegitems.VegSandwich;
import com.restaurant.menu.Menu;
import com.restaurant.orders.PayBill;
import com.restaurant.orders.PlaceOrder;

public class MainProgram {

	public static void main (String [] args) {
		
		Menu m = new Menu();
		
		Item item = new Coffee("Espreso",20.5);
		
		
		item.setQuantity(5);
		
		m.addItem(item);
		
		item = new Tea("kamilica",10.2);
		
		item.setQuantity(5);
		
		m.addItem(item);
		
		item = new Juices("Praska",11.2);
		
		item.setQuantity(5);
		
		m.addItem(item);
		
		Sandwich v = new VegSandwich("vegan", 25.5);
		
		v.setQuantity(5);
		
		m.addItem(v);
		
		Sandwich nonv = new VegSandwich("NonVegan", 25.5);
		
		nonv.setQuantity(5);
		
		m.addItem(nonv);
		
		m.displayItems();
		
		PlaceOrder place = new PlaceOrder(m);
		
		System.out.println();
		System.out.println("Avalible Items to order : ");
		System.out.println();
		
		place.displayItems();
		
		System.out.println();
		
		System.out.println("Sega pravi poracka");
		place.orderItem("Espreso", 1);
		place.orderItem("vegan", 1);
		
		System.out.println();
		
		PayBill bill = new PayBill();
		
		bill.printOrders(place);
		
		System.out.println("You have to pay : ");
		System.out.print(bill.payableAmount(place));
		System.out.print(" Euros");
		
	}
}

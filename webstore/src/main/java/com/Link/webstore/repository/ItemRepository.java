package com.Link.webstore.repository;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.Link.webstore.model.Item;

@Repository
public class ItemRepository {

	List<Item> items = new LinkedList<>();

	public ItemRepository() {
		
		items.add(new Item("1001", "PS5", "http://www.google.com", 0));
		items.add(new Item("1002", "PS1", "http://www.google.com", 10));
		items.add(new Item("1003", "PS2", "http://www.google.com", 30));
		items.add(new Item("1004", "PS3", "http://www.google.com", 154));
		items.add(new Item("1005", "PS4", "http://www.google.com", 12));
		items.add(new Item("1006", "Tv", "http://www.google.com", 65));
		items.add(new Item("1007", "Laptop", "http://www.google.com", 50));
		items.add(new Item("1008", "Phone", "http://www.google.com", 177));
		items.add(new Item("1009", "Camera", "http://www.google.com", 92));
		items.add(new Item("1010", "Desktop", "http://www.google.com", 101));

	}

	public Item getItem(String id) {
		for (Item item : items) {
			if (item.getId().equalsIgnoreCase(id)) {
				return item;
			}
		}

		return new Item("", "", "", 0);
	}
}

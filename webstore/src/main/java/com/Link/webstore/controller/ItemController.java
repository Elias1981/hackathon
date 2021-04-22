package com.Link.webstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Link.webstore.model.Item;
import com.Link.webstore.repository.ItemRepository;

@RestController
@RequestMapping("items")
public class ItemController {
	
	private ItemRepository repo;
	
	

	public ItemController() {
		repo = new ItemRepository();
	}



	@GetMapping("/in-stock/{id}")
	public Item getItem(@PathVariable String id) {
		return repo.getItem(id);
	}
}

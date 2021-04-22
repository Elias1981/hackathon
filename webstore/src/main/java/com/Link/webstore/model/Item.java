package com.Link.webstore.model;

public class Item {

	private String id;
	private String name;
	private String url;
	private int nrInStock;

	public Item(String id, String name, String url, int nrInStock) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
		this.nrInStock = nrInStock;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNrInStock() {
		return nrInStock;
	}

	public void setNrInStock(int nrInStock) {
		this.nrInStock = nrInStock;
	}

}

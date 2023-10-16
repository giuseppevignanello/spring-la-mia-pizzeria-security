package org.java.app.controller.dto;

public class PizzaDTO {
	private int id; 
	private String name; 
	private String description; 
	private String photo; 
	private double price; 
	
	public PizzaDTO() {
		
	}
	public PizzaDTO(String name, String descritpion, String photo, double price) {
		setName(name);
		setDescription(description); 
		setPhoto(photo); 
		setPrice(price);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
		
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override 
	public String toString() {
		return "id: " + getId()
		+ "\nname: " + getName() 
		+ "\ndescription " + getDescription() 
		+ "\nphoto " + getPhoto() 
		+ "\nprice" + getPrice();
	}
}

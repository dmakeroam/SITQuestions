package dev.oam.pen.entity;

public class Pen {

	private int id;
	private String model;
	private String brand;
	private double price;
	private static String allPens ;

	
	public Pen(int id, String model, String brand, double price) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
		this.price = price;
		
		if(allPens==null || allPens.trim().isEmpty()){
			allPens = "";
		}
		
		allPens += String.format("Pen id %d model %s %s %.0f\n", this.id, this.model, this.brand, this.price);
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public static String allPens(){
		return Pen.allPens;
	}
	

}

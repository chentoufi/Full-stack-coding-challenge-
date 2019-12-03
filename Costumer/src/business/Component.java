package business;

import java.io.Serializable;

public class Component implements Serializable { 
	private static final long serialVersionUID = 1L;
	private int idComponent ;// id of computer component
	private String nameComponenet; //name of computer component
	private double priceComponent; //price of computer component
	public int getIdComponent() {
		return idComponent;
	}
	public void setIdComponent(int idComponent) {
		this.idComponent = idComponent;
	}
	public Component() {//default constructor
		super();
	}
	public Component(int idComponent, String nameComponenet, double priceComponent) {//parameter constructor
		super();
		this.idComponent = idComponent;
		this.nameComponenet = nameComponenet;
		this.priceComponent = priceComponent;
	}
	public String getNameComponenet() {//return Name of Component
		return nameComponenet;
	}
	public void setNameComponenet(String nameComponenet) { //set Componenet Name 
		this.nameComponenet = nameComponenet;
	}
	public double getPriceComponent() {//return Price of Component
		return priceComponent;
	}
	public void setPriceComponent(double priceComponent) {//set Component Price
		this.priceComponent = priceComponent;
	}
	
}

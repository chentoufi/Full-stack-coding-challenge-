package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import business.Component;

public interface ComponentInterface extends Remote{
	public boolean availabityComponent(String name)throws RemoteException;//return component availability to customer
	public double returnPriceComponent(String name)throws RemoteException;//return price of component to customer
	public List<Component> componentList()throws RemoteException;//View list of component availabity to the customer
	

}

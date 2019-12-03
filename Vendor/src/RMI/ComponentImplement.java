package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import business.Component;

public class ComponentImplement extends UnicastRemoteObject implements ComponentInterface{//UnicastRemoteObject this Class is used for communication over TCP
	private static final long serialVersionUID = 1L;

	public ComponentImplement() throws RemoteException {
		super();
	}

	public boolean availabityComponent(String name) throws RemoteException {//availabityComponent Function implementation
		Component cp=new Component();
		if(cp.getNameComponenet().equals(name))
		return true;
		return false;
	}

	public double returnPriceComponent(String name) throws RemoteException {//returnPriceComponent Function implementation
		Component cp=new Component();
		if(cp.getNameComponenet().equals(name))
		return cp.getPriceComponent();
		return 0;
	}

	public List<Component> componentList() throws RemoteException {//componentList() Function implementation
		List<Component> cptes=new ArrayList<Component>();
		Component cp1=new Component(1,"Hard Disk",500);	
		Component cp2=new Component(2,"Keyboard",800);
		Component cp3=new Component(3,"RAM",300);
		cptes.add(cp1);
		cptes.add(cp2);
		cptes.add(cp3);
		return cptes;
	}
	

}

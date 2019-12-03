package Vendor;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

import RMI.ComponentImplement;

public class Vendor {
	public static void main(String[] args) {
	try {
	LocateRegistry.createRegistry(1095);//create Skeleton using Registry (Identification of a Romote Object)
	ComponentImplement ob=new ComponentImplement();
	System.out.println(ob.toString());
	Naming.rebind("rmi://localhost:1095/vendor",ob);//rebind:saves an object as name ,overwriting the previous object if it existed
	}catch (Exception e) {
		e.printStackTrace();
	}
	
	}
}

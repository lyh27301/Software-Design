package ca.mcgill.cs.swdesign.common;

import java.util.ArrayList;
import java.util.List;

public class RunObserver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List<Inventory> inventories = new ArrayList<>();
		Corporation cp = new Corporation();
		CorporationObserver o1 = new CorporationObserver(cp);
		
		for(int i=0;i<3;i++) {
			String s = "inv";
			s+=String.valueOf(i);
			inventories.add(new Inventory(s));
		}
		
		
		cp.addInventory(inventories.get(0));
		o1.toString();
		cp.addInventory(inventories.get(1));
		
		cp.addObserver(o1);
		
		o1.toString();
		cp.toString();
		
		cp.addInventory(inventories.get(2));
		
	}

}

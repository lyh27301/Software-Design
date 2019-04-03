package ca.mcgill.cs.swdesign.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CorporationObserver implements Observer
{
	private Corporation aObservedCorporation;
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	
	public CorporationObserver(Corporation pObservedCorporation) {
		aObservedCorporation = pObservedCorporation;
		update();
		//aInventories = pObservedCorporation.
	}
	
	public void update() {
		
		for(Iterator<Inventory> iter = aObservedCorporation.iterator(); iter.hasNext();) {
			Inventory inv = iter.next();
			aInventories.put(inv.getName(),inv);
		}
	}
	@Override
	public void inventoryAdded(String name, Inventory inv) 
	{
		if(aObservedCorporation.compareList(aInventories)) 
		{
			aInventories.put(name, inv);
		}
		else 
		{
			update();
			System.out.println("Here we use update()");
		}
	}
	
	@Override
	public void inventoryRemoved(String name) {
		if(aObservedCorporation.compareList(aInventories)) {
			aInventories.remove(name);
		}else {
			update();
			System.out.println("Here we use update()");
		}
		
	}
	
	@Override 
	public String toString() 
	{
		if(!aObservedCorporation.compareList(aInventories)) {
			System.out.println("!");
			update();
		}
		String s = "";
		if (aInventories.isEmpty()) 
		{
			System.out.println("no inventory here");
		}
		for(Inventory i: aInventories.values()) 
		{
			s+=i.getName();
			s+="\n";
		}
		System.out.println(s); 
		return s;
	}

}

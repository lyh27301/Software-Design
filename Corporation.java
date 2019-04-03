package ca.mcgill.cs.swdesign.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation implements Iterable<Inventory>, Subject
{
	private Map<String, Inventory> aInventories = new HashMap<String, Inventory>();
	private List<CorporationObserver> observers = new ArrayList<>();
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(Inventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}

	@Override
	public Iterator<Inventory> iterator()
	{
		return aInventories.values().iterator();
	}
	
	public void notifyInventoryAdded(Inventory i) 
	{
		for(CorporationObserver ob: observers)
		{
			ob.inventoryAdded(i.getName(), i);
		}
		
	}
	@Override
	public void addObserver(CorporationObserver o) 
	{
		observers.add(o);
	}
	@Override
	public void removeObserver(CorporationObserver o)
	{
		observers.remove(o);
	}
	@Override 
	public String toString() 
	{
		if (aInventories.isEmpty()) 
		{
			System.out.println("no inventory here");
		}
		String s = "";
		for(Inventory i: aInventories.values())
		{
			s+=i.getName();
			s+="\n";
		}
		System.out.println(s); 
		return s;
	}
	public boolean compareList(Map<String, Inventory> aInventories2) 
	{
		if (aInventories.size() == (aInventories2).size())
		{
			return aInventories.equals(aInventories2);
		}else {
			return false;
		}
	}
}

package ca.mcgill.cs.swdesign.common;

public interface Observer
{
	void inventoryAdded(String name,Inventory i);
	void inventoryRemoved(String name);
}

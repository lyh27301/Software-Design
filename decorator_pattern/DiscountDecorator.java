package ca.mcgill.cs.swdesign.common;

public class DiscountDecorator implements sellable
{
	private Item aItem;
	private int discount = 1;
	
	public DiscountDecorator(Item pItem) {
		this.aItem = pItem;
	}
	
	@Override
	public int getPrice() {
		assert aItem.getPrice()>=1;
		return (aItem.getPrice()-discount);
	}

}

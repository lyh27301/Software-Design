package ca.mcgill.cs.swdesign.common;

public interface Subject
{
	void addObserver(CorporationObserver o);
	void removeObserver(CorporationObserver o);
}

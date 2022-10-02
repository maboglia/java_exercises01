package com.lynda.olivepress.olives;

public enum OliveName {
	KALAMATA("Kalamata"), LIGURIO("Ligurio"), 
	PICHOLINE("Picholine"), GOLDEN("Golden");
	
	private String nameAsString;
	
	private OliveName(String nameAsString) {
		this.nameAsString = nameAsString;
	}
	
	@Override
	public String toString() {
		return this.nameAsString;
	}
}

package com.java.color;

public enum Color {
	WHITE("WHITE"), GREY("GREY"), BLACK("BLACK");
	
	String color;
	
	Color(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
}
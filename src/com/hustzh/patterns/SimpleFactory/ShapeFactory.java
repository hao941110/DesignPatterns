package com.hustzh.patterns.SimpleFactory;

public class ShapeFactory {

	public Shape getShape(String name){
		
		if(name == null)
		return null;
		if(name.equals("CIRCLE")){
			return new Circle();
		}else if(name.equals("RECTANGLE")){
			return new Rectangle();
		}else if(name.equals("SQUARE")){
			return new Square();
		}
		return null;
		
	}
}

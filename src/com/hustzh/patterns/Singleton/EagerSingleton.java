package com.hustzh.patterns.Singleton;

public class EagerSingleton {
//饿汉单例模式
	public static EagerSingleton instance = new EagerSingleton();
	
	public void say(){
		System.out.println("This is a EagerSingleton!");
	}
	
	public static EagerSingleton getInstance(){
		return instance;
	}
}

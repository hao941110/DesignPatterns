package com.hustzh.patterns.Singleton;

public class LazySingleton {
//	懒汉式单例模式
	public static LazySingleton instance = null;
	
	public void say(){
		System.out.println("This is a LasySingleton!");
	}
	
	public static synchronized LazySingleton getInstance(){
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
}

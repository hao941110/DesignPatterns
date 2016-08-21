package com.hustzh.patterns.Singleton;

public class DoubleCheckSingleton {
//	双重枷锁的单例模式
	public static volatile DoubleCheckSingleton instance = null;
	
	public void say(){
		System.out.println("This is a DoubleCheckSingleton!");
	}
	public static DoubleCheckSingleton getInstance(){
		//判断实例是否已经创建，如果已经创建就不进入同步块-----主要是针对是否进行同步
		if (instance == null) {
			synchronized (DoubleCheckSingleton.class) {
				//进入同步块再次判断是否已经创建----主要是针对是否需要创建
				if (instance == null) {
					instance = new DoubleCheckSingleton();
				}
			}
		}
		return instance;
	}

}

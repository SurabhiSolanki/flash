package com.java;

interface sayable{
	void say();
}

interface my extends sayable{
	void dom();
}

class application implements my{
	void show() {
		System.out.println("hello i am fine");
	}
    static void data() {
    	System.out.println("show data");
    }
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void dom() {
		// TODO Auto-generated method stub
		
	}
}

class InstanceMethodReference{
	public static void main(String []ar) {
		application a=new application();
		sayable s=a::show;
		my m = ()-> {
			System.out.println("kkkkkk");
			
		};
		s.say();
	}
}
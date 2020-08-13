package com.java;

interface Drawing{
	public String draw(String fname,String lname);
}

interface Adding{
	public int add(int a,int b);
}

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		Drawing d = (fname,lname)->{
			
				return "fullname="+fname+"."+lname;
			
			
		};
     
		System.out.println(d.draw("mayuree","barik"));
	}
	
//	Adding ad1=(a,b)->(a+b);  
 //   System.out.println(ad1.add(10,20));  

}

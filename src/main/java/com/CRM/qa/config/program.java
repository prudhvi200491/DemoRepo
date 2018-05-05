package com.CRM.qa.config;

public class program 

{
   public int first, sec;
   
	public static void main(String[] args) {
	
		program pp = new program();
		pp.first=20;
		pp.sec=30;
		
		Base obj=new Base(pp);
		 obj.Addition();

	}

}

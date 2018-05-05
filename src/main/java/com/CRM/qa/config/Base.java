package com.CRM.qa.config;

public class Base 
{
  int aa, bb;
  
  public Base(program p)
  {
	 aa= p.first;
	 bb= p.sec;
  }
  
  public int Addition()
  {
	  return aa+bb;
  }
}

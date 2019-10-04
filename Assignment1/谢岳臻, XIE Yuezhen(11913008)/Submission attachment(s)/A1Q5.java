/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bill
 */
public class A1Q5 
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
	String a="",b="",v="";
	// TODO code application logic here
		
		// TODO code application logic here
		for(String arg:args)
{
		
		char c =arg.charAt(arg.length()-3);
		
	double num = Double .parseDouble(arg);
	int d=(int)(c)-(int)('0');
	if(d==2)
	    a=(String)(num+4+" ");
	if(d==4)
		b =(String)(num+5+" ");
	v=a+b;
   			
}
     v=v.trim();
	 System.out.println(v);
	}
	
}

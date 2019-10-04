/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Bill
 */
public class A1Q4 
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		// TODO code application logic here
		int num=0,max=0,a;
		int sum=0;
		int length = args.length;
	for(String arg:args)
{
	a=num;
	num=Integer.parseInt(arg);
	sum=sum+num;
    max = ( num > a ) ? num:a;
}
	if(length>=10 && sum>=5000||max>=8000)
	{
		System.out.println("Diamond");
	}
	else if(length>=5 && sum>=2000||max>3000)
	{
		System.out.println("Gold");
	}
	else if(length>=2 && sum>=800||max>=1000)
		System.out.println("Silver");
	else
		System.out.println("None");
	}
	}
	
	

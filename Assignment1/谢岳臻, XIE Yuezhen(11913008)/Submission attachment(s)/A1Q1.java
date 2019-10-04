
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Bill
 */
public class A1Q1
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
		// TODO code application logic here
	String name=args[0];
	int id=Integer.parseInt(args[1]);
	if(id>1199_9999)
	System.out.println("Wrong id");
	else if(id>1150_0000)
	System.out.println(name+ ", welcome to SUSTECH Hot Pot" + "Restaurant! ");
	else if(id<=1150_000&&id>=1199_999)
	System.out.println("Wrong id");
	else if(id>1199_999)
	System.out.println("Wrong id");
	else if(id>1150_000)
	System.out.println(name+ ", welcome to SUSTECH Hot Pot" + "Restaurant! ");
	else if(id<=1150_000)
	System.out.println("Wrong id");
	}
	
}

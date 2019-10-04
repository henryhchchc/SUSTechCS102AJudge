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
public class A1Q2 
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{
	// TODO code application logic here

	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	int b=input.nextInt();
	int c=input.nextInt();
	int d=input.nextInt();
	int e=input.nextInt();
	int f=input.nextInt();
	if(b>60 || c>60 || e>60 || f>60 || 3600*a+60*b+c>3600*d+60*e+f)
	System.out.println("Your enter the wrong time");
		else
	{

	if(f>c&&b!=e)
	{	int g=60*d+e-60*a-b;
		int k=f-c;
				System.out.println(g+"m"+k+"s");
	}
	else if(b==e&&f>c)
	{
		int q=f-c;
		System.out.println(q+"s");
	}
	else if (f==c)
	{	int o=60*d+e-60*a-b;
	System.out.print(o+"m");
	}
	else if(f<c)
	{
		if(b<e-1){
		int l=d*60+e-60*a-b-1;
		int i=f-c+60;
		System.out.println(l+"m"+i+"s");}
		else if(b==e-1){
		int p=f-c+60;
		System.out.println(p+"s");
		}
		}
	}

	}
	}
	


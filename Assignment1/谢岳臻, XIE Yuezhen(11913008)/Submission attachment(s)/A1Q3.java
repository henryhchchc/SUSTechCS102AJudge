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
public class A1Q3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner input = new Scanner(System.in);
		double money=0,sum=0;
			while(input.hasNext()){
		double price = input.nextDouble();
		double many = input.nextDouble();
		double a=(many-Math.floor(many))*price;
		String b=String.format("%.2f",a);
	    money=Math.floor(many)*price+Math.round((many-Math.floor(many))*price)+(many-Math.floor(many))*2;
		sum+=money;

		
	}
			double a=10*sum;
			double b=Math.round(a);
			double c=b/10;
			System.out.println(c);
	}
			

}

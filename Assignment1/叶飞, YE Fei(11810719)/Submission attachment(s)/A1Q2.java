

import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
	Scanner time= new Scanner(System.in);
	int num1 = time.nextInt();
	int num2 = time.nextInt();
	int num3 = time.nextInt();
	int num4 = time.nextInt();
	int num5 = time.nextInt();
	int num6 = time.nextInt();
	    int num7 = (num4-num1)*60;
	    int num8 = num5-num2+num7;
	    int num9 = num6-num3;
		if(num9>=0){
			System.out.println(num8+"m"+num9+"s");
		}
		if(num9<0){
	        num9=60+num9;num8=num8-1;System.out.println(num8+"m"+num9+"s");
	    }

        else{System.out.println("Error!");}
    }
}

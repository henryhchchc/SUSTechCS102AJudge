//package Assignment;

import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){

        int[] Time = new int[3];

        Scanner scan = new Scanner(System.in);

        String starttime = scan.nextLine();

        String endtime = scan.nextLine();

        String[] ST = starttime.split(" ");

        String[] ET = endtime.split(" ");


        for(int i = 0; i< 3; i++){

            int a = Integer.parseInt(ST[i]);
            int b = Integer.parseInt(ET[i]);



            Time[i]=b-a;

        }
        if(Time[2]<0){
            Time[1]--;
            Time[2]+=60;
        }
        if(Time[1]<0){
            Time[0]--;
            Time[1]+=60;
        }


        if(Time[0] == 0&& Time[1] == 0){
            System.out.print(Time[2] + "s");
        }
        else if(Time[1] != 0&& Time[2] != 0){
            System.out.print(Time[0]*60+Time[1]+"m"+Time[2] + "S");
        }
        else if(Time[0] !=0&& Time[1] == 0&& Time[2] != 0){
            System.out.print(Time[0]*60 + "m"+Time[2]+ "s");
        }
        else if( Time[1] != 0&& Time[2] == 0){
            System.out.print(Time[0]*60 + "m");
        }






    }
}

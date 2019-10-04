import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int d1 = (d - a) * 60 + e - b;
        int d2 = f - c;
        {
            if (d1 == 0 && d2 == 0) {
                System.out.println("0s");

            } else {
                if (d1 == 0) {
                    System.out.println(d2 + "s");

                } else {
                    if (d2 == 0) {
                        System.out.println(d1 + "m");
                    } else {
                        if(d2<0){
                            int d3=d2+60;
                            int d4=d1-1;
                            if(d4==0){System.out.println(d3+"s");
                            }else {
                                System.out.println(d4+"m"+d3+"s");
                            }
                        }else{System.out.println(d1 + "m" + d2 + "s");
                        }
                    }


                }


            }
        }
    }
}
public class A1Q4 {
    public static void main(String []args) {

        int sum=0;
        int ff = 0;
        int b = 0;
        int a = 0;
        int count=0;

            for(count=0;count<args.length;count+=1) {
                a = Integer.parseInt(args[count]);
                sum = sum + a;
                if (a >= b) {
                    if (a >= 8000) {
                        ff = 1;
                    } else if (a >= 3000) {
                        ff = 2;
                    } else if (a >= 1000) {
                        ff = 3;
                        b = a;
                    }
                }
            }


                if ((sum >= 5000 && count >= 10) || ff == 1) {
                    System.out.println("Diamond");
                } else if ((sum >= 2000 && count >= 5) || ff == 2) {
                    System.out.println("Gold");
                } else if ((sum >= 800 && count >= 2) || ff == 3) {
                    System.out.println("Silver");
                }


    }}

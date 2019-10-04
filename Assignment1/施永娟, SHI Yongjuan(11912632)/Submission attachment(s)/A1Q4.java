public class A1Q4 {
    public static void main(String[] args){
        int total=0;
        int counter=1;
        int max=Integer.parseInt(args[0]);
        while(counter<=args.length) {
            for (int i = 1; i <= args.length; i++) {
                int single = Integer.parseInt(args[i - 1]);
                total += single;
                counter++;
                if(single>max){
                    max=single;
                }
            }
        }
        if (total >= 5000&&counter>=10||max>=8000) {
                System.out.print("Diamond");
        }else if (total>=2000&&counter>=5||max>=3000){
                System.out.print("Gold");
        }else if(total>=800&&counter>=2||max>=1000){
                System.out.print("Silver");
            }
        }

    }

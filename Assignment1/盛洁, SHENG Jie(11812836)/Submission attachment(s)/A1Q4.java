package Assignment;

public class A1Q4 {
    public static void main(String []args){
        int i=0, cost, c=0, max=0;
        int length = args.length;

        while(i < length){
            cost = Integer.parseInt(args[i]);
            c = c + cost;
            ++ i;
            if (cost >= max){
                max = cost;
            }
        }

        if(max >= 8000){
            System.out.print("Diamond");
        }
        else if(i >= 10 && c >= 5000){
            System.out.print("Diamond");
        }
        else if(max >= 3000){
            System.out.print("Gold");
        }
        else if(i >= 5 && c >= 2000){
            System.out.print("Gold");
        }
        else if(max >= 1000){
            System.out.print("Silver");
        }
        else if(i >= 2 && c >=800){
            System.out.print("Sliver");
        }
    }
}

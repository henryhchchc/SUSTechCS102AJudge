public class A1Q4 {
    public static void main(String[] args){
        int i,n;
        int cost = 0;
        int max = 0;

        for (i = 0;i < args.length;i++){
        int payment = Integer.parseInt(args[i]);
        if (payment > max){
            max = payment;
            }
        cost += payment;
        }



        if(i > 9 && cost >= 5000){
            System.out.println("Diamond");

        }else if(max >= 8000){
            System.out.println("Diamond");

        }else if(i > 4 && cost >= 2000){
            System.out.println("Gold");

        }else if(max >= 3000){
            System.out.println("Gold");

        }else if(i > 1 && cost >= 800){
            System.out.println("Silver");

        }else if(max >= 1000){
            System.out.println("Silver");

        }else{


        }

}
}

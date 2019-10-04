public class A1Q4 {
    public static void main(String[] args) {
     int num=0;
     int sum=0;
     int max=0;
     int numb=0;
     for(int i=0;i<args.length;i++) {
         num = Integer.parseInt(args[i]);
         sum = sum + num;
     }
     for(int j=0;j<args.length;j++){
         numb = Integer.parseInt(args[j]);
         if(max<numb)
             max=numb;
     }

         if (sum >= 5000 && args.length >= 10)
             System.out.println("Diamond");
         else if (max >= 8000)
             System.out.println("Diamond");
         else if (sum >= 2000 && sum < 5000 && args.length > 5)
             System.out.println("Gold");
         else if (max >= 3000)
             System.out.println("Gold");
         else if (sum >=800 && sum < 2000 && args.length > 2)
             System.out.println("Silver");
         else if (max >= 1000)
             System.out.println("Silver");



    }
}


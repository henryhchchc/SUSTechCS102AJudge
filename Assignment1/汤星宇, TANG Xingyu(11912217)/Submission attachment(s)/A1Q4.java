public class A1Q4 {
    public static void main(String[] args){
        int total=0;
        int max=0;
        int counter=args.length;
        int i=0;
        int j=0;
        while (i<counter){
            int x =Integer.parseInt(args[i]);
            if (max<=x){
                max=x;
            }i++;
        }
        while(j<counter){
            int x =Integer.parseInt(args[j]);
            total+=x;
            j++;
        }
      if(counter>=10&&total>=5000||max>=8000){
          System.out.println("Diamond");
      } else if(counter>=5&&total>=2000||max>=3000){
          System.out.println("Gold");
      }else if(counter>=2&&total>800||max>=1000)
          System.out.println("Silver");



    }
}

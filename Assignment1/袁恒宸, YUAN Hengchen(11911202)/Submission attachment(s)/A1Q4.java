public class A1Q4 {
    public static void main(String a[]){
        int[] args = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            args[i] = Integer.parseInt(a[i]);
        }
        int length=args.length;
       int max=0;
 for (int i:args){
     if (i>=max){
         max=i;
     }
 }
int he =0;
         for(int j:args)
         {he+=j;}
         int rank=0;
         if (length>=10){
             if (he>=5000){
                 rank+=10000;
             }
         }
        if (length>=5){
            if (he>=2000){
                rank+=1000;
            }
        }
        if (length>=2){
            if (he>=800){
                rank+=100;
            }
        }
        if (max>=8000){
          rank+=10000;
        }
        if (max>=3000){
            rank+=1000;
        }
        if (max>=1000){
            rank+=100;
        }

        if (rank>=10000){
        System.out.printf("Diamond");}
        else if (rank>=1000){
            System.out.printf("Gold");}
        else if (rank>=100){
            System.out.printf("Silver");}
    }
}

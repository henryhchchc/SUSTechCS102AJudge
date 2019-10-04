

public class A1Q4 {
    public static void main(String[] args){
        //i a sum
        //if (i>=10, sum>=5000)or(a>=8000) diamond
        //if (i>=5, sum>=2000)or(a>=3000) gold
        //if (i>=2, sum>=800)or(a>=1000) silver
        boolean diamond=false;                  //boolean
        boolean gold=false;
        boolean silver=false;
        int sum=0;
        int i=0;
        while (i<args.length)
        {
            int a=Integer.parseInt(args[i]);    //input a (a single amount)
            if (a>=8000)
                diamond=true;
            if(a>=3000)
                gold=true;
            if(a>=1000)
                silver=true;
            sum+=a;                             //add a to the sum
            i++;
        }//end for
        if((sum>=5000)&&(args.length>=10))
            diamond=true;
        if((sum>=2000)&&(args.length>=5))
            gold=true;
        if((sum>=800)&&(args.length>=2))
            silver=true;
        if(diamond)
            System.out.println("Diamond");
        else
            if(gold)
                System.out.println("Gold");
            else
                if(silver)
                    System.out.println("Silver");
    }//end main
}

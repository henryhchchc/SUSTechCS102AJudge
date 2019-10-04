public class A1Q4 {
    public static void main(String[] args) {

        int count = 0;
        int consumption = 0;
        int diamond = 0, gold = 0, silver = 0;
        int length = args.length;

        for(count = 0;count<length;++count)
        {
            if(Integer.parseInt(args[count])>=8000){
                diamond = 1;
            }
            if(Integer.parseInt(args[count])>=3000){
                gold = 1;
            }
            if(Integer.parseInt(args[count])>=1000){
                silver = 1;
            }
            if(length>=10 && consumption>=5000){
                diamond = 1;
            }
            if(length>=5 && consumption>=2000){
                gold = 1;
            }
            if(length>=2 && consumption>=800){
                silver = 1;
            }
            consumption = consumption + Integer.parseInt(args[count]);
        }

        if(diamond == 1)
            System.out.print("Diamond");
        else if(gold == 1)
            System.out.print("Gold");
        else if(silver == 1)
            System.out.print("Silver");

        }
}


public class A1Q4{
    public static void main(String[] args){
        int number=args.length;
        int amount=0;
        int max=0;
        int i=0;
        while(i<number){
            i++;
            amount=Integer.parseInt(args[i-1])+amount;
            if(Integer.parseInt(args[i-1])>max){
                max=Integer.parseInt(args[i-1]);
            }
        }
        if((number>=10&amount>=5000)||amount>=8000){
            System.out.print("Silver");
        }else if(number>=5&amount>=2000||amount>=3000){
            System.out.print("Gold");
        }else if((number>=2&amount>=800)||amount>=1000){
            System.out.print("Diamond");
        }
    }
}

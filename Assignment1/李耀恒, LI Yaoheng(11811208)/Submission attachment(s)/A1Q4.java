public class A1Q4 {
    public static void main(String[] args){
        int times =args.length;
        int most =0;
        int price =0;
        for(int i=1;i<=times;i++){
            price=Integer.parseInt(args[i-1])+price;
            if(Integer.parseInt(args[i-1])>=most)
            {most=Integer.parseInt(args[i-1]);}
        }
        if((times>=10&&price>=5000)||most>=8000){
            System.out.print("Diamond");
        }
        else if((times>=5&&price>=2000)||most>=3000){
            System.out.print("Gold");
        }
        else if((times>=2&&price>=800)||most>=1000){
            System.out.print("Silver");
        }

    }
}

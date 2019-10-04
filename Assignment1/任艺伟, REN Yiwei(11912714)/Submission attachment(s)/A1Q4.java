public class A1Q4 {

    public static void main(String[] args) {
        int length=args.length;
        float sum=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        for(int i = 0; i<length; i++){
            float  a = Float.parseFloat(args[i]);
            if(a>=5000){b=1;}
            else if(a>=3000){c=1;}
            else if(a>=1000){d=1;}
            else{e=1;}
            sum=sum+a;
        }
        if ((length>=10&&sum>=5000)||b==1){
            System.out.println("Diamond");
        }else if((length>=5&&sum>=2000)||c==1){
            System.out.println("Gold");
        }else if((length>=2&&sum>=800)||d==1){
            System.out.println("Silver");
        }else{
            System.out.println(" ");
        }
    }
}


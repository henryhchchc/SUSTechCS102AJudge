public class A1Q4 {
    public static void main(String[]args){
        int s =0 ,m=0;
        int length=args.length;
        for(int i = 0;i<length;i++){
            int x = Integer.parseInt(args[i]);
            s=s+x;
            if(x>=8000){
                m=3;
                break;
            }
            if((x>=3000)&&(x<8000)){
                m=2;
            }
            if((x>=1000)&&(x<3000)){
                m=1;
            }
        }
        if((length >=10)&&(s >=5000)){
            m=3;
        }
        if(((length >=5)&&(s >=2000))&&((length<10)||(s<5000))){
            if(m<=2){
                m=2;
            }
        }
        if(((length >=2)&&(s >=800))&&((length<5)||(s<2000))){
            if(m<=1){
                m=1;
            }
        }
        if(m==3){
            System.out.print("Diamond");
        }
        if(m==2){
            System.out.print("Gold");
        }
        if(m==1){
            System.out.print("Silver");
        }
    }
}

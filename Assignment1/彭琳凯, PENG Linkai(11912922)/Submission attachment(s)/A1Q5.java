public class A1Q5 {
    public static void main(String[] args){
        int length=args.length;
        for(int i=0;i<length;i++){
            double price=Double.parseDouble(args[i]);
            int tmp=(int)price;
            int flag=0;
            if(tmp%10==2){
                price+=4;
                flag=1;
            }
            else if(tmp%10==4){
                price+=5;
                flag=1;
            }
            if(flag==1){
                System.out.printf("%.1f ",price);
            }
        }
    }
}

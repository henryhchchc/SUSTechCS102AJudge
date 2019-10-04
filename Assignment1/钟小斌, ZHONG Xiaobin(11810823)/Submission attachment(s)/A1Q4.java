public class A1Q4{
    public static  void main(String[] args){
        double sum=0;
        double max=0;
        double max1;
        for(int i=0;i<args.length;i++){
            max1=Double.parseDouble(args[i]);
            if (max1>max){
                max=max1;
            }
            sum+=Double.parseDouble(args[i]);
        }
        if ((args.length>=10&&sum>=5000)||max>=8000){
            System.out.print("Diamond");
        }
        else if ((args.length>=5&&sum>=2000)||(max>=3000)){
            System.out.print("Gold");
        }
        else if ((args.length>=2&&sum>=800)||(max>=1000)){
            System.out.print("Silver");
        }
    }
}

public class A1Q4 {
    public static void main(String[] args) {
       int n=args.length;
       int sum=0;
       int max=Integer.parseInt(args[0]);
       for(int i=1;i<=n;i++){
           sum=sum+Integer.parseInt(args[i-1]);
       }
       for(int i=1;i<=n;i++){
           if(Integer.parseInt(args[i-1])>max){
               max=Integer.parseInt(args[i-1]);
           }
       }
       if ((n>=10&&sum>=5000)||max>=8000){
           System.out.println("Diamond");
       }else if ((n>=5&&sum>=2000)||max>=3000){
           System.out.println("Gold");
       }else if ((n>=2&&sum>=800)||max>=1000){
           System.out.println("Silver");
       }
    }
}

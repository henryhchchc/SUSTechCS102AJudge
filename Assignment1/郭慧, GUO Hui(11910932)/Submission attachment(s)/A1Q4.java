public class A1Q4 {
    public static void main(String[]args){
        int a=args.length;
        int max=0;
        int total=0;

        for(int n=0;n!=a;n++){
            int b=Integer.parseInt(args[n]);
            if(max<b){
                max=b;
            }//Find the maximum number

            total+=b;
            //calculate the total number
        }
        if(a>=10&&total>=5000||max>=8000){
            System.out.print("Diamond");
        }
        else if(a>=5&&total>=2000||max>=3000){
            System.out.print("Gold");
        }
        else if(a>=2&&total>=800||max>=1000){
            System.out.print("Silver");
        }//print the matching level of vip
    }
}

public class A1Q4 {
    public static void main (String[] args){
        int[] A = new int[args.length];
        for(int i=0;i<args.length;i++){
            A[i] = Integer.parseInt(args[i]);
        }
        int sum=0; int max=0;
        for(int j =0;j<A.length;j++){
            if(A[j]>=max){
                max=A[j];
            }
            sum+=A[j];
        }
        if((sum>=5000&&A.length>=10)||max>=8000){
            System.out.print("Diamond");
        }
        if((sum>=2000&&sum<5000&&A.length>=5&&A.length<10)||(max>=3000&&max<8000)){
            System.out.print("Gold");
        }
        if((sum>=800&&sum<2000&&A.length>=2&&A.length<5)||(max>=1000&&max<3000)){
            System.out.print("Silver");
        }

    }
}
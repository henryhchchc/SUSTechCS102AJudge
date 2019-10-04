public class A1Q5 {
    public static void main (String args[]){
        double[] A = new double[args.length];
        int[]B = new int[A.length];
        for(int i=0;i<args.length;i++){
            A[i]=Double.parseDouble(args[i]);
        }
        for(int j=0;j<A.length;j++){
            B[j]= (int)A[j];
        }
        for(int k=0;k<B.length;k++){
            if(B[k]%10==2){
                A[k]=A[k]+4;
                System.out.print(A[k]+" ");
            }
            if(B[k]%10==4){
                A[k]=A[k]+5;
                System.out.print(A[k]+" ");
            }

        }
    }
}

public class A1Q4 {
    public static void main(String args[]){
        int sum = 0;
        int[] a =new int[args.length];
        for(int i =0;i<args.length;i++){
            a[i]=Integer.parseInt(args[i]);
        }
        int max=a[0];
        for(int j =0;j<args.length;j++){
            if(max<a[j]){
                max = a[j];
            }
        }
        int length = args.length;
        for(int k=0;k<length;k++){
            sum = sum + a[k];
        }
        if(((sum>=5000)&&(length>=10))||(max>=8000)){
            System.out.print("Diamond");
        }
        else{
            if(((sum>=2000)&&(length>=5))||(max>=3000)){
                System.out.print("Gold");
            }
            else{
                if(((sum>=800)&&(length>=2))||(max>=1000)){
                    System.out.print("Silver");
                }

            }
        }





    }
}


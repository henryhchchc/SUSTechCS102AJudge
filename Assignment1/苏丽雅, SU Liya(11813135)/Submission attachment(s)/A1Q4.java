public class A1Q4 {
    public static void main(String[] args) {
        int sum = 0;
        int times=0;
        int[] a =new int[args.length];
        for(int i=0;i<args.length;i++) {
            a[i] = Integer.parseInt(args[i]);
            sum=sum+Integer.parseInt(args[i]);
            times =i;}
        int max=a[0];
        for(int j = 1;j<a.length;j++) {
            if (max < a[j]) {
                max = a[j];
            }
        }
        if(times>=10 && sum>=5000||max>=8000){
            System.out.print("Diamond");
        }
        else if(times>=5 && times<10 && sum>=2000||max>=3000){
            System.out.print("Gold");
        }
        else if(times<5 && times>=2 && sum>=800||max>=1000){
            System.out.print("Silver");
        }
    }
}


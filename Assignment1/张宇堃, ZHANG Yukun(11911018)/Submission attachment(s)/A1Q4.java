public class A1Q4 {

    public static void main(String[] args) {
        int sum =0;
        int[] a=new int[args.length];
        for(int i=0;i<args.length;i++){
            a[i] = Integer.parseInt(args[i]);
           sum +=Integer.parseInt(args[i]);}
        int max = Integer.parseInt(args[0]);
        for(int b=1;b <args.length;b++){
            if(max <a[b]){
                max = a[b];
            }
        }
        if(args.length >=2&& args.length <5 && sum >=800 ||max >=1000 && max <3000){
            System.out.print("Silver");
        }
        if(args.length >=5&& args.length <8 && sum >=2000 ||max >=3000 && max <8000){
            System.out.print("Golden");// write your code here
        }
        if(args.length >=10 && sum >=5000 ||max >=8000){
            System.out.print("Diamond");
        }
    }
}

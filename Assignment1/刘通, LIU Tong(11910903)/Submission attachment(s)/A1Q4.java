public class A1Q4 {
    public static void main(String[] args){
        int i = 0,a,b,c,sum = 0,mm = 0;
        int length = args.length;
        for(int j = 0; j < length; j++){
            a = Integer.valueOf(args[j]);
            i++;
            sum +=a;
            mm = Math.max(mm,a);
        }
        if ((i>=10 & sum>=5000) || mm>=8000) {System.out.print("Diamond");System.exit(0);}
        if ((i>=5 & sum>=2000) || mm>=3000) {System.out.print("Gold");System.exit(0);}
        if ((i>=2 & sum>=800) || mm>=1000) {System.out.print("Silver");System.exit(0);}
    }
}

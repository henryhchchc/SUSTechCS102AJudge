public class A1Q4 {
    public static void main(String[] args) {
        int n = args.length;
        int i = 0;
        int sum = 0;
        int max = 0;
        while (i <= (n - 1)) {
            int j = Integer.parseInt(args[i]);
            sum = sum + j;
            max = Math.max(max, j);
            i++;
        }
        if((n>=10 && sum>=5000) || max>=8000){
            System.out.print("Diamond");
        }
        else{if((n>=5 && sum>=2000) || max>=3000){
            System.out.print("Gold");
             }
            else if((n>=2 && sum >=800)|| max>=1000){
            System.out.print("Silver");}
            }

        }
}




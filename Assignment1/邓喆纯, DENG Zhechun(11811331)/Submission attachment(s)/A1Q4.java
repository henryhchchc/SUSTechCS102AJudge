public class A1Q4 {
    public static void main(String[] args) {

        int times = args.length;
        int sum = 0;
        int max = 0;
        for (int i=0; i< args.length;i++){
            sum += Integer.parseInt(args[i]);
            if(max<Integer.parseInt(args[i])){
                max = Integer.parseInt(args[i]);
            }
        }
        if((times>=10&&sum>=5000) || max >= 8000){
            System.out.print("Diamond");
        }
        else if((times>=5&&sum>=3000) || max >= 3000){
            System.out.print("Gold");
        }
        else if((times>=2&&sum>=800) || max >= 1000){
            System.out.print("Silver");
        }
    }
}


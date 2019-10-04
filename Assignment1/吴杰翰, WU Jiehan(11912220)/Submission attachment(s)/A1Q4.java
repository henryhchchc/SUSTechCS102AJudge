public class A1Q4 {
    public static void main(String[] args) {
        int i = 0;
        int total=0;
        int length=args.length;
        int max=0;
        while (i < args.length) {
            int cost = Integer.parseInt(args[i]);
            total=total+cost;
            if (cost>max){
                max=cost;
            }
            i++;
        }if (max>=8000||(length>=10&&total>=5000)) {
            System.out.println("Diamond");
        } else if (max>=3000||(length>=5&&total>=2000)) {
            System.out.println("Gold");
        } else if (max>=1000||(length>=2&&total>=800)) {
            System.out.println("Silver");
        }
    }
}

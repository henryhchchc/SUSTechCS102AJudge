public class A1Q5 {
    public static void main(String[] args) {
        int p=0;
        for(int i=0;i<args.length;i++){
            double price=Double.parseDouble(args[i]);
            if(Math.floor(price%10)==2){
                price+=4;
                if (p!=0){
                    System.out.print(" ");
                }
                System.out.print(price);
                p++;
            }
            else if (Math.floor(price%10)==4){
                price+=5;
                if (p!=0){
                    System.out.print(" ");
                }
                System.out.print(price);
                p++;
            }
        }
    }
}

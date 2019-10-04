public class A1Q5 {
    public static void main(String[]args){
        int length=args.length;
        for(int i=0;i<length;i++){
            float price=Float.parseFloat(args[i]);
            int unit=(int)price%10;
            switch (unit){
                case 2:
                    price+=4;
                    System.out.printf("%.1f ",price);
                    break;
                case 4:
                    price+=5;
                    System.out.printf("%.1f ",price);
                    break;
            }
        }
    }
}

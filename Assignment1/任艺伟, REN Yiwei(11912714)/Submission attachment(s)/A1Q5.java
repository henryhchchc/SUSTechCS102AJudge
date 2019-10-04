public class A1Q5 {

    public static void main(String[] args) {
        int length = args.length;
        float price;
        for(int i=0;i<length;i++){
            float a = Float.parseFloat(args[i]);
            int b = (int)a/10;
            int c = (int)(a-b*10)/1;
            float e = a-b*10-c;
            switch(c){
                case 2:
                    price = b*10+6f+e;
                    System.out.printf("%.1f ",price);
                    break;
                case 4:
                    price = b*10+9f+e;
                    System.out.printf("%.1f",price);
                    break;
                default:
                    price = a;
            }


        }
    }
}


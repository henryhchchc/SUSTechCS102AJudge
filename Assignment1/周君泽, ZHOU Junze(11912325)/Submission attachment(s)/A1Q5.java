public class A1Q5 {
    public static void main(String[] args){
        int length = args.length,temp;
        float[] price = new float[length];
        length--;
        for (int i=0;i<=length;i++){
            price[i]=Float.parseFloat(args[i]);
            temp = (int)price[i];
            if (temp%10==2){
                price[i]+=4;
                System.out.printf("%.1f ",price[i]);
            }
            else if (temp%10==4){
                price[i]+=5;
                System.out.printf("%.1f ",price[i]);
            }
        }
        System.out.printf("\n");
    }
}

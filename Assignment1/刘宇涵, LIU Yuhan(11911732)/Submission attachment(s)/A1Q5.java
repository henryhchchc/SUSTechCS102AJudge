public class A1Q5{
    public static void main ( String[] args){
        int length = args.length;
        int now,i;
        float[]price = new float[length];
        for(i=0;i<length;i++)
        {
         price [i] = Float.parseFloat(args[i]);
         now = (int)price[i];
         if (now%10==2)
         {
          price[i] +=4;
          System.out.printf("%.1f ",price[i]);
         }
         else if (now%10==4)
         {
          price [i] +=5;
          System.out.printf("%.1f ",price[i]);
         }
        }
        System.out.printf("\n");
    }

}

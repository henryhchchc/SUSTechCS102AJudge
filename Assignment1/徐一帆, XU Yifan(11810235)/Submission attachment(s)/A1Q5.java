public class A1Q5 {
    public static void main(String []args){

        float[]price=new float[args.length];
        for(int i=0;i<args.length;i++) {
            price[i] = Float.parseFloat(args[i]);
            int integerprice= (int) price[i];
            int n=integerprice%10;
            if(n==2){
                float correctprice=price[i]+4;
                System.out.print(correctprice+" ");
            }else if(n==4){
                float correctprice=price[i]+5;
                System.out.print(correctprice+" ");
            }


        }

    }
}

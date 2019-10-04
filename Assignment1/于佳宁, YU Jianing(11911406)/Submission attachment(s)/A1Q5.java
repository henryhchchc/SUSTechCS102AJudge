public class A1Q5 {
    public static void main(String[] args){
        int i=0;
        int length=args.length;
        while(i<=length-1){
            float a=Float.parseFloat(args[i]);
            int b=(int)a%10;
            if(b==2){
                a=a+4;
             System.out.print(a+" ");
            }
            else if(b==4) {
                a=a+5;
                System.out.print(a+" ");
            }
            i++;
        }
    }
}

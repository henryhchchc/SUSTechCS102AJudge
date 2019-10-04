public class A1Q5 {
    public static void main(String[] args) {
        int number = args.length;
        int i = 0;
        while (i < number) {
            int a=(int)Double.parseDouble(args[i]);
            int A=a/10*10;
            int b=a-A;

            if(b==2){
                System.out.print((Double.parseDouble(args[i])+4)+"  ");
            }
            if(b==4){
                System.out.print((Double.parseDouble(args[i])+5)+"  ");
            }
            i++;
        }
    }
}
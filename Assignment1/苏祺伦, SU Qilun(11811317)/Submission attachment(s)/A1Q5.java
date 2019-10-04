
public class A1Q5 {
    public static void main(String[] args) {
        int l = args.length;
        int i,j,k;
        for (i = 0; i < l; i++) {
            double f = Double.parseDouble(args[i]);
            k=(int)f;
            j=k%10;
            if(j==2){
                f=f+4;
                System.out.print(f+" ");
            }
            else if (j==4){
                f=f+5;
                System.out.print(f+" ");
            }
            else
                System.out.print("");
        }
    }
}

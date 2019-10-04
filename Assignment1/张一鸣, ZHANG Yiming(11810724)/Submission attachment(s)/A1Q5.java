public class A1Q5 {
    public static void main(String[] args){
    int n = args.length;
    int i = 0;
    double a,b,c;

    while(i<n){
        double money = Double.parseDouble(args[i]);
        a = (int)money;
        b = a - ((int)(a/10))*10;

        if (b==2){
            c = money - 2 + 6;
            System.out.printf("%.1f ",c);}
        else if (b==4){
            c = money - 4 + 9;
            System.out.printf("%.1f ",c);}
        else ;

        i++;
    }
    }
}

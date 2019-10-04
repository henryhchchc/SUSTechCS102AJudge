public class A1Q5 {

    public static void main(String[] args) {
        Double []a = new Double[args.length];
        double b = 0;
    for(int i =0;i <args.length;i++){
        a[i] = Double.parseDouble(args[i]);
        b = Math.floor(a[i]);
        b = b%10;
        if(b ==2){
            a[i] +=4;
            System.out.print(a[i]+" " );
        }
        if(b ==4){
            a[i] +=5;
            System.out.print(a[i]+" ");
        }
    }
    }
}

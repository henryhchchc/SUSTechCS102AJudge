public class A1Q5 {
    public static void main(String[] args) {
        int length=args.length;
        double sum=0;
for(int i=0;i<length;i++){
    double price=Double.valueOf(args[i]);
    int number=(int)price%10;
    double others=price-number;

    if(number==2){
        sum=others+6;
        System.out.print(sum+" ");
    }
    if(number==4){
        sum=others+9;
        System.out.print(sum+" ");
    }

}
    }
}

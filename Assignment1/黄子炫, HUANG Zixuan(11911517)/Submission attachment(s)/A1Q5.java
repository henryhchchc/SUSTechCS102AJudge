public class A1Q5 {
    public static void main(String[] args){
        int i = 1,j=0;
        float num =0;
        while (i <= args.length){
            num = Float.parseFloat(args[j]);
            if (num % 10 >= 2 && num %10 <3){
                num = num + 4;
                System.out.print(num + " ");
            }else if (num % 10 >=4 && num %10 <5){
                num = num + 5;
                System.out.print(num + " ");
            }
            i++;
            j++;
        }
    }
}

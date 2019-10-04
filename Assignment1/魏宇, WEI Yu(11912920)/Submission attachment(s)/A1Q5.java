public class A1Q5 {
    public static void main(String[] args) {
        int i =-1;
        int length = args.length;
        while (i<length-1){
            ++i;
            if(Math.floor(Float.parseFloat(args[i]))%10==2){
                System.out.printf("  %.1f  ",Float.parseFloat(args[i]) + 4);
            }else if(Math.floor(Float.parseFloat(args[i]))%10==4){
                System.out.printf("  %.1f  ",Float.parseFloat(args[i])+5);
            }else{
                continue;}

        }
    }
}



public class A1Q5 {
    public static void main(String[]args){
        int length = args.length;
         Double t ;
        for(int i = 0;i<length;i++){
            t = Math.floor(Float.parseFloat(args[i]));
            if(t%10==2){
                System.out.print(Float.parseFloat(args[i])-2+6+" ");}
                else if(t%10==4){
                    System.out.print(Float.parseFloat(args[i])-4+9+" ");
            }
        }
    }
}

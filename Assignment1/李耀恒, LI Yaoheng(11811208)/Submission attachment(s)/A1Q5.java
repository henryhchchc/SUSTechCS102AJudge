public class A1Q5 {
    public static void main(String[] args){
        int unit = 0;
        int a = 0;
        for(int i = 1;i <= args.length;i++){
            a = (int)Double.parseDouble(args[i-1]);
            unit = a-a/10*10;
            if(unit==2){
                System.out.print((Double.parseDouble(args[i-1])*10+40)/10+" ");
            }
            if(unit==4){
                System.out.print((Double.parseDouble(args[i-1])*10+50)/10+" ");
            }
        }
    }
}

public class A1Q5 {
    public static void main(String[] args){
        int lenth = args.length;
        int i=0;
        while(i<lenth){
            float i1 = Float.parseFloat(args[i]);
            i++;
        if(((int)i1)%10==2) {
         i1=i1+4;
        System.out.print(i1+" ");}
         else if(((int)i1)%10==4) {
                i1=i1+5;
            System.out.print(i1+" ");}
        }
    }
}

public class A1Q5 {
    public static void main(String[] args){
        for (int n=0;n<args.length;n++){
            char a = args[n].charAt(args[n].length()-3);
             if (a=='2' ){
                 double p = Double.parseDouble(args[n])+4;
                    System.out.print(p+" ");
             }else if (a=='4'){
                 double p = Double.parseDouble(args[n])+5;
                 System.out.print(p+" ");
             }
        }
    }
}

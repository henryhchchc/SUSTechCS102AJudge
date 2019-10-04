
public class A1Q5 {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++){
            String temp = args[i];
            args[i]= args[i].replace("2","6");
            args[i]= args[i].replace("4","9");
            if(!temp.equals(args[i])) {
                System.out.print(args[i] + "\t");
            }
        }
    }
}

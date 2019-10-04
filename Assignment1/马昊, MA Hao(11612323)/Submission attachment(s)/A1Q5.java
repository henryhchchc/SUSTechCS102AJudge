public class A1Q5 {
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++){
            if(args[i].contains("2.")){
                System.out.print(args[i].replace("2.","6.")+" ");
            }
            if(args[i].contains("4.")){
                System.out.print(args[i].replace("4.","9.")+" ");
            }
        }
    }
}

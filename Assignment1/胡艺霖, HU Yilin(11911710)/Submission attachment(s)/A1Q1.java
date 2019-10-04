public class A1Q1 {
    public static void main(String[]args){
           String name =args[0];
           int studentcode = Integer.parseInt(args[1]);
           if (args[1].length()==8) {
               if (studentcode >= 11910001 || studentcode<=11919999)
                   System.out.printf("%s，welcome to SUSTECH Hot Pot Restaurant!", name);
           }

 else System.out.printf("%d",studentcode);



    }
}

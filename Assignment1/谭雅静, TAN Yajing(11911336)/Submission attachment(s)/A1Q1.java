public class A1Q1 {
    public static void main(String[] args){
      String name = args[0];
      int number = Integer.parseInt(args[1]);
     if(number>=11510000 && number<=11999999)
         System.out.printf("%s,welcome to SUSTECH Hot POT Restaurant!",name);
     else
         System.out.printf("%d",number);
    }
}

public class A1Q1 {
    public static void main (String [] args){
      String name=args[0];
      int ID=Integer.parseInt(args[1]);
      if (ID>=11500000 & ID<=11999999)
        System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant!\n" ,name);
      else
      System.out.println(ID);
  }

}

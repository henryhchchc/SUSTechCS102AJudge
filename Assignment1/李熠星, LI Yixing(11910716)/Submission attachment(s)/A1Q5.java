public class A1Q5 {
  public static void main(String[] args){
      int length = args.length;
      int num ;
      for (num = 0 ;num < length; num++)
      {Double a = Double.parseDouble(args[num]);
      int b  = (int) Math.floor(a) ;
      int c = b % 10;
      Double d;
      if (c ==2)
      {d = a + 4;
      System.out.print(d);}
      else if (c == 4)
      { d = a + 5;
      System.out.print(" "+d);}

      }

  }
}

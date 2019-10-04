public class A1Q1 {
    public static void main(String[]args){
      String name =args[0];
      String studentid=args[1];
      if (studentid.length() == 8)
      System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
      else
          System.out.print(studentid);
    }
}

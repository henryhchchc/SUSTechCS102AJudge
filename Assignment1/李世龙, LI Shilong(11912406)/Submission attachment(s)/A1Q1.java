public class A1Q1 {
    public static void main(String[] args){
          String name = args[0];
          int Sid = Integer.parseInt(args[1]);
          if (Sid >= 11500000 && Sid <= 11999999){
              System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
          }
          else {System.out.print(Sid);

          }


    }


}

public class A1Q5 {
    public static void main(String a[]) {
        for (int i = 0; i < a.length; i++) {
            int weishu=a[i].length()-3;
      char unit=a[i].charAt(weishu);
            double shuzi = Double.parseDouble(a[i]);
      if (unit==50){
          System.out.print(shuzi+4+" ");}
      if (unit==52)
                System.out.print(shuzi+5+" ");

        }
    }
}

public class A1Q5 {
    public static void main(String[] args) {
        int a0 = 2;
        int a1 = 4;
        int a00 = 6;
        int a11 = 9;
        String a2 = String.format("%d", a0);
        String a3 = String.format("%d", a1);
        String a4 = String.format("%d", a00);
        String a5 = String.format("%d", a11);
        int k = args.length;
        for (int i = 0; i < k; i++){
            if (args[i].contains(".")){
                int uP = args[i].lastIndexOf(".");
                char unit = args[i].charAt(uP-1);
                String s = String.valueOf(unit);
                if (s.equals(a2)){
                    StringBuilder b = new StringBuilder(args[i]);
                    b.replace(uP-1,uP,a4);
                    System.out.printf("%s ", b);
                }
                else if (s.equals(a3)) {
                    StringBuilder b = new StringBuilder(args[i]);
                    b.replace(uP-1, uP,a5);
                    System.out.printf("%s ", b);
            }else System.out.print("");
        }else {
                int uP = args[i].length()-1;
                char unit = args[i].charAt(uP);
                String s = String.valueOf(unit);
                if (s.equals(a2)){
                    StringBuilder b = new StringBuilder(args[i]);
                    b.replace(uP, uP+1, a4);
                    System.out.printf("%s", b);
                }
                else if (s.equals(a3)){
                    StringBuilder b = new StringBuilder(args[i]);
                    b.replace(uP, uP+1, a5);
                    System.out.printf("%s", b);
                }
                else System.out.print("");


            }
    }
}
}

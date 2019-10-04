public class A1Q1 {
        public static void main(String[] args) {
            String username=args[0];
            int studentid=Integer.parseInt(args[1]);
            if (11500000<= studentid && studentid<12000000) {
                System.out.printf("%s, Welcome to SUSTECH Hot Pot Restaurant!", username);
            }
            else
                System.out.printf("%d",studentid);
        }
    }


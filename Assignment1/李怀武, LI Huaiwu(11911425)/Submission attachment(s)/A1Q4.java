
    public class A1Q4 {
        public static void main(String[] args) {
            int sum = 0;
            int length = args.length;
            int j = 0;
            int i;
            for(i = 0; i < args.length - 1; ++i) {
                int numb = Integer.parseInt(args[i]);
                sum += numb;
                if (numb > j) {
                    j = numb;
                }
            }
            if (i == length - 1) {
                if ((sum < 5000 || length < 10) && j < 8000) {
                    if ((sum < 2000 || length < 5) && j < 3000) {
                        if ((sum < 800 || length < 2) && j < 1000) {
                            System.out.println("you are not a vip customer");
                        } else {
                            System.out.println("Silver");
                        }
                    } else {
                        System.out.println("Gold");
                    }
                } else {
                    System.out.println("Diamond");
                }
            }

        }
    }


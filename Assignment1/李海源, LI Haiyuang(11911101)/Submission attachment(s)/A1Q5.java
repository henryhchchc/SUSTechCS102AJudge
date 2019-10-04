
        public class A1Q5 {

            public static void main(String[] args) {
                 int x=args.length;
                for(int j=0;j<x;j++) {
                    String pri = args[j];
                    int i = pri.length();
                    Float c = Float.parseFloat(pri);
                    float a = c + 4;
                    float b = c + 5;
                    int sec = 0;
                    int second = 0;
                    {
                        if (i == 3)
                            sec = Integer.parseInt(String.valueOf(pri.charAt(0)));
                        if (sec == 2)
                            System.out.printf("%.1f ", a);
                        if (sec == 4)
                            System.out.printf("%.1f ", b);
                    }
                    {
                        if (i == 4)
                            second = Integer.parseInt(String.valueOf(pri.charAt(1)));
                        if (second == 2)
                            System.out.printf("%.1f ", a);
                        if (second == 4)
                            System.out.printf("%.1f ", b);
                    }
                }
            }
        }




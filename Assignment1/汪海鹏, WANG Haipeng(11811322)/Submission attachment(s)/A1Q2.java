import java.util.Scanner;
    public class A1Q2{
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            int f = input.nextInt();
            System.out.println("output:");
            if(f<c){
                int g = (d - a)*60 + e - b - 1;
                int h = 60 - c + f;
                    if(g>0)
                    System.out.printf("%dm%ds",g,h);
                    else if(g==0)
                    System.out.printf("%ds",h);
            }
            else if(f==c){
                int i = (d - a)*60 + e - b;
                    System.out.printf("%dm",i);
            }
            else{
                    int j = (d - a)*60 + e - b;
                    int k = f - c;
                    if(j==0)
                    System.out.printf("%ds",k);
                    else if(j>0)
                    System.out.printf("%dm%ds",j,k);
            }
        }
    }


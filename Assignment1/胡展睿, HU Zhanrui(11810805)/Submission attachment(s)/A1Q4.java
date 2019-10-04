public class A1Q4{
    public static void main(String[] args) {
        double a=0,b=0,c=0;
        for (int i=0;i<args.length; i++){
            if (Double.parseDouble(args[i])>=8000)
                a=Double.parseDouble(args[i]);
            else
            if (Double.parseDouble(args[i])>=3000)
                b=Double.parseDouble(args[i]);
            else
            if (Double.parseDouble(args[i])>=1000)
                c=Double.parseDouble(args[i]);
        }
        double s=0;
        int j=0;
        while (j<args.length){
            s+=Double.parseDouble(args[j]);
            j++;
        }
            if (args.length >= 10) {
                if (s >= 5000 | a > 0)
                    System.out.println("Diamond");
                if (s < 5000 && s >= 2000)
                    System.out.println("Gold");
                if (s < 2000 && s >= 800)
                    System.out.println("Silver");
            }else
            if (args.length >= 5) {
                if (a > 0)
                    System.out.println("Diamond");
                if (s >= 2000&&a==0)
                    System.out.println("Gold");
                if (s<2000&&s>=800)
                    System.out.println("Silver");
            }else
            if (args.length >= 2) {
                if (a>0)
                System.out.println("Diamond");
                if (a==0&&b>0)
                    System.out.println("Gold");
                if ((s>=800&&s<2000)|c>0)
                    System.out.println("Silver");
            }else
             if (args.length>0){
                 if (a>0)
                     System.out.println("Diamond");
                 if (a==0&&b>0)
                     System.out.println("Gold");
                 if (a==0&&b==0&&c>0)
                     System.out.println("Silver");
             }
    }
}

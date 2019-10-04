public class A1Q5 {
    public static void main(String[] args) {
        for (int i=0;i<args.length;i++){
            String p=args[i];
            double p1=Double.parseDouble(p);
            int p2=(int)p1;
            String p3=String.valueOf(p2);
            if(p3.endsWith("2"))
            {System.out.printf(p.replace('2','6')+" ");}
            else if(p3.endsWith("4"))
            {System.out.printf(p.replace('4','9')+" "); }
        }
    }
}

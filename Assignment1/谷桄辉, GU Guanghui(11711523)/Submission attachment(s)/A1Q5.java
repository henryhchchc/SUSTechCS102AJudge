
public class A1Q5 {
    public static void main(String[] args){
        int c;
        for (int j=0;j<args.length;j++){
            int a=0;
         for (int i=0;i<args[j].length();i++){
             String b=String.valueOf(args[j].charAt(i));
             if (b.compareTo(".")!=0){c=Integer.parseInt(b);
             if (c==2||c==4){
                 a++;
             }}
         }

            if (a>0){
                String d;
                d=args[j].replace("2","6");
                d=d.replace("4","9");
                System.out.print(d+" ");
            }}

            }



    }


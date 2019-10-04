public class A1Q5 {
    public static void main(String[]args){
        if (args.length>0){
            for (int i=0;i<args.length;i++){
                float n =Float.parseFloat(args[i]);
                int m= (int) (n%10);
                if(m==2) {n+=4;System.out.printf("%.1f ",n);}
                else if (m==4) {n+=5;System.out.printf("%.1f ",n);}
            }
        }
    }
}

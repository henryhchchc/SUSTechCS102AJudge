public class A1Q4 {
    public static void main(String[]args){
        int length=args.length;
        int a=0;
        int b=0;
        int c=0;
        float sum=0;
        for(int i=0;i<length;i++) {
            float consumption = Float.parseFloat(args[i]);
            sum += consumption;
            if (consumption >= 8000) {
                a=1;
            } else if (consumption >= 3000) {
                b=1;
            } else if (consumption >= 1000) {
                c=1;
            } else {
                ;
            }
        }
        if(a==1||(length>=10&&sum>=5000)){
            System.out.print("Diamond");
        }else if(b==1||(length>=5&&sum>=3000)){
            System.out.print("Gold");
        }else if(c==1||(length>=2&&sum>=1000)){
            System.out.print("Sliver");
        }else {
            ;
        }
    }
}

public class A1Q4 {
    public static void main(String[] args){
        double[] jine=new double[args.length];
        double max=0,zonge=0;
        int i=0;
        for(i=0;i<args.length;i++){
            jine[i]=Double.parseDouble(args[i]);
        }
        for(i=0;i<jine.length;i++){
            zonge+=jine[i];
            if(max<jine[i]){
                max=jine[i];
            }
        }
        if(jine.length>=10&&zonge>=5000||max>=8000){
            System.out.printf("Diamond");
        }
        else if(jine.length>=5&&zonge>=2000||max>=3000){
            System.out.printf("Gold");
        }
        else if(jine.length>=2&&zonge>=800||max>=1000){
            System.out.printf("Silver");
        }
    }
}

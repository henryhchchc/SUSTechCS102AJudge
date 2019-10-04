public class A1Q4 {
    public static void main (String[] args) {
        int sum=0;
        int max=0;
        for(String a:args){
            sum=sum+Integer.parseInt(a);
        }
        for(int i=0;i<=(args.length-1);i++){
            if (max<Integer.parseInt(args[i])){
                max=Integer.parseInt(args[i]);
            }
        }
        if( (args.length>=10&&sum>=5000)||max>=5000 ){
            System.out.printf("%s","Diamond");
        }
        else if( (args.length>=5&&sum>=2000)||max>=3000 ){
            System.out.printf("%s","Gold");
        }
        else if( (args.length>=2&&sum>=800)||max>=1000 ){
            System.out.printf("%s","Silver");
        }


    }

}

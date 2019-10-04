public class A1Q4 {
    public static void main(String[] args) {
        int sum = 0 ;
        int a = 0 , b = 0 , c = 0 , flag = 0;
        int length = args.length;
        for(int i = 0 ; i < length ; i++){
            int tmp = Integer.parseInt(args[i]);
            sum += tmp;
            if( tmp >= 8000){
                a = 1;
            }
            else if(tmp >= 3000){
                b = 1;
            }
            else if(tmp >= 1000){
                c = 1;
            }
        }
        if(sum>=5000&&length>=10){
            a=1;
        }
        else if(sum>=2000&&length>=5){
            b=1;
        }
        else if(sum>=800&&length>=2){
            c=1;
        }
        if(a==1){
            System.out.printf("Diamond");
        }
        else if(b==1){
            System.out.printf("Gold");
        }
        else if(c==1){
            System.out.printf("Silver");
        }
    }
}

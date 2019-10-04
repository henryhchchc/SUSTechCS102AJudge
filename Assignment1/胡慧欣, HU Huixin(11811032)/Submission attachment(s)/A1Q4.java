public class A1Q4 {
    public static void main(String[] args) {
        int sum=0;
        int amount=0;
        int length=0;
        int level = 0;
        for(int i=0;i<args.length;i++) {
            amount = Integer.parseInt(args[i]);
            sum+=amount;
            length=args.length;
        }
        for(int i=0;i<args.length;i++){
            int a=Integer.parseInt(args[i]);
            if(a>=8000) {
                level = 3;
            }
            else if(length>=10&&sum>=5000){
                level = 3;
            }
            else if(a>=3000&&a<8000){
                if(level<=2)
                    level = 2;
            }
            else if(length>=5&&sum>=2000){
                if(level<=2)
                    level = 2;
            }
            else if(a>=1000&&a<3000) {
                if(level==0)
                    level = 1;
            }
            else if(length>=2&&sum>=800){
                if(level==0)
                    level = 1;
            }
        }
        if(level==3)
            System.out.println("Diamond");
        else if(level==2)
            System.out.println("Gold");
        else if(level==1)
        System.out.println("Silver");

        }
    }

public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int p[]=new int[100];
        int total=0;
        for(int i=0;i<length;i++){
            total=total+p[i];
            p[i]=Integer.parseInt(args[i]);
            if(p[i]>=8000||length>=10&&total>=5000){
                System.out.println("Diamond");
            break;}
            else if(p[i]>=3000||length>=5&&total>=2000){
                System.out.println("Gold");
            break;}
            else if(p[i]>=1000||length>=2&&total>=800){
                System.out.println("Sliver");
            break;}


        }
    }
}


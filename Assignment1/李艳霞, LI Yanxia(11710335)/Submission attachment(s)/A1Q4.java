public class A1Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        int max = 0;
        String vip = "";
        while(in.hasNext()){
            int a = in.nextInt();
            sum = sum + a;
            num = num + a;
            if(a>max){
                max = a;
            }
        }
        if( (num >=10 && sum >=5000) || (max>=8000) ){
            vip = "Diamond";
        }else if( (num >=5 && sum >=2000) || (max>=3000) ) {
            vip = "Gold";
        }else if( (num >=2 && sum >=800) || (max>=1000) ){
            vip = "Siliver";
        }
        System.out.println(vip);
    }
}

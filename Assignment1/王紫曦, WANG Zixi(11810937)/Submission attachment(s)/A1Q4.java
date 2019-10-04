public class A1Q4 {
    public static void main(String[] args) {
        int length=args.length;
        int sum=0;
        int max = 0;
        String string = " ";
        for(int i=0;i<args.length;i++){
            sum += Integer.parseInt(args[i]);
            if(Integer.parseInt(args[i])>max){
                max = Integer.parseInt(args[i]); }
        }
        if(max>8000){
            string ="Diamond";}
        else if(max>3000){
            string = "Gold"; }
        else if(max>1000){
            string = "Silver"; }
        else if((length>=10)&&(sum>=5000)){
           string ="Diamond";}
        else if((length>=5)&&(sum>=2000)){
            string = "Gold";}
        else if((length>=2)&&(sum>=800)){
            string = "Silver";}
        System.out.print(string);
    }
}

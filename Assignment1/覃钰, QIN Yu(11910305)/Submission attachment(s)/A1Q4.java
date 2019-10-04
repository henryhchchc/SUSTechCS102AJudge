import java.util.Scanner;

public class A1Q4 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int total=0;
        int times=0;
        int money;
        int maxmoney=0;
//        while (true){
//            String str=scanner.nextLine().trim();
//            String str = args[0];
//            if((str.length()!=1)){
        for (int i=0;i<args.length;i+=1){
//                System.out.println("ikkkk");
            times+=1;
                money=Integer.parseInt(args[i]);
                total+=money;
//            System.out.println(args.length);
//            System.out.println(i);
            if (money>maxmoney){
                    maxmoney=money;
        }}
//        System.out.println("nnn");
//                times+=1;
//                if (maxmoney<money){
//                    maxmoney=money;}}
//            if((str.length()==0)){
                if(((times>=10)&&(total>=5000))||(maxmoney>=8000)){
                    System.out.println("Diamond");
//                    break;
                }
                else if(((times>=5)&&(total>=2000))||(maxmoney>=3000)){
                    System.out.println("Gold");
//                    break;
                }
                else if(((times>=2)&&(total>=800))||(maxmoney>=1000)){
                    System.out.println("Silver");
//                    break;
                }
//            }
        }
}

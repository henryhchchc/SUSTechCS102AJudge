import java.util.Scanner;
public class A1Q3 {
    public static void main(String args[]){
        Scanner sb =new Scanner(System.in);
        double money=0;
while (sb.hasNext()){
    double price = sb.nextDouble();
    double fenshu= sb.nextDouble();
            int zhengshu=(int)Math.floor(fenshu);//xiangxiaquzheng
    double banshu=fenshu-zhengshu;//zhaodaoxiaoshu
    double banshudemoney=Math.round(banshu*price)+banshu*2;//shufule
     money=money+zhengshu*price+banshudemoney;

}

System.out.printf("%.1f",money);
    }
}

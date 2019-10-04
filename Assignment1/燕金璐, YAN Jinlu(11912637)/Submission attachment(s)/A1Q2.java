import java.util.Scanner;
public class A1Q2{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);  //N：接收数据
        int a,b,c,d,e,f;
        a=input.nextInt();   //开始HH        //N:nextInt()只读取数值,不读取空格和空格后内容，也不读取/n等
        b=input.nextInt();   //开始MM
        c=input.nextInt();   //开始SS
        d=input.nextInt();   //结束HH
        e=input.nextInt();   //结束MM
        f=input.nextInt();   //结束SS
        int x=d-a;
        int y=e-b;
        int z=f-c;
        if (x>0){
            if (y>0){
                if (z>=0){
                    System.out.printf("客人等待的时间为：%dm%ds",x*60+y,z);
                }else{
                    System.out.printf("客人等待的时间为：%dm%ds",x*60+y-1,z+60); }

            }else{
                if (z>=0){
                    System.out.printf("客人等待的时间为：%dm%ds",(x-1)*60+y+60,z);
                }else{
                    System.out.printf("客人等待的时间为：%dm%ds",(x-1)*60+y+59,z+60); } }
        }else {   //x=0的情况
            if (z>=0){
                System.out.printf("客人等待的时间为：%dm%ds",x*60+y,z);
            }else{
                System.out.printf("客人等待的时间为：%dm%ds",x*60+y-1,z+60); }

        }



    }


}

import java.util.Scanner;
public class A1Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count;  //ci shu
        double x;
        double y;
        count = 0;
        y = 0; //zong jia
        int a, b;
        a = 0;
        b = 0; //a,b is for grade selection
        int length = args.length;
        int i =0;
        while(i<=length -1){
        x=Double.parseDouble(args[i]);
        if(x>=8000){a=3;}
        else if(x>=3000&&x<8000){a=2;}
        else if (x>=1000&&x<3000){a=1;}
        y=y+x;
        count=count+1;
        i=i+1;
        } //while
        if(y>=5000&&count>=10){b=3;}
        else if(y>=2000&&y<5000&&count>=5){b=2;}
        else if(y>=800&&y<2000&&count>=2){b=1;}
        if(b>a){a=b;}
        if(a==1){System.out.printf("Silver");}
        else if(a==2){System.out.printf("Gold");}
        else if(a==3){System.out.printf("Diamond");}
    }
}
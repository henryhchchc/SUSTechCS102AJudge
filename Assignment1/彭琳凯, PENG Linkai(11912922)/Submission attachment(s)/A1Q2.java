import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a1,b1,c1,a2,b2,c2;
        a1 = input.nextInt();
        b1 = input.nextInt();
        c1 = input.nextInt();
        a2 = input.nextInt();
        b2 = input.nextInt();
        c2 = input.nextInt();
        int minute,second;
        if(c2 < c1){
            c2 += 60;
            b2 -= 1;
        }
        if(b2 < b1) {
            b2 += 60;
            a2 -= 1;
        }

        minute = (a2-a1)*60 + b2-b1;
        second = c2-c1;
        if((minute == 0)&&(second == 0)){
            System.out.printf("0s");
        }
        else if((minute == 0)&&(second != 0)){
            System.out.printf("%ds",second);
        }
        else if((minute != 0)&&(second == 0)){
            System.out.printf("%dm",minute);
        }
        else{
            System.out.printf("%dm%ds",minute,second);
        }
    }
}

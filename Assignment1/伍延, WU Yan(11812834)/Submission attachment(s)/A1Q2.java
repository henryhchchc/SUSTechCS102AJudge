import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //起始时间和结束时间，用秒来计算
        int startTime = 0;
        int endTime = 0;
        //用数组存一下每次的值
        String[] times = new String[2];
        int i = 0;
        //等待输入
        while(scan.hasNext()) {
          times[i] = scan.nextLine();
          i++;
          //写够两行不再等待输入
          if (i > 1) {
              break;
          }
        }
        String[] start = times[0].split(" ");
        String[] end = times[1].split(" ");
        //求出具体相差的秒数
        startTime = Integer.parseInt(start[0]) * 3600 + Integer.parseInt(start[1]) * 60 + Integer.parseInt(start[2]);
        endTime = Integer.parseInt(end[0]) * 3600 + Integer.parseInt(end[1]) * 60 + Integer.parseInt(end[2]);
        int time = endTime - startTime;
        //分别取整数和取余
        int minute = time / 60;
        int second = time % 60;
        if (minute != 0 && second != 0) {
            System.out.println(minute + "m" + second + "s");
        }
        if (minute == 0) {
            System.out.println(second + "s");
        }
        if (minute != 0 && second == 0){
            System.out.println(minute + "m");
        }

    }
}

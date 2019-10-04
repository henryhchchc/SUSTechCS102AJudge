import java.util.Scanner;

public class A1Q2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int st_hr = in.nextInt();
    int st_min = in.nextInt();
    int st_sec = in.nextInt();
    int end_hr = in.nextInt();
    int end_min = in.nextInt();
    int end_sec = in.nextInt();
    //System.out.println("" +st_hr + st_min+st_sec+end_hr+end_min+end_sec);
    int min = end_min - st_min + (end_hr - st_hr) * 60;
    int sec = end_sec - st_sec;
    if (sec < 0){
      sec = sec + 60;
      min = min -1;
    }
    if (min == 0){
      if (sec != 0){
        System.out.println(sec + "s");
      }else {
        System.out.println("0s");
      }
    }else if (sec == 0){
      System.out.println(min+"m");
    }else {
      System.out.println(min + "m" + sec + "s");
    }
  }
}

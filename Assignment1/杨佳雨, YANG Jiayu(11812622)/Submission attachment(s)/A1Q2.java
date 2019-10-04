import java.util.Scanner;
public class A1Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int hour1;
        int minute1;
        int seconds1;
        hour1 = input.nextInt();
        minute1 = input.nextInt();
        seconds1= input.nextInt();
        int hour2;
        int minute2;
        int seconds2;
        hour2 = input.nextInt();
        minute2 = input.nextInt();
        seconds2 = input.nextInt();
        input.close();
        int minute;
        int second ;
          if(hour1 == hour2) {
              if(minute1 == minute2){
                  second = seconds2 - seconds1;
                  System.out.printf("%ds",second);
              }
              else if(minute2 > minute1){
                  if (seconds2 >= seconds1){
                      minute = minute2 -minute1;
                      second = seconds2 -seconds1;
                      System.out.printf("%dm%ds",minute,second);
                  }
                  else {second = 60 + seconds2 - seconds2;
                      minute = (minute2 - 1) - minute1;
                      System.out.printf("%dm%ds",second,minute);
                  }
              }
          }
              else if(hour2 > hour1){
                      if(minute1 == minute2) {
                          if (seconds2 == seconds1) {
                              minute = (hour2 - hour1) * 60;
                              System.out.printf("%dm", minute);
                             }
                          else if(seconds2 > seconds1) {
                              minute = (60 + seconds2) - seconds2;
                              second = seconds2 - seconds1;
                              System.out.printf("%dm%ds", minute,second);
                          }
                          else { second = (60 + seconds2) - seconds2;
                              minute = (hour2 - hour1) * 60 - 1;
                              System.out.printf("%dm%ds",minute,second);
                          }
                      }
                      else{
                          if(seconds2 >= seconds1){
                              minute = (hour2 - hour1) * 60 + minute2 - minute1;
                              second = seconds2 - seconds1;
                              if(second == 0)System.out.printf("%dm",minute);
                              else System.out.printf("%dm%ds",minute,second);
                            }
                          else{second = seconds2 + 60 -seconds1;
                               minute = (hour2- hour1) * 60 + minute2 - 1 -minute1;
                               System.out.printf("%dm%ds",minute,second);
                          }

                       }

                     }
                  }
}
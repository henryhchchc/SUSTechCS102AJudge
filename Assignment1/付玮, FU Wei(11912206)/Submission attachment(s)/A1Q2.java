import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args){
        Scanner time = new Scanner(System.in);
        int beginning1;
        int beginning2;
        int beginning3;
        int end1;
        int end2;
        int end3;
        beginning1 = time.nextInt();
        beginning2= time.nextInt();
        beginning3= time.nextInt();
        end1 = time.nextInt();
        end2 = time.nextInt();
        end3 = time.nextInt();
        if ((60*(end1-beginning1)+(end2-beginning2))==0) {
            System.out.println( (end3 - beginning3) + "s");
        }else
            if ((end3 - beginning3) == 0) {
                System.out.println( (60 * (end1 - beginning1) + (end2 - beginning2)) + "m");
            }else if(end3>beginning3) {
                System.out.println((60 * (end1 - beginning1) + (end2 - beginning2)) + "m" + (end3 - beginning3) + "s");
            }else
                System.out.println(((60 * (end1 - beginning1) + (end2 - beginning2))-1) + "m" + (end3 + 60 - beginning3) + "s");

//        if ((end3-beginning3)==0){
//            System.out.println("The total waiting time is:"+(60*(end1-beginning1)+(end2-beginning2))+"m");
        }

    }


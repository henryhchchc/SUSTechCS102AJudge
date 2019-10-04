import java.util.Scanner;
public class A1Q2 {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        int beginninghh=input.nextInt();
        int beginningmm=input.nextInt();
        int beginningss=input.nextInt();
        int endinghh=input.nextInt();
        int endingmm=input.nextInt();
        int endingss=input.nextInt();
        int seconds=(endinghh-beginninghh)*3600+(endingmm-beginningmm)*60+(endingss-beginningss);
        if(seconds==0){
            System.out.println("0s");
        }else if(seconds%60==0){
            System.out.println(seconds/60+"m");
        } else {
            int waittingminutes = (seconds - seconds % 60) / 60;
            int waittingseconds = seconds - waittingminutes * 60;
            System.out.println(waittingminutes+"m"+waittingseconds+"s");
        }
    }


}

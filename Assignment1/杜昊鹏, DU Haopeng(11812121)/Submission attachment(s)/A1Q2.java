import java.util.Scanner;

public class A1Q2 {

    public static void main(String[] args) {
	int hh1;
	int mm1;
	int ss1;
	int hh2;
	int mm2;
	int ss2;
	int all;
	int m;
	int s;

	Scanner input = new Scanner(System.in);

	hh1 = input.nextInt();  mm1=input.nextInt();  ss1=input.nextInt();
	hh2 = input.nextInt();  mm2=input.nextInt();  ss2=input.nextInt();

	all=(hh2-hh1)*3600+(mm2-mm1)*60+ss2-ss1;
	m=all/60;
	s=all%60;

	if(m == 0 && s == 0)
	    System.out.println("0s");
	else if(m == 0 && s != 0)
	    System.out.println(  s+"s");
	else if(m != 0 && s == 0)
	    System.out.println(m+"m");
	else
	    System.out.println(m+"m"+s+"s");
    }
}

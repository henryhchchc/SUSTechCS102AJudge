import java.util.Scanner;
public class A1Q2 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int a,b,c,d,e,f,h,i;
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	d = input.nextInt();
	e = input.nextInt();
	f = input.nextInt();
	h = ((3600*d+60*e+f)-(3600*a+60*b+c))/60;
	i = (3600*d+60*e+f)-(3600*a+60*b+c)-60*h;
	if (h-1>=0 && i!=0){
		System.out.print(h + "m" + "" + i + "s");
	}else if(h-1<0){
		System.out.print(i+"s");
		}else{
		System.out.print(h+"m");
		}

    }
}

public class A1Q1 {
    public static void main(String[] args) {
	    String username = args[0];
		int a = Integer.parseInt(args[1]);
		if(a <=11499999) {
			System.out.printf("%d",a);}
		else if (a <=11999999) {
			System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",username);}
		else {System.out.printf("%d",a);}// write your code here
    }
}

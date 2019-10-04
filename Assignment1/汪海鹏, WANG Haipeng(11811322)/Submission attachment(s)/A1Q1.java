public class A1Q1{
	public static void main(String[] args) {
		String n = args[0];
		int m = Integer.parseInt(args[1]);
		if(m>10000000&&m<19999999)
			System.out.printf("%s,welcome to SUSTECH Hot Pot Restaurant/n",n );
		else
			System.out.println(m);
	}

}
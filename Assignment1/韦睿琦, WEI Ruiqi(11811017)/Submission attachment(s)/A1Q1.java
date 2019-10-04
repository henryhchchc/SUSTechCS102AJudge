
public class A1Q1 {

	public static void main(String[] args) {

		String name=args[0];
		String ID=args[1];
		String a=ID.substring(0, 3);
		int x=Integer.parseInt(a);
		int y=ID.length();
		if(x>=115 & x<=119 & y==8)
			System.out.print(name+", welcome to SUSTC Hot Pot Restaurant!");
		else
		    System.out.print(ID);
	}

}

public class A1Q1 {

	public static void main(String[] args) {
		String name=args[0],id=args[1];
		String pre = id.substring(0,3); 
		if( id.length() != 8)
			System.out.print(id);
		else if (pre.equals("115")&&pre.equals("116")&&pre.equals("117")&&pre.equals("118")&&pre.equals("119")) System.out.print(id);
		else System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
	}
}

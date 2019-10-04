public class A1Q1{
	public static void main(String[] args){
		String name = args [0];
		int sid =Integer.parseInt(args[1]);
		if (sid<=11999999&sid>=11500000){
			System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
		}
		else{
			System.out.printf("%d\n",sid);
		}
	}
}
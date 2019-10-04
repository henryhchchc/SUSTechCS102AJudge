
public class A1Q1 {
	public static void main(String[] args) {
		  String name = args[0];
		  String id = args[1];
		  char[] separate = id.toCharArray();
		  if (separate.length == 8 || ((separate[0] - '0') == 1 && (separate[1] - '0') == 1 && (separate[2] - '0') >= 5 && (separate[2] - '0') <= 9)) {
		   System.out.println(name + ", welcom to SUSTECH Hot Pot Restaurant!");
		  }
		  else
		   System.out.println(id);
	 }
}
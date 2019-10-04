public class A1Q1 {
	public static void main(String[] args) {
		String name = args[0];
		int id = Integer.parseInt(args[1]);
		int id1 = id;

		id1 = id1 / 100000;
		
		if ((id1 >= 115) & (id1 <= 119)) {
			System.out.println(name + ", welcome to SUSTECH Hot Pot Restaurant!");
		} else {
			System.out.println(id);
		}

	}
}

public class A1Q1 {

    public static void main(String[] args) {
	// write your code here
        String s1=args[0];
        String s2=args[1];
        int len=s2.length() , a=Integer.parseInt(s2);
        a/=(Math.pow(10,len-3));
        if(len!=8 || a > 119 || a < 115)
            System.out.println(s2);
        else
            System.out.println(s1 + ", welcome to SUSTECH Hot Pot Restaurant!");
    }
}

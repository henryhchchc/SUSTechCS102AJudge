public class A1Q1 {
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        String str3 = str2.substring(0,4);
        int a = Integer.valueOf(str3);
        if(str2.length()!=8)
            System.out.printf("%s",str2);
        else
        if(a<=1191&&a>=1151)
            System.out.printf("%s, welcome to SUSTech Hot Pot Restaurant!",str1);
        else
            System.out.printf("%s",str2);
    }
}

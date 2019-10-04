public class A1Q1 {
    public static void main(String[] args) {
        //args是一个数组，代表的是你启动的时候传进来的参数，这个题目中只有两个，我们把它取出来，数组的序号是从0开始的，所以我们去第0个和第一个。
        String name  = args[0];
        String id = args[1];
        //用String自带的检查起始字符串的方法就可以了,满足条件有两个个，以119或者115开头并且长度为8
        if ((id.startsWith("119") || id.startsWith("115")) && id.toCharArray().length == 8) {
            System.out.println(name + "，welcome to SUSTECH Hot Pot RESTAURANT");
        } else {
            System.out.println(id);
        }
    }
}

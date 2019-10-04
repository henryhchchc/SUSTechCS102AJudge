import java.util.Scanner;
public class A1Q5 {
    public static void main(String[] args){
        int l = args.length;

        for(int i = 0;i < l;i++){
            int index = args[i].indexOf(".");
            char wrong = args[i].charAt(index-1);
            if(wrong == '2') {
                StringBuilder a = new StringBuilder(args[i]);
                a.replace(index - 1, index, "6");
                System.out.printf("%s ", a);
            }
            else if(wrong == '4') {
                StringBuilder b = new StringBuilder(args[i]);
                b.replace(index - 1, index, "9");
                System.out.printf("%s ", b);
            }
        }
       /* String str = "";
        int index = str.indexOf(".");
        String replaceStr = "9";
        String temp = str.substring(0,index-1);
        temp += replaceStr;
        temp += str.substring()*/
    }
}

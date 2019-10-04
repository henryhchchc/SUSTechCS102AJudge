public class A1Q5{
    public static void main(String[] args) {
        for (int i = 0; i <args.length; i++) {
            for(int b=0;b<args[i].length();b++){
                if (args[i].charAt(b) == '.') {
                    if (args[i].charAt(b - 1) == '2') {
                        StringBuffer str1=new StringBuffer(args[i]);
                        StringBuffer str2=str1.replace(b-1,b,"6");
                        System.out.print(str2);
                        System.out.printf(" ");
                        break;
                    } else if(args[i].charAt(b-1)=='4'){
                        StringBuffer str3=new StringBuffer(args[i]);
                        StringBuffer str4=str3.replace(b-1,b,"9");
                        System.out.print(str3);
                        System.out.printf(" ");

                        break;
                    }else{
                        break;
                    }
                }else{

                }
            }
        }
    }
}

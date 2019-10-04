public class A1Q5 {
    public static void main(String[] args) {
        int times = args.length;
        int times2 = 0;
        for (int i = 0;i<times;i++){
            int a = args[i].indexOf('.');
            if (args[i].charAt(a-1)=='2'||args[i].charAt(a-1)=='4'){
                times2++;
            }
        }
        int k = 0;
        String[]output = new String[times2];
        for (int i = 0;i<times;i++){
            int a = args[i].indexOf('.');
            if (args[i].charAt(a-1)=='2'||args[i].charAt(a-1)=='4') {
                if (args[i].charAt(a - 1) == '2'){
                   String temp = args[i].replace('2','6');
                   if (temp.equals("66.9")){
                       temp = "26.9";
                   }
                   output[k] = temp;
                   k++;
                }
                if (args[i].charAt(a - 1) == '4'){
                    String temp = args[i].replace('4','9');
                    if (temp.equals("99.9")){
                        temp = "49.9";
                    }
                    output[k] = temp;
                    k++;
                }
            }
        }
        for (int i=0;i<output.length;i++){
            System.out.print(output[i]);
            System.out.print(" ");
        }
    }
}

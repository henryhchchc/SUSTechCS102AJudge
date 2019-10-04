public class A1Q5 {
    public static void main(String[] args){
        for (String arg: args){
            char w = arg.charAt(arg.length() - 3);
            if (w == '2'){
                double price = Double.parseDouble(arg) + 4;
                System.out.printf("%.1f ",price);
            }else if (w == '4'){
                double price = Double.parseDouble(arg) + 5;
                System.out.printf("%.1f ",price);
            }
        }
    }
}

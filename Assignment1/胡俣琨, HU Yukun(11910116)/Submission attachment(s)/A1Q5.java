public class A1Q5 {
    public static void main(String[] args) {
    float number1, number2;

        for (String ss : args) {
            if (2 <= Float.parseFloat(ss) % 10 && Float.parseFloat(ss) % 10 < 3 ){
                number1 = Float.parseFloat(ss) + 4;
            System.out.printf("%.1f ", number1);}
            else if(4 <= Float.parseFloat(ss)  % 10 && Float.parseFloat(ss) % 10 <5){
                number2 = Float.parseFloat(ss) + 5;
            System.out.printf("%.1f ", number2);}
        }
    }
}

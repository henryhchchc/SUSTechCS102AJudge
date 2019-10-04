public class A1Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            int a3 = in.nextInt();
            int b1 = in.nextInt();
            int b2 = in.nextInt();
            int b3 = in.nextInt();
            int c = (b1-a1)*60*60 + (b2-a2)*60 + b3-a3;
            System.out.println(c/60 +"m" + c%60 +"s");
        }
    }
}

public class A1Q1 {
    public static void main(String[] args){
        String name = args[0];
        int id = Integer.parseInt(args[1]);

        if(args[1].length() != 8) {
            System.out.printf("%d",id);
        } else {
            int temp = id / 100000;
            if((temp < 115) || (temp > 119)){
                System.out.printf("%d",id);
            } else {
                System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
            }
        }
    }
}

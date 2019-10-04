public class A1Q4 {
    public static void main(String []args){

        int A = Integer.parseInt(args[0]);
        int B = Integer.parseInt(args[1]);
        int C = Integer.parseInt(args[2]);

        if(A >=10 || B >= 5000 || C >= 8000){
            System.out.print("Diamond");
        }else if(A >=5 || B >= 2000 || C >= 3000){
            System.out.print("Gold");
        }else if(A >2 || B >= 800 || C >= 1000){
            System.out.print("Sliver");
        }
    }
}

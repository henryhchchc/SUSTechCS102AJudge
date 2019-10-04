public class A1Q1 {

    public static void main(String[] args) {

        String name = args[0];
        int id = Integer.parseInt(args[1]);

        if(args[1].length()>8){

            System.out.printf("%s", args[1]);
            System.exit(0);

        }

        if(id<=11999999&id>=11500000){

            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);

        }else{

            System.out.printf("%d", id);

        }

    }

}
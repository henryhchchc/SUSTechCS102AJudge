public class A1Q1 {

    public static void main(String[] args) {

        for(String arg:args){
            int ID = Integer.parseInt(arg);

            if(ID <= 11999999)
            if(ID >= 11500000)
                System.out.printf("%d, welcome to SUSTECH Hot Pot Restaurant!" , ID);
            else
                System.out.printf("%d", ID);}

    }
}

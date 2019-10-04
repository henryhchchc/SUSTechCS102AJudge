
public class A1Q1 {

    public static void main(String[] args) {
        int studentNumber = 0;
        String name;
        name = args[0];
        studentNumber = Integer.parseInt(args[1]);
        if(studentNumber <= 11919999 && studentNumber >= 11510000){
            System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant！\n",name);
        }
        else
        {
            System.out.print(studentNumber);
        }


    }
}

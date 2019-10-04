
public class A1Q1 {
    public static void main(String[]args){


        int studentid;


        String name =args[0];

        studentid=Integer.parseInt(args[1]);

        if (studentid>=11500000 &studentid<=11999999)
            System.out.printf("%s,welcome to SUSTECH hot pot",name);
         else
             System.out.printf("%d",studentid);




    }
}

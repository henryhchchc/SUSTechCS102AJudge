

public class A1Q1 {
    public static void main(String[] args){
        //input
        String name = args[0];
        String id1=args[1];
        int id=Integer.parseInt(id1);
        if((id>=12000000)||(id<11500000))                  //display the wrong id
        {System.out.print(id); }
        else
        {System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);} // display name

    }//end main
}

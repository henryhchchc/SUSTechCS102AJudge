public class A1Q1 {
    public static void main (String []args){
        String name=args[0];
                String  ID=args[1];
                int size=ID.length();
                String a=ID.substring(0,3);
                int qiansange= Integer.parseInt(a);
                boolean SB =((size==8)&(qiansange>=115)&(qiansange<=119));
                if (SB==true)
                {
                    System.out.println(""+name+", welcome to SUSTECH Hot Pot Restaurant!");
                }
                else
                    {
                System.out.println(""+ID+"");}
            }

    }



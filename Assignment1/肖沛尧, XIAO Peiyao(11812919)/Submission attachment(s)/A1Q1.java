public class A1Q1 {
    public static void main(String[] args){
        String name=args[0];
        int ID1;
        int  ID2=Integer.parseInt(args[1]);
        float ID3;
        ID1=ID2/100000;
        ID3=(float)ID2/1000000;
        while(ID3>1.2) {
            while(ID1>=115){
                if(ID1<120)
                    System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
                else
                    System.out.print("Wrong ID");
                return;}
               while(ID1<115){
           System.out.print("Wrong ID");
        return;}}
                   while(ID3<=1.2){
            System.out.printf("%d",ID2);

        return;
    }}}
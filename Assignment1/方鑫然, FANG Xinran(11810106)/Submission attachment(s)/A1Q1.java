
public class A1Q1 {
    public static void main(String[]args){
        String name,prefixNum,ID;
        int length,pn;
        name = args[0];
        ID = args[1];
        int id = Integer.parseInt(ID);
        length = String.valueOf(id).length();
        if(length==8){
            prefixNum = String.valueOf(id).substring(0,3);
            pn = Integer.parseInt(prefixNum);
            if(pn<115){
                System.out.print(ID);
            }else if(pn>118){
                System.out.print(ID);
            }else{
                System.out.print(name+"\twelcome to SUSTECH Hot Pot Restaurant!");
            }
        }else{
            System.out.print(ID);
        }
    }
}

public class A1Q1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String id = in.next();
        if(id.length() != 8||Integer.parseInt(id.substring(0,2))<115||Integer.parseInt(id.substring(0,2))>119){
            System.out.println(id);
        }else{
            System.out.println(name + ",welcome to SUSTECH Hot Pot Restaurant!");
        }


    }
}

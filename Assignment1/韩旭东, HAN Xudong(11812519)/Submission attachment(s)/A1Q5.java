public class A1Q5 {
    public static void main(String[] args){
        int length = args.length;
        for(int i = 0 ; i < length ; i++){
            if(args[i].contains(".")){
                if(args[i].contains("2.") | args[i].contains("4.")){
                    System.out.print(args[i].replace("2.","6.").replace("4.","9."));
                    System.out.print(" ");
                }
            }else{
                if("2".equals(args[i].substring(args[i].length()-1))){
                    System.out.print(args[i].substring(0,args[i].length() - 1) + "6");
                    System.out.print(" ");
                }
                if("4".equals(args[i].substring(args[i].length()-1))){
                    System.out.print(args[i].substring(0,args[i].length() - 1) + "9");
                    System.out.print(" ");
                }
            }
        }
    }
}

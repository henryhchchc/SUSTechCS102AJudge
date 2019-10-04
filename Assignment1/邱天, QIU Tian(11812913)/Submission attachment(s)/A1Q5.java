public class A1Q5 {
    public static void main(String []args){

        for(int i = 0;i<args.length;i++){
            int a = 1;
            String S = args[i];
            for (int j = 0; j<S.length();j++){
                if (args[i].charAt(j) == '2'){
                    S = S.replaceAll("2","6");  ;
                    a = 2;
                }
                if (args[i].charAt(j) == '4'){
                    S = S.replaceAll("4","9");
                    a = 2;
                }
            }
            if (a == 2){
                System.out.print(S + " ");
            }
        }

    }
}

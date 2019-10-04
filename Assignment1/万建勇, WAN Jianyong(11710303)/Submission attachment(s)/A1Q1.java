

public class A1Q1 {
    public static void main(String[] args) {

        String name=args[0];
        String id=args[1];
        int isLegal=0;
        if(id.length()==8){
            for(int i=0;i<8;i++){
                if(id.charAt(i)>='0' && id.charAt(i)<='9'){
                }else{
                    isLegal=1;
                }
            }

            if(isLegal==0){
                int tmp = Integer.valueOf(id)/100000;
                if(tmp<115 || tmp>119){
                    isLegal=1;
                }
            }
        }else{
            isLegal=1;
        }
        if(isLegal==1){
            System.out.println(id);

        }else{
            System.out.println(name+",welcome to SUSTECH Hot Pot Restaurant!");
        }
    }
}

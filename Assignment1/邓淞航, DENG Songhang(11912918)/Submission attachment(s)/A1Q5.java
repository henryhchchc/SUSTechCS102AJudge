public class A1Q5 {
    public static void main(String args[]){
        int i=0;
        int j=0;
        int k=0;
        String zancun,newstr;
        newstr="";
        for (i=0;i<args.length;i++){
            zancun=args[i];
            newstr=args[i];
            j=args[i].indexOf(".");
            k=args[i].indexOf("2");
            if(j==(k+1)){
                newstr=args[i].replace("2","6");
            }
            k=args[i].indexOf("4");
            if(j==(k+1)){
                newstr=args[i].replace("4","9");
            }

            if(newstr!=zancun){
                System.out.printf("%s ",newstr);
            }
        }
    }
}

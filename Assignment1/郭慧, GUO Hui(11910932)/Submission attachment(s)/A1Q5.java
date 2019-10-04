public class A1Q5 {
    public static void main(String[]args){

        for(int n=0;n!=args.length;n++){
            double c=Double.parseDouble(args[n]);
            //load the import number
            int a=(int)c%10;
            //find the single digit
            if(a==2){
                args[n]+=4;
                c+=4;
                System.out.print(c+" ");
            }
            if(a==4){
                c+=5;
                System.out.print(c+" ");
            }//find the wrong number then output it after revised
        }
    }
}

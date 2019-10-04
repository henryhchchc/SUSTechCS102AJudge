import java.util.ArrayList;

public class A1Q5 {
    public static void main (String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int q=0;
        for(int i=0;i<=(args.length-1);i++){
            double a = Double.parseDouble(args[i]);
            int b;
            b = (int)a%10;
            if(b==2){
                a=a+4;
                list.add(String.valueOf(a));
            }
            else if(b==4){
                a=a+5;
                list.add(String.valueOf(a));
            }
        }
        for(int j=0;j<=list.size()-1; j++){
            System.out.print(list.get(j)+" ");
        }
    }
}



public class A1Q4 {
    public static void main(String[] args){
        int a=0;
        int total=0;
        int b=4;
        for(int i = 0;i < args.length; i++){
            double price = Double.parseDouble(args[i]);
            if (price>=8000)
                b=1;
            else if (price>=3000 && b>2)
                b=2;
            else if (price>=1000 && b>3)
                b=3;
            total+=price;
            a++;
        }
        if(a>=10&&total>=5000)
            System.out.println("Diamond");
        else if(b==1)
            System.out.println("Diamond");
        else if(a>=5&&total>=2000)
            System.out.println("Gold");
        else if(b==2)
            System.out.println("Gold");
        else if(a>=2&&total>=800)
            System.out.println("Silver");
        else if(b==3)
            System.out.println("Silver");
        else System.out.println("None");
    }
}

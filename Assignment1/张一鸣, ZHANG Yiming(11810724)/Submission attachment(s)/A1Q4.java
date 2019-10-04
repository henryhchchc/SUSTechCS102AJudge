public class A1Q4 {
    public static void main(String[] args) {
        int n = args.length;
        int i = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int total = 0;

        while (i < n) {
            int money = Integer.parseInt(args[i]);
            if (money>=8000){
                x++;}
            else if (money>=3000){
                y++;}
            else if (money>=1000){
                z++;}
            else ;

            total = money + total;
            i++;
            }
        if (n>=10){
            if (total>=5000){
                a = 1;}
            else if(total>=2000){
                b = 1;}
            else if (total>=800){
                c = 1;}
            else ;}

        else if (n>=5){
            if (total>=2000){
                b = 2;}
            else if (total>=800){
                c = 2;}
            else ;}

        else if (n>=2){
            if (total>=800){
                c = 3;}
            else ;}
        else ;

        if (x>=1){
            System.out.print("Diamond");}
        else if (a==1){
            System.out.print("Diamond");}
        else if (y>=1){
            System.out.print("Gold");}
        else if (b>=1){
            System.out.print("Gold");}
        else if (z>=1){
            System.out.print("Silver");}
        else if (c>=1){
            System.out.print("Silver");}
        else ;
    }
}





public class A1Q4 {
    public static void main(String[] args){
        int n = args.length;
        int i = 0;
        int con = 0;
        int wholecon = 0;
        double max = 0;
        for(i = 0;i < n;i++){
            con = Integer.parseInt(args[i]);
            if(con > max) {
                max = con;
            }
            wholecon += con;
        }
        if(wholecon >= 5000 && n >= 10 ||max >= 8000){
            System.out.print("Diamond");
        }
        else if(wholecon >= 2000 && wholecon <5000 && n >= 5 && n <10 || max >= 3000 && max < 8000){
            System.out.print("Gold");
        }
        else if(wholecon >= 800 && wholecon <2000 && n >= 2 && n <5 || max >= 1000 && max < 3000){
            System.out.print("Silver");
        }

    }
}
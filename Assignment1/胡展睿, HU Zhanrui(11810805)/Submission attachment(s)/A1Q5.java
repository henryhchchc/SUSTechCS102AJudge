public class A1Q5 {
    public static void main(String[] args) {
        for (int i=0;i<args.length; i++){
            if (Math.floor(Double.parseDouble(args[i])%10)==2)
                System.out.print(Double.parseDouble(args[i])+4+" ");
            else if (Math.floor(Double.parseDouble(args[i])%10)==4)
                System.out.print(Double.parseDouble(args[i])+5+" ");
        }

    }
}

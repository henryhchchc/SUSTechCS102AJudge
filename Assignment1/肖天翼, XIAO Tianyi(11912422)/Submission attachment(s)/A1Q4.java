public class A1Q4 {
    public static void main(String[] args) {
        int length=args.length;
        int a=0,max=0,s=0;
        while (true){
            a++;
            if (a>length){
                break;
            }
            else{
                int number=Integer.parseInt(args[(a-1)]);
                s=s+number;
                if (number>max){
                    max=number;
                }
            }
        }
        if (length>9&(s>4999|max>7999)){
            System.out.print("Dimond");
        }
        else if (length>4&(s>1999|max>3000)){
            System.out.print("Gold");
        }
        else if (length>1&(s>799|max>999)){
            System.out.print("Silver");
        }
    }
}

public class A1Q5 {
    public static void main(String[] args) {
        double y=0,y1=0,y2=0; int a=0,b=0;
        int length = args.length;
        double cost[] = new double[length];
        double change[] = new double[length];
        for (int i = 0; i < cost.length; i++) {
            cost[i] = Double.parseDouble(args[i]);
        }
        for(int i = 1;i < args.length;i++){
            y1 = (int)cost[i];
            y2 = y1%10;
            if(y2==2){
                change[a] = cost[i] + 4;
                a++;
            }
            else if (y2==4){
                change[a] = cost[i] + 5;
                a++;
            }
        }
        for(int c = 0;c < change.length;c++){
            if(change[c] != 0){
                System.out.print(change[c] + " ");
            }
        }
    }
}

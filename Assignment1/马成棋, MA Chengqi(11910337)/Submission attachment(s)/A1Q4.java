public class A1Q4 {
    public static void main(String[] args){
        float sum = 0;
        int time = 0;
        float max = 0;
        int length = args.length;
        while(time < length){
            float consumption;
            consumption = Float.parseFloat(args [time]);
            sum = sum + consumption;
            time = time + 1;
            if (consumption > max){
                max = consumption;
            }
        }
        if ((time >= 10 & sum >= 5000 )|| max >= 8000 ){
            System.out.println("Diamond");
        } else if ((time >= 5 & sum >= 2000 )|| max >= 3000){
            System.out.println("Gold");
        } else if ((time >= 2 & sum >= 800 )|| max >= 1000){
            System.out.println("Silver");
        }
        }
    }

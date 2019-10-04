public class A1Q4 {
    public static void main(String[] args){
        int length = args.length, i = 0, cishu = 0;
        int sum=0,bigger=0,price;
        String degree = "";
        for (i = 0;i < length;i++){
            price = Integer.parseInt(args[i]);
            if(price > bigger){
                bigger = price;
            }
            cishu += 1;
            sum += price;
        }
        if(bigger >= 8000 || (cishu >= 10 && sum >= 5000)){
            degree = "Diamond";
        }
        else if(bigger >= 3000 || (cishu >= 5 && sum >= 2000)){
            degree = "Gold";
        }
        else if (bigger >=1000 || (cishu >=2 && sum >= 800)){
            degree = "Silver";
        }
        System.out.println(degree);
    }
}

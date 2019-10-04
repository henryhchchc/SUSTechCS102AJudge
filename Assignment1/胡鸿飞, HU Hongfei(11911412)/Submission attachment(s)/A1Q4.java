public class A1Q4 {

    public static void main(String[] args) {
	    int length = args.length;
	    int i = 0;
	    String level = " ";
	    int sum = 0;
	    int judge = 0;
	    while (i <= length -1){
	        int a = Integer.parseInt(args[i]);
	        if (a >= 8000){
	            level = "Diamond";
	            judge = 3;}
	        else if (a >= 3000){
                level = "Gold";
                judge = 2;}
	        else if(a >= 1000){
                level = "Silver";
                judge = 1;}
	        sum += a;
	        i ++;
        }
	    if (length >=10 & sum >= 5000 & judge <=3){
	        level = "Diamond";}
	    else if (length >=5 & sum >= 2000 & judge <=2){
            level = "Gold";}
	    else if(length >2 & sum >= 800 & judge <=1){
            level = "Silver";}
	    System.out.printf("%s",level);


        }
    }


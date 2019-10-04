public class A1Q4 {
    public static void main(String[] args) {
        int sum = 0;
        int length = args.length;
        int i = 0;
        int b = 0;
        String vip = "";
        int level = 0;

        while (i < length) {
            int price =Integer.parseInt(args[i]);
            i = ++i;
            sum = sum + price;
            b = price;

            if ( b >= 8000) {
                vip = "Diamond";level =3;
            } else if (b>=3000) {
                vip = "Gold";level = 2;
            }else if(b>=1000){
                vip = "Silver";level = 1;


            }

        }if(sum>=5000&&length>=10) {
            vip = "Diamond";
        }else if(sum>=2000&&length>=5&&level<3) {
            vip = "Glod";
        }else if(sum>=800&&length>=2&&level<2){
            vip = "Silver";
        }
        System.out.printf("%s",vip);


        }
    }

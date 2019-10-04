public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int cumulative = 0;
        String vip = null;

        for (int i = 0; i < length; i++) {
           int cost=Integer.parseInt(args[i]);
           cumulative+=cost;
        if (length >= 2 & cumulative >= 800||cost >= 1000) {
            if (length >= 5 & cumulative >= 2000||cost >= 3000) {
                if (length >= 10 & cumulative >= 5000||cost >= 8000) {
                        vip = "Diamond";
                } else {
                    if (vip=="Gold"||vip == "Sliver" || vip == null) {
                        vip = "Gold";
                    }
                }
            } else { if (vip =="Silver"||vip == null) {
                    vip = "Silver";
                }
            }
        }
        }if(vip!=null){
        System.out.println(vip);}
    }}



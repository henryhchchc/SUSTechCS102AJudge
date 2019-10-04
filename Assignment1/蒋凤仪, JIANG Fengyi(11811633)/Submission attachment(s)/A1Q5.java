public class A1Q5 {
    public static void main(String[] args){
        int i = 0;

        for (;i < args.length;i++) {
            double price = Double.parseDouble(args[i]);
            double unit = Math.floor(price) % 10;
            int units = (int) unit;


            //swith Only char uses ''    Integer uses nothing && String uses ""
           switch (units){
               case  2://changed '2' into 2
               price += 4.0;
               System.out.print(price + " ");
               break;

               case  4:
               price += 5.0;
               System.out.print(price + " ");
               break;
           default:
               break;

           }

        }

    }
}

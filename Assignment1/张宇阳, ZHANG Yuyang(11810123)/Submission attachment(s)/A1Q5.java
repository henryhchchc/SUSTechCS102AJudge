import java.util.ArrayList;

public class A1Q5 {
  public static void main(String[] args) {
    int [] price = new int[args.length];
    int ling;
    ArrayList<Double> list = new ArrayList<>();
    for (int i=0;i<args.length;i++){
      price [i] = (int) Math.floor(Double.parseDouble(args[i]));
      ling = price[i] % 10;
      if (ling == 2){
        list.add(Double.parseDouble(args[i]) + 4);
      }
      if (ling == 4){
        list.add(Double.parseDouble(args[i]) + 5);
      }
    }
    for (double a : list){
      System.out.print(a + " ");
    }
  }
}

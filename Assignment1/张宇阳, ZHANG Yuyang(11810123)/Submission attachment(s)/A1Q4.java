public class A1Q4 {
  public static void main(String[] args) {
    int vip = 0;
    int sum = 0;
    for (int i=0;i<args.length;i++){
      sum = sum + Integer.parseInt(args[i]);
      if (Integer.parseInt(args[i]) >= 1000 && vip < 1){
        vip = 1;
      }
      if (Integer.parseInt(args[i]) >= 3000 && vip < 2){
        vip = 2;
      }
      if (Integer.parseInt(args[i]) >= 8000 && vip < 3){
        vip = 3;
      }
    }
    if (sum >= 800 && args.length >= 2 && vip < 1){
      vip = 1;
    }
    if (sum >= 2000 && args.length >= 5 && vip < 2){
      vip = 2;
    }
    if (sum >= 5000 && args.length >= 10 && vip < 3){
      vip = 3;
    }
    switch (vip){
      case 0:
        System.out.println();
        break;
      case 1:
        System.out.println("Silver");
        break;
      case 2:
        System.out.println("Gold");
        break;
      case 3:
        System.out.println("Diamond");
        break;
    }
  }
}

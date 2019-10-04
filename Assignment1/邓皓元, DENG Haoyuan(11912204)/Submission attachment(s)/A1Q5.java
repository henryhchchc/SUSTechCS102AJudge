public class A1Q5 {
  public static void main(String[] args) {
    int d=args.length;
    int a=0;
    int t=0;
    while (d>0){
      d=d-1;
      float x=Float.parseFloat(args[t]);
      t=t+1;
      a=((int)x)%10;
      if(a==2)
        System.out.printf("%.1f ",x+4);
      if(a==4)
        System.out.printf("%.1f ",x+5);
    }
  }
}
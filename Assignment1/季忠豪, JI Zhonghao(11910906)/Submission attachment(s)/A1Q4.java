public class A1Q4 {
    public static void main(String[] args){
      int length = args.length;
      int max=0,average=0,input;

      for (int i=0; i<length; i++){
          input = Integer.parseInt(args[i]);
          average+=input;
          if (max < input) max=input;
      }
      average/=length;

      if ((max>=8000) | (length>=10 && average>=5000))
          System.out.printf("Diamond");
      else if ((max>=3000) | (length>=5 && average>=2000))
          System.out.printf("Gold");
      else if ((max>=1000) | (length>=2 && average>=800))
          System.out.printf("Silver");

    }
}

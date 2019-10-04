public class A1Q5 {
    public static void main(String[] args){
          for (int i = 0; i < args.length; i++){
              String a = args[i];
              int index = args[i].indexOf(".")-1;
              char u = args[i].charAt(index);
              if(u == '2') {
                  StringBuilder x = new StringBuilder(args[i]);
                  x.replace(index, index + 1, "6");
                  System.out.printf("%s ", x );
              }
              else if ( u == '4'){
                  StringBuilder x = new StringBuilder(args[i]);
                  x.replace(index, index + 1, "9");
                  System.out.printf("%s ", x );
              }

          }
    }
}

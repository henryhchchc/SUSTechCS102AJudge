public class A1Q1 {
        public static void main(String[]args){
            String a = (args[0]);
            String b = (args[1]);

            if(b.length()==8 && b.charAt(0)=='1' && b.charAt(1)=='1' && (b.charAt(2)=='5' || b.charAt(2)=='6' ||b.charAt(2)=='7'||b.charAt(2)=='8'||b.charAt(2)=='9'))
            {
                System.out.println(a+", welcome to SUSTECH Hot Pot Restaurant!");
            }
            else{
                System.out.println(b);
            }
        }

    }



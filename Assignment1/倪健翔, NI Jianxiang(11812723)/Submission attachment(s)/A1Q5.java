public class A1Q5{
    public static void main(String[] args) {
        int length =args.length;
        int count=0;
        for(int i=0;i<length;i++){
            float[] score=new float[length];
            score[i]=Float.parseFloat(args[i]);
           int a=(int)score[i];
           int b=a%10;
           float c=score[i]-a;
           int d =(a-b)/10;           
           if(count==0&&b==2){
               float e=10*d+6+c;
               System.out.print(e);
               count++;
           }
           else if(b==2){
                float e = 10 * d + 6 + c;
                System.out.print(" "+e);
           }
           else if(count ==0&&b==4){
                float e = 10 * d + 9 + c;
                System.out.print(e);
                count++;
           }
           else if(b==4){
                float e = 10 * d + 9 + c;
                System.out.print(" " + e);
           }
        }
    }
}
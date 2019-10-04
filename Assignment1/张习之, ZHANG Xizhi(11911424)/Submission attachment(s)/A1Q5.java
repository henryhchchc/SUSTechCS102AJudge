

public class A1Q5 {
    public static void main(String[] args) {


        int length = args.length;
               float word;int times;
        for(int i=0;i<length;i++){
            word=Float.parseFloat(args[i]);
for( times=0;word>10;word=word-10){
    times++;
}
if(word>=2&&word<3){
    word=word+4;
    System.out.printf("%.1f ",word+times*10);
}if(word>=4&&word<5){
    word=word+5;
                System.out.printf("%.1f ",word+times*10);
            }

        }
    }
}
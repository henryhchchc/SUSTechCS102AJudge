import java.util.Arrays;

public class A1Q5 {

    public static void main(String[] args){
        int length=args.length;
        double[] array={ 9.9,12.9,19.9,21.9,33.5,54.9};
        for(int i=0;i<length;i++){
        double reminder=(array[i])%10;
        if(reminder>=2&&reminder<3){
            System.out.print(array[i]+4+" " );
        }
        if(reminder>=4&&reminder<5){
            System.out.print(array[i]+5+" " );
        }


        }

    }

}

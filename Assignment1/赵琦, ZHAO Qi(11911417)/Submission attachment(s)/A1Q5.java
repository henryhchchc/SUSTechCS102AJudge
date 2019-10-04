import java.lang.reflect.Array;
import java.util.Arrays;

public class A1Q5 {

    public static void main(String[] args) {
	   int length = args.length;
	   int i = 0;
	   int j = 0;
	   String[] result = new String[10];

	   while (i <= length -1){
	   	String a = args[i];
	   	int length1 = a.length();
	   	String judge = a.substring(length1 -3,length1 -2);
	   	int b = Integer.parseInt(judge);
	   	if (b == 2){
	   		Float c = Float.parseFloat(a);
	   		Float correction = c -2+6;
	   		result[j] = correction.toString();
	   		j ++;

		}
	   	else if (b == 4){
			Float c = Float.parseFloat(a);
			Float correction = c -4+9;
			result[j] = correction.toString();
			j ++;

		}
	   	i ++;
	   }
		for (int k = 0; k < result.length; k++) {
			if (result[k] != null) {
				System.out.print(result[k] + " ");
			}
		}






    }
}

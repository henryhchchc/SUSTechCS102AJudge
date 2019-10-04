import java.util.Scanner;
public class A1Q3 {
    public static void main(String[] args) {
        double x,y,z=0,z1,x1;int y1;
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            x = input.nextDouble();
            y = input.nextDouble();
            if(y==(int)y){
                z += x*y;
            }
            else{
                y1 = (int)y;
                x1 = (x/2)*10;
                if(x1 != (double)(int)x1){
                    z1 = (x1+0.5)/10+1;
                    z = z + (x*y1) + z1;
                }
                else{
                    z1 = (x1)/10+1;
                    z =z+ (x*y1)+z1;
                }
            }
        }
        System.out.println(z);
    }
}

import java.util.Scanner;

public class A1Q3 {
    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        double total=0.0;
        int _10OfEach=0;
                while(in.hasNext()){
                    double price = in.nextDouble();
                    double piece = in.nextDouble();
                    int interOfPiece =(int)piece;
                    double _100OfEach =(interOfPiece*price+((piece-interOfPiece)*price+1)*(piece-interOfPiece)*2)*100;
                    int interOf100OfEach = (int)_100OfEach;
                    int rest = interOf100OfEach%10;
                    if (rest>=5)
                        _10OfEach = interOf100OfEach/10+1;
                    else
                        _10OfEach = interOf100OfEach/10;

                    total += (_10OfEach*0.1);

                }
                System.out.printf("%.1f",total);
    }
}

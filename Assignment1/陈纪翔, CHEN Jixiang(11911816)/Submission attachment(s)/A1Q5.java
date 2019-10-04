public class A1Q5 {

    public static void main(String[] args) {
	// write your code here
    double[] kk;
    kk=new double[1001];
    int cnt=0,n=args.length,i=0;
    while(i<n){
            double a=Double.parseDouble(args[i]);
            int b=(int)Math.floor(a);
            if( b % 10 == 2 )
                kk[++cnt]= a + 4;
            else if ( b % 10 == 4)
                kk[++cnt]= a + 5;
            i++;
    }
    for(int j=1;j<=cnt;j++)
            if(j==cnt)  System.out.printf("%.1f", kk[j] );
            else System.out.printf("%.1f ", kk[j] );
    }
}

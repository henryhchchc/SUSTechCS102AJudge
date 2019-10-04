public class A1Q4 {

    public static void main(String[] args) {
        int times = args.length;
        int sum = 0;
        int max = 0;

        for (int i = 1 ; i <= times ; i++) {
            int cost = Integer.parseInt( args[i-1] );
            sum = cost + sum;

            if ( cost > max )
                max = cost;
        }

        if ( ( times >= 10 && sum >= 5000 ) || max >= 8000 )
            System.out.print( "Diamond" );
        else if ( ( times >= 5 && sum >= 2000 ) || max >= 3000 )
            System.out.print( "Gold" );
        else if ( ( times >= 2 && sum >= 800 ) || max >= 1000 ) {
            System.out.print( "Silver" );
        }
        }}
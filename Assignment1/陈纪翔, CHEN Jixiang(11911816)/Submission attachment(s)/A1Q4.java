public class A1Q4 {

    public static void main(String[] args) {
	// write your code here
    int cnt=0,maxx=0,num=0,i=0,n=args.length;
      while(i<n){
        int a=Integer.parseInt(args[i]);
        cnt++;
        maxx=Math.max(maxx,a);
        num+=a;
        i++;
     }
      if(( cnt >= 10 && num >= 5000 ) || maxx >= 8000)
            System.out.printf("Diamond");
      else if( ( cnt >= 5 && num >= 2000 ) || maxx >= 3000)
            System.out.printf("Gold");
      else if( ( cnt >=2 && num >= 800 ) || maxx >= 1000)
            System.out.printf("Silver");
    }
}

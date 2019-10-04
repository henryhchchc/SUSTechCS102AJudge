public class A1Q4 {
    public static void main(String[] args) {
        int a2=0,sum=0,i=0;
        int n = args.length;
       while(i<n){
           int a1=Integer.parseInt(args[i]);
       sum+=a1;
       i++;
       if (a1>a2)
       { a2=a1; }
       }
       if ((sum>=5000&&i>=10)||a2>=8000)
        {System.out.print("Diamond");}
       else if ((sum>=2000&&i>=5)||a2>=3000)
       {System.out.print("Gold");}
       else if ((sum>=800&&i>=2)||a2>=1000)
       {System.out.print("Silver");}


    }}

import java.util.Scanner;
public class A1Q3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double price=0,num=0,sum=0,s=0;
		Scanner input=new Scanner(System.in);
		while(input.hasNext())
		{
			price=input.nextDouble();
			num=input.nextDouble();
			s=price*num;
			if (num-(int)num!=0)
				{
					double s1=s*10;
					if(s1-(int)s1>=0.5) s1=(int)s1+1;
					else s1=(int)s1;
					//s1 = new BigDecimal(s1).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
					s=s1/10+1;
				}
			sum+=s;
		}
		System.out.printf("%.1f\n",sum);
	}

}

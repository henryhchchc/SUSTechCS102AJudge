public class A1Q4
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i,price = 0,sum=0,big,length,j=0;
		length=args.length;
		String vip="";
		i=0;
		sum=0;
		big=0;
		for(;j<length;j++)
		{
			price=Integer.parseInt(args[j]);
			if(price>big)big=price;
			i+=1;
			sum+=price;
		}
		if((i>=2&&sum>=800)||big>=1000) vip="Silver";
		if((i>=5&&sum>=2000)||big>=3000)vip="Gold";
		if((i>=8&&sum>=5000)||big>=8000)vip="Diamond";
		System.out.println(vip);
	}
	
}

public class A1Q4 {
    public static void main(String[] args) {
        int length = args.length;
        int cheque = 0;
        int sum = 0;
        String name = "";

while (cheque<length)
{int money=Integer.parseInt(args[cheque]);
    sum=sum+money;
    cheque++;
}



int max=0;
cheque=0;
int compare=0;
while (cheque<length)
{int money=Integer.parseInt(args[cheque]);
if (money>compare)
{max=money;}
compare=money;
cheque++;
}

        if (length>=10&&sum>=5000)
        {name="Diamond";}
        else if (max>=8000)
        {name="Diamond";}
        else if (length>=5&&sum>=2000)
        {name="Gold";}
        else if (max>=3000)
        {name="Gold";}
        else if (length>=2&&sum>=1000)
        {name="Silver";}
        else if (max>=1000)
        {name="Silver";}

        System.out.println(name);













}
}

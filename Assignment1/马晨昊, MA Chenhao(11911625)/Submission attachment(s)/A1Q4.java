
public class A1Q4 {

    public static void main(String[] args) {
	int i;
	int m=0;
	int all=0;
    while (m>=0){
        m=m++;
        i =Integer.parseInt(args[m]);
        all=all+i;
        if(i>=8000){
            System.out.printf("Diamond");
            return;
        }
        else if(i>=3000){
            System.out.printf("Gold");
            return;
        }
        else if(i>=1000){
            System.out.printf("Diamond");
            return;
        }
    }
    if(m>=10&&all>=5000){
        System.out.printf("Diamond");
        return;
    }
    else if (m>=5&&all>=2000){
        System.out.printf("Gold");
        return;
    }
    else if(m>=2&&all>=800){
        System.out.printf("Diamond");
        return;
    }
    }
}


public class A1Q4{
            public static void main(String args[]){
                int count=0;
                int allmoney=0;
                int maxmoney=0;
                for(int i=0; i<args.length; i++){
                    count++;
                    allmoney= Integer.parseInt(args[i])+allmoney;
                    int a= Integer.parseInt(args[i]);
                    if(maxmoney<=a){
                        maxmoney=a;
                    }else{
                    }
                }
                if(((count>=10)&&(allmoney>=5000)||(maxmoney>=8000))){
                    System.out.println("Diamond");
                }else if(((count>=5)&&(allmoney>=2000)||(maxmoney>=3000))){
                    System.out.println("Gold");
                }else if(((count>=2)&&(allmoney>=800)||(maxmoney>=1000))){
                    System.out.println("Silver");
                }else{
                }
            }
        }



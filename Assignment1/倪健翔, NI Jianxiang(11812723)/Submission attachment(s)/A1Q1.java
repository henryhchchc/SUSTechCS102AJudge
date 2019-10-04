

public class A1Q1{
public static void main(String args[]){
    String name=args[0];
    String Id = args[1] ;
    int length =Id.length();
    String ID =Id.substring(0, 4);
    for(int i=0;i<length;i++){
        if (Id.charAt(i)>='0' &&Id.charAt(i)<='9'){
            continue;
        }
        else{
                System.out.printf("%s", Id);
                return;
        }
    }
    if(length != 8){
        System.out.printf("%s",Id);
    }
        else if(ID.equals("1151")){
            System.out.printf("%s, welcome to SUSTECH Hot PotRestaurant!", name);
        }
        else if (ID.equals("1161")) {
            System.out.printf("%s, welcome to SUSTECH Hot PotRestaurant!", name);
        }
        else if (ID.equals("1171")) {
            System.out.printf("%s, welcome to SUSTECH Hot PotRestaurant!", name);
        }
        else if (ID.equals("1181")) {
            System.out.printf("%s, welcome to SUSTECH Hot PotRestaurant!", name);
        } else if (ID.equals("1191")) {
            System.out.printf("%s, welcome to SUSTECH Hot PotRestaurant!", name);
        }
        else{
            System.out.printf("%s",Id);
        }

       
    }
}

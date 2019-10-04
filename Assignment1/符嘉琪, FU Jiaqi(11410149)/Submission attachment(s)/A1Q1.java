package fjq;

import java.util.Scanner;

public class A1Q1 {

    public static void check(String userID, String name) {
        if (userID.length() != 8){
            System.out.println(userID +  " (We will be sure to pass you exactly 2 parameters separated by a space during the test)");
        } else {
            int prefixNumber =  Integer.parseInt(userID.substring(0 ,3));
            int [] currentIDs = {115, 116, 117, 118, 119};
            for (int id:currentIDs) {
                if(id == prefixNumber) System.out.println(name+ ", welcome to SUSTECH Hot Pot Restaurant!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String name  = in.nextLine();
            String id = in.nextLine();
            check(id, name);
        }

    }
}

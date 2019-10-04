public class A1Q1 {
            public static void main(String[] args) {
                String name = args[0];
                int ID = Integer.parseInt(args[1]);
                int id = ID;
                int count = 0;
                int fore = ID / 100000;
                while(ID>0){
                    count += 1;
                    ID = ID/10;
                }
                if(count == 8) {
                    if ((fore >= 115) && (fore <= 119)) {
                        System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!", name);
                    }else {
                        System.out.printf("%d", id);
                    }
                } else {
                    System.out.printf("%d", id);
                }
            }
}

public class A1Q4 {
    public static void main(String[]args) {
        int total=0;

        int length = args.length;
        int[] arr = new int[length];
        int max = arr[0];


        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
            if(arr[i]>max)
                max=arr[i];
            total+=arr[i]; }
            if (max>=8000||total>=5000&&length>=10)
                System.out.print("Diamond");
            else if (max>=3000||total>=2000&&length>=5)
                System.out.print("Gold");
            else if (max>=1000||total>=800&&length>=2)
                System.out.print("Sliver");
            else;

        }

    }

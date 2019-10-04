import java.util.Scanner;

public class A1Q2 {
    public static void main(String[] args) {
        int beginh, beginm, begins, endh, endm, ends;
        int waitm, waits;

        Scanner input = new Scanner(System.in);

        beginh = input.nextInt();
        beginm = input.nextInt();
        begins = input.nextInt();

        endh = input.nextInt();
        endm = input.nextInt();
        ends = input.nextInt();

        waits = 3600 * (endh - beginh) + 60 * (endm - beginm) + (ends - begins);
        waitm = waits / 60;
        waits = waits % 60;

        if (waitm == 0)
            System.out.printf("%ss", waits);
        else if (waits == 0)
            System.out.printf("%sm", waitm);
        else
            System.out.printf("%sm %ss", waitm, waits);
        return;

    }

}

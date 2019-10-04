
public class A1Q4 {
    public static void main(String[] args) {
        int single, grade1 = 0, grade2 = 0, grade, i, j, cumulative = 0;
        int length = args.length;
        for (i = 0; i < length; i++) {
            single = Integer.parseInt(args[i]);
            if (single >= 8000) {
                grade1 = 3;
            } else {
                if (single >= 3000 && grade1 < 2) {
                    grade1 = 2;
                } else {
                    if (single >= 1000 && grade1 < 1) {
                        grade1 = 1;
                    } else
                        grade1 = grade1;

                }
            }
        }
        for (j = 0; j < length; j++) {
            single = Integer.parseInt(args[j]);
            cumulative = cumulative + single;
        }
        if (cumulative >= 5000 && length >= 10) {
            grade2 = 3;
        } else {
            if (cumulative >= 2000 && length >= 5 && grade2 < 2) {
                grade2 = 2;
            } else {
                if (cumulative >= 800 && length >= 2 && grade2 < 1) {
                    grade2 = 1;
                } else
                    grade2 = grade2;
            }
        }
        if (grade1 >= grade2) {
            grade = grade1;
        } else {
            grade = grade2;
        }
        if (grade == 3) {
            System.out.println("Diamond");
        }
        if (grade == 2) {
            System.out.println("Gold");
        }
        if (grade == 1) {
            System.out.println("Silver");
        }


    }
}
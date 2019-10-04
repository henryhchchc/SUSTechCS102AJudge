public class A1Q5 {
    public static void main(String[] args) {
        for (String arg : args) {
            boolean isWrong = false;
            String[] nums = arg.split("\\.");
            if (nums[0].endsWith("2")) {
                String zhengshu = nums[0].substring(0, nums[0].length() - 1) + "6";
                System.out.printf("%s.%s ", zhengshu, nums[1]);
            } else if (nums[0].endsWith("4")) {
                String zhengshu = nums[0].substring(0, nums[0].length() - 1) + "9";
                System.out.printf("%s.%s ", zhengshu, nums[1]);
            }
        }
    }
}
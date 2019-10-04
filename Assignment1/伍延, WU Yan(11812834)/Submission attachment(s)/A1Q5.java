public class A1Q5 {
    public static void main (String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            String change = "";
            //标志是否改变
            int flag = 0;
            //判断是否含有小数
            if (!s.contains(".")) {
                char[] nums = s.toCharArray();
                if (nums[nums.length  - 1] == '2') {
                    nums[nums.length - 1] = '6';
                    flag = 1;
                }
                if (nums[nums.length - 1] == '4') {
                    nums[nums.length - 1] = '9';
                    flag = 1;
                }
                if (flag == 1) {
                    change = new String(nums);
                }
            } else {
                //查找小数点的位置
                int dotPos = s.indexOf(".");
                char[] nums = s.toCharArray();
                if (nums[dotPos - 1] == '2') {
                    nums[dotPos - 1] = '6';
                    flag = 1;
                }
                if (nums[dotPos - 1] == '4') {
                    nums[dotPos - 1] = '9';
                    flag = 1;
                }
                if (flag == 1) {
                    change = new String(nums);
                }
            }
            if (!change.equals("")) {
                System.out.print(change + " ");
            }
        }
    }
}

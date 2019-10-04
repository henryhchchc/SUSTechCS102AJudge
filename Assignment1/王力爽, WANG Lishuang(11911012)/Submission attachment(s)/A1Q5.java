public class A1Q5 {

    public static void main(String[] args) {
        String str;
        for (int i = 1; i <= args.length; i++) {
            str=args[i-1];
            int index;
            if(str.indexOf('.')==-1)
                index=str.length()-1;
            else index=str.indexOf('.')-1;
            char a[]=str.toCharArray();
            if(a[index]!='2'&&a[index]!='4')   continue;
            else if(a[index]=='2')   a[index]='6';
            else a[index]='9';
            System.out.print(a);
            System.out.print(" ");
        }
    }
}

public class A1Q5 {
    public static void main(String[]args)
{   int length=args.length;
    for (int i=0;i<length;i++)
    {
        int length1=args[i].length();
        char[] mid=args[i].toCharArray();
        int j=0;
                for(;j<=length1-1;j++)
        switch(mid[j]){
            case '2':{
              if(j==length1-1||mid[j+1]=='.')
            {    mid[j]='6';
                for(int counter=0;counter<=length1-1;counter++) {
                    System.out.printf("%c",mid[counter]);
                    if (counter==length1-1)
                        System.out.print(" ");}
                break;}}
             case '4':
             {if(j==length1-1||mid[j+1]=='.')
            {    mid[j]='9';
                for(int counter=0;counter<=length1-1;counter++) {
                    System.out.printf("%c",mid[counter]);
                if (counter==length1-1)
                System.out.print(" ");}}
                    break;}
                    default:
                        break;
        }

}}}

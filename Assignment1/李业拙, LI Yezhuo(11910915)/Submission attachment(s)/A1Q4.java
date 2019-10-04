import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

import java.util.concurrent.Callable;

public class A1Q4 {

    public static void main(String[] args){
        int l = args.length;
        int[] k=new int[100];
        int total=0;

        boolean A=false;
        boolean B=false;
        boolean C=false;

        for (int i=0;i<l;i++){
            k[i]=Integer.parseInt(args[i]);

            if(k[i]>=8000){
                System.out.print("Diamond");A=true;}
            else if (l<10&&k[i]>=5000){
                System.out.print("Gold");B=true;}
            else if(l<5&&k[i]>=800){
                System.out.print("Silver");C=true;}
                }

        for (int i=0;i<l;i++){
            total+=k[i];}
            if (A==false&&l>=10&&total>5000){
                System.out.print("Diamond");B=false;C=false;}
            else if (B==false&&l>=5&&total>2000){
                System.out.print("Gold");C=false;}
            else if (C==false&&l>=2&&total>800){
                System.out.print("Silver");
                }



        }




    }


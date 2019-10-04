import java.util.*;
public class A1Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ay = new ArrayList<String>();
		int l0 = args.length;
		for(int i = 0;i<l0;i++){
			String p = args[i];
			int l = p.indexOf('.')-1;
			boolean a = p.charAt(l)=='2';
			boolean b = p.charAt(l)=='4';
			StringBuilder sb = new StringBuilder(p);
			if(a==true||b==true){
				if(a==true){p = sb.replace(l, l+1, "6").toString();}
				else{p = sb.replace(l, l+1, "9").toString();}
				ay.add(p);
			}
		}
		for(int i = 0;i<ay.size()-1;i++ ){
			System.out.print(ay.get(i)+" ");
		}System.out.print(ay.get(ay.size()-1));
	}

}

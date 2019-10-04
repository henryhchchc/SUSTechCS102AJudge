public class A1Q4 { 
	public static void main(String[] args) {
		int score=0,level=4,j=0,pas=0;
		for (int i=0;i<args.length;i++){
			score = Integer.parseInt(args[i]) + score ;
			pas=Integer.parseInt(args[i]);
			if(pas>=8000){
				level=1;}
			if((pas>=5000)&&level>1){
				level=2;}
			if((pas>=3000)&&level>2){
		level=3;}}
		if ((j==0&&(args.length>=10&&score>=5000))||level==1){
			j=1;
			System.out.print("Diamond");}
		if ((j==0&&(args.length>=5&&score>=2000))||level==2){
			j=1;
			System.out.print("Gold");}
		if ((j==0&&(args.length>=2&&score>=1000))||level==3){
			System.out.print("Silver");}}}
public class A1Q1{
  //start class
  public static void main(String[] args){
	//start method main 
	String name = args [0];
	int id = Integer.parseInt(args[1]);
	//input name and id 
	
	if(id <=11999999&&id >= 11500000){
	  System.out.printf("%s, welcome to SUSTECH Hot Pot Restaurant!",name);
	}//sreen the right id
    else{
      System.out.printf("%d",id);
	}  //repeat it when it is a wrong id
  }//end method main 
}// end class A1Q1
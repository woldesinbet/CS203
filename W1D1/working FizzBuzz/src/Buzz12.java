
public class Buzz12 {

	public static void main(String[] args) {
	 for(int x=1; x<=100; x++){
		 
		 if(x%3==0&&x%5==0)
			 System.out.println("FIZZ BUZZ ");
		 
		 else if(x%3==0)
			 System.out.println("FIZZ");
		 else  if(x%5==0)
			 System.out.println("BUZZ");
		
		 else 
			 System.out.println(x);
			 
	 }
		
		// TODO Auto-generated method stub

	}

}

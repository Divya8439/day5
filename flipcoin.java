package assignmentday5;

public class flipcoin {

	public static void main(String[] args) {
		int head=0;
		int tail=0;
		int chances=10;
		for (int i=1;i<=chances;i++) {
		double haedCheck=Math.floor(Math.random()*10)%2;
		
		if(haedCheck==0)
		{
			System.out.println("head:" + head);
			head++;
		}
		else
		{
			System.out.println("tail:" + tail);
			tail++;
		}
	}
	int perc1=(head*100)/chances;
	int perc2=(tail*100)/chances;
	System.out.print("The percentage of getting head is:" + perc1);
	  System.out.println("\n");
	System.out.print("The percentage of getting tail is:" + perc2);
	}
}
		
		
		
			
			
		
		


	



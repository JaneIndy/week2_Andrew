package week2_Andrew;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int creditScore = (int)(Math.random()*800);
		int loan = 10000;
		System.out.println(creditScore);
		//between 400 and 500
		if (creditScore >400 && creditScore <=500){
		loan= 1000;
	
		}else  
		
		if (creditScore >= 501 && creditScore <=700){
		loan=1200;
				
		}else 
			
		if (creditScore>= 701 && creditScore <= 800){
			
		loan = 2000;
		}else { 
		
			System.out.println(creditScore+ "isnt enough credit");
			System.out.println("you have been approved $" + loan);
			
			
			String member ="premium";
		if (loan>= 1000 && member == "premium") {
			loan+=250;
			System.out.println("you've been approved for $" + loan);
		}else {
			System.out.println("you not a premium member," + "click now to join");
		}
		
		}
		
		}
		

}






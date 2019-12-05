package day46_superKeyword;

class Data{
	public static int num1 = 10;
	protected static int num2 = 20;
	private static int num3 = 30;
	static int num4 = 40;
	
	public  int num11 = 10;
	protected  int num22 = 20;
	private  int num33 = 30;
	 int num44 = 40;
}

public class InheritanceReview extends Data{
	//			sub						super
	
	/*	Inherited variables from Data
	 	public static int num1 = 10;
		protected static int num2 = 20;
		static int num4 = 40;
		
	 */
	
	static int staticNum;
	   int insNum;
	   
	   public void mm() {
		   System.out.println( this.insNum );
	   }
	public static void main(String[] args) {
		
		//System.out.println( this.insNum ); 
				// in order to call instances in a static method or block, we MUST have object
				
		System.out.println(num1);
		System.out.println(num2);
//		System.out.println(num3); cannot be inherited
		System.out.println(num4);
		
		System.out.println("=============================");
		InheritanceReview obj = new InheritanceReview();
		System.out.println(obj.num1);
		System.out.println(obj.num2);
//		System.out.println(obj.num3); private
		System.out.println(obj.num4);
		
		System.out.println("==============================");
		Data obj2 = new Data();
		System.out.println(obj.num1);
		System.out.println(obj.num2);
//		System.out.println(obj.num3); private
		System.out.println(obj.num4);
		
		/*
		 * this if we will create another class rotectedVariables in another package
		 ProtectedVariables obj3 = new ProtectedVariables();
			//  System.out.println( obj3.nameProtected );  // protected is not visible outside package
			  System.out.println( obj3.namePublic); // public is worldwide
			*/  
			
			  InheritanceReview  objA = new InheritanceReview();
			  					objA.staticNum  = 100;
			  					objA.insNum = 200;
			  		
			  InheritanceReview  objB = new InheritanceReview();
			  			objA.staticNum  = 300;
			  			objB.insNum = 400;
			  			
			  		System.out.println( objB.insNum );  //400
			  		System.out.println(objA.insNum );    //200
			  		
			  		System.out.println( objB.staticNum );  //300
			  		System.out.println( objA.staticNum );  //300
		
	}

	
	
	

}

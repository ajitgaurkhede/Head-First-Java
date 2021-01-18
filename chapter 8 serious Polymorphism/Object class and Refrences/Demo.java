


class Dog{


	
	/*public void go(){
	
	
		Dog aDog = new Dog();
		
		Dog sameDog = getObject(aDog);	// incompatible types: Object cannot be converted to Dog
		
	
	
	}
	
	
	public Object getObject( Object o){
	
	
		return o ;
	
	
	}*/
	
	
	
	public void go(){
	
	
		Dog aDog = new Dog();
		
		//Object sameDog = getObject(aDog);  Accepted
		
		Object sameDog = aDog ; 	// u Can also do like this no need of Method
		
		
		Object a = new Object() ;
		
		
		Dog d = (Dog) a;	 // Accepted using casting
		
		//Dog d = a;	//incompatible types: Object cannot be converted to Dog
		

		
		
		
	
	
	}
	
	
	public Object getObject( Object o){
	
	
		return o ;
	
	
	}
	
	
	



}






class Demo{



	public static void main(String arg[]){





	}



}

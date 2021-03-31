
public class Main {

	public static void main(String[] args) {
		
		Phone iphone = new Phone();
		iphone.Brand = "iphone";
		iphone.Colour = "black"	;	
		System.out.println("Brand : " + iphone.Brand);
		System.out.println("Colour : " + iphone.Colour);
		
		System.out.println();
		
		Phone samsung = new Phone();
		iphone.Brand = "samsung";
		iphone.Colour = "pink"	;	
		System.out.println("Brand : " + samsung.Brand);
		System.out.println("Colour : " + samsung.Colour);
	}

}
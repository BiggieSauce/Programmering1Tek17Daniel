package Variable;

public class SpecifiedDecimals {

	public static void main(String[] args) {
		
	
	float floatNumber = 1.8776f;
	int numbersOfDecimals = 2;
	
	double rounder = floatNumber * Math.pow(10, numbersOfDecimals);
	
	double round= Math.round(floatNumber * rounder ) /rounder;
	System.out.println(round);

}

}
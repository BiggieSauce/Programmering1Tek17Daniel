package Variable;

public class ReversAnIntegerNumber {

	public static void main(String[] args) {
		int i = 1234;
		int tusental = (int) Math.floor(i / 1000) * 100;
		int hundratal = (int) Math.floor(i - tusental * 1000) / 100;
		int tiotal = (int) Math.floor(i - (hundratal * 100 + tusental * 1000)) / 10;
	}

}

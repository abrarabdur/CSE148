package p1;
// custom Exception class
public class GPATooBigException extends Exception {
	public GPATooBigException(String message) {
		super(message);
	}
}

package om.okna.sill;

@SuppressWarnings("serial")
public class InvalidLegthException extends RuntimeException {
	
	public InvalidLegthException() {
		super("Piece size exceeds the stock size");
	}

}
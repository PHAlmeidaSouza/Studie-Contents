package exceptions;

public class BusinessExceptions extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BusinessExceptions(String msg) {
		super(msg);
	}

}

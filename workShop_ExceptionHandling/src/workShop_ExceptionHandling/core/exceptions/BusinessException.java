package workShop_ExceptionHandling.core.exceptions;

@SuppressWarnings("serial")
public class BusinessException extends Exception{
	public BusinessException(String message) {
		super(message);
	}
}

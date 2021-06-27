package lab3;

import java.io.IOException;

@SuppressWarnings("serial")
public class BookException extends IOException{
	public BookException(String message){
		super(message);
		
	}
}

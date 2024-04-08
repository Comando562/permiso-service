package mx.com.tcs.permiso.exception;

public class ItemNotFoundException extends RuntimeException{

    public ItemNotFoundException(String message){
        super(message);
    }

    public ItemNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
}

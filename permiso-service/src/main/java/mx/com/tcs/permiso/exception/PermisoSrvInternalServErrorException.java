package mx.com.tcs.permiso.exception;

public class PermisoSrvInternalServErrorException extends RuntimeException{
    /**
     * Constructor of PermisoSrvInternalServErrorException using the message of exception.
     *
     * @param message The message of the error
     */
    public PermisoSrvInternalServErrorException(String message) {
        super(message);
    }

    /**
     * Constructor of PermisoSrvInternalServErrorException using the message and throw cause of exception.
     *
     * @param message The message of the error.
     * @param cause The throw cause of the error.
     */
    public PermisoSrvInternalServErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}

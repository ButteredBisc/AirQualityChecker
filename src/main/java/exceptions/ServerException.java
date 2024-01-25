package exceptions;

import java.io.Serializable;
/**
 * Exception for server side issues.
 */
public class ServerException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -5611964113127868598L;
    /**
     * Exceptions with no message or cause.
     */
    public ServerException(){super();}

    /**
     * Exceptions with a message but no cause.
     * @param message A descriptive message fo this exception.
     */
    public ServerException(String message){super(message);}

    /**
     * Exceptions with a cause but no message.
     * @param cause The throwable resulting in this exception.
     */
    public ServerException(Throwable cause){super(cause);}

    /**
     * Exceptions with a message and a cause.
     * @param message A descriptive message fo this exception.
     * @param cause The throwable resulting in this exception.
     */
    public ServerException(String message, Throwable cause){super(message, cause);}
}

package exceptions;

import java.io.Serializable;
/**
 * Exception for client side issues.
 */
public class ClientException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -4058910283264732258L;

    /**
     * Exceptions with no message or cause.
     */
    public ClientException(){super();}

    /**
     * Exceptions with a message but no cause.
     * @param message A descriptive message fo this exception.
     */
    public ClientException(String message){super(message);}

    /**
     * Exceptions with a cause but no message.
     * @param cause The throwable resulting in this exception.
     */
    public ClientException(Throwable cause){super(cause);}

    /**
     * Exceptions with a message and a cause.
     * @param message A descriptive message fo this exception.
     * @param cause The throwable resulting in this exception.
     */
    public ClientException(String message, Throwable cause){super(message, cause);}
}

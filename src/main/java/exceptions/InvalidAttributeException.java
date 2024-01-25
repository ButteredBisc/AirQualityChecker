package exceptions;

import java.io.Serializable;

/**
 * Exception for when the client has an invalid input.
 */
public class InvalidAttributeException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -5157337242982484934L;

    /**
     * Exceptions with no message or cause.
     */
    public InvalidAttributeException(){super();}

    /**
     * Exceptions with a message but no cause.
     * @param message A descriptive message fo this exception.
     */
    public InvalidAttributeException(String message){super(message);}

    /**
     * Exceptions with a cause but no message.
     * @param cause The throwable resulting in this exception.
     */
    public InvalidAttributeException(Throwable cause){super(cause);}

    /**
     * Exceptions with a message and a cause.
     * @param message A descriptive message fo this exception.
     * @param cause The throwable resulting in this exception.
     */
    public InvalidAttributeException(String message, Throwable cause){super(message, cause);}
}

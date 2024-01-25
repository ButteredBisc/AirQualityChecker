package exceptions;

import java.io.Serializable;

/**
 * Exception for when the API doesn't have data for a specific location.
 */

public class LocationNotFoundException extends RuntimeException implements Serializable {

    private static final long serialVersionUID = -5876997063404137991L;

    /**
     * Exceptions with no message or cause.
     */
    public LocationNotFoundException(){super();}

    /**
     * Exceptions with a message but no cause.
     * @param message A descriptive message fo this exception.
     */
    public LocationNotFoundException(String message){super(message);}

    /**
     * Exceptions with a cause but no message.
     * @param cause The throwable resulting in this exception.
     */
    public LocationNotFoundException(Throwable cause){super(cause);}

    /**
     * Exceptions with a message and a cause.
     * @param message A descriptive message fo this exception.
     * @param cause The throwable resulting in this exception.
     */
    public LocationNotFoundException(String message, Throwable cause){super(message, cause);}
}

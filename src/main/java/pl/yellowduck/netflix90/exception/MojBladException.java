package pl.yellowduck.netflix90.exception;

import pl.yellowduck.netflix90.annotations.Test;


public class MojBladException extends Exception{
    public MojBladException() {
    }

    @Test
    public MojBladException(String message) {
        super(message);
    }

    public MojBladException(String message, Throwable cause) {
        super(message, cause);
    }

    public MojBladException(Throwable cause) {
        super(cause);
    }

    public MojBladException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

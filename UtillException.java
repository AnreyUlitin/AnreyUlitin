package utill;

public class UtillException extends Exception {

    public UtillException() {
        super();
    }

    public UtillException(String message) {
        super(message);
    }

    public UtillException(String message, Throwable cause) {
        super(message, cause);
    }

    public UtillException(Throwable cause) {
        super(cause);
    }

    protected UtillException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

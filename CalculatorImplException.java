package utill;

public class CalculatorImplException extends Exception {
    public CalculatorImplException() {
        super();
    }

    public CalculatorImplException(String message) {
        super(message);
    }

    public CalculatorImplException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculatorImplException(Throwable cause) {
        super(cause);
    }

    protected CalculatorImplException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

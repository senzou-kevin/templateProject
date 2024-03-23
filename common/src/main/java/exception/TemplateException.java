package exception;

import enums.error.StatusCode;

public class TemplateException extends RuntimeException{

    private String errorCode;
    private String errorMsg;

    private TemplateException() {

    }

    public TemplateException(StatusCode errorCode, String errorMsg) {
        this.errorCode = errorCode.getCode();
        this.errorMsg = errorMsg;
    }

    public String getMessage() {
        return this.errorMsg;
    }

    public String getErrorCode() {
        return this.errorCode;
    }
}

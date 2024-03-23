package enums.error;

public enum SystemErrorCode implements StatusCode {

    SYSTEM_ERROR("TEMPLATE00001"),
    SYSTEM_ERROR_PARAMETER_ERROR("TEMPLATE00002"),
    SYSTEM_ERROR_PARAMETER_MISSING("TEMPLATE00003"),
    SYSTEM_ERROR_PARAMETER_INVALID("TEMPLATE00004"),
    SYSTEM_ERROR_PARAMETER_TYPE_ERROR("TEMPLATE00005"),
    SYSTEM_ERROR_PARAMETER_VALUE_ERROR("TEMPLATE00006"),
    SYSTEM_ERROR_PARAMETER_VALUE_INVALID("TEMPLATE00007")
    ;

    private final String code;

    SystemErrorCode(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }
}

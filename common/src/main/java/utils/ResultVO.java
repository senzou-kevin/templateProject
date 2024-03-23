package utils;

import enums.error.StatusCode;
import lombok.Data;

@Data
public class ResultVO<T> {

    private String errorCode;

    private String errorMsg;

    private boolean success;

    private T data;

    public static <T> ResultVO<T> success(T data) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setData(data);
        resultVO.setSuccess(true);
        return resultVO;
    }

    public static <T> ResultVO<T> fail(StatusCode code, String msg) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setErrorCode(code.getCode());
        resultVO.setErrorMsg(msg);
        resultVO.setSuccess(false);
        return resultVO;
    }

    public static <T> ResultVO<T> fail(String code, String msg) {
        ResultVO<T> resultVO = new ResultVO<>();
        resultVO.setErrorCode(code);
        resultVO.setErrorMsg(msg);
        resultVO.setSuccess(false);
        return resultVO;
    }
}

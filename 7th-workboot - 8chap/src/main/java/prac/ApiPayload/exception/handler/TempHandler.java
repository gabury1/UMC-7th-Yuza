package prac.ApiPayload.exception.handler;

import prac.ApiPayload.code.BaseErrorCode;
import prac.ApiPayload.exception.GeneralException;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}
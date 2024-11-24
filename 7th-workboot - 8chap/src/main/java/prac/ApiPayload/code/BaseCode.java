package prac.ApiPayload.code;

public interface BaseCode {

    /**
     *  Status에서 두 매서드를 Override할 것을 강제.
     * 
     * @return
     */

    ReasonDTO getReason();
    ReasonDTO getReasonHttpStatus();
}

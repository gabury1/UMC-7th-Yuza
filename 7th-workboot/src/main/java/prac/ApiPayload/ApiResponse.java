package prac.ApiPayload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import prac.ApiPayload.code.BaseCode;
<<<<<<< HEAD
import prac.ApiPayload.code.SuccessStatus.SuccessStatus;
=======
>>>>>>> origin/main

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "code", "message", "result"}) // JSON의 순서를 잡아줌(Jackson)
public class ApiResponse<T> {

    /**
     * ApiResponse <T>
     * 
     * isSuccess : 성공인가?
     * code : HTTP상태코드보다 세부적인 에러코드
     * message : 우리에게 익숙한 문자로 상황을 알려줌.
     * result : 실제로 클라이언트에게 필요한 데이터. 
     * 
     */


	@JsonProperty("isSuccess")
    private final Boolean isSuccess;
    private final String code;
    private final String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;


    // 성공한 경우 응답 생성

    public static <T> ApiResponse<T> onSuccess(T result){
       return new ApiResponse<>(true, SuccessStatus._OK.getCode() , SuccessStatus._OK.getMessage(), result);
    }

    public static <T> ApiResponse<T> of(BaseCode code, T result){
        return new ApiResponse<>(true, code.getReasonHttpStatus().getCode() , code.getReasonHttpStatus().getMessage(), result);
    }


    // 실패한 경우 응답 생성
    public static <T> ApiResponse<T> onFailure(String code, String message, T data){
        return new ApiResponse<>(false, code, message, data);
    }
}
package com.sparta.StarProjectLocationDB.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class RestApiExceptionHandler {

    @ExceptionHandler(value = {StarProjectException.class})
    public ResponseEntity<Object> handleApiRequestException(StarProjectException ex) {

        ErrorCode errorCode = ex.getErrorCode();

        RestApiException restApiException = null;

        /**
         * 닉네임 중복 에러
         */
        if(errorCode.equals(ErrorCode.NICKNAME_DUPLICATE)){
          restApiException = ServerError(ex, 501L);
        }
        /**
         * 유저네임 중복 에러
         */
        else if (errorCode.equals(ErrorCode.USERNAME_DUPLICATE)){
           restApiException = ServerError(ex,  501L);
        }
        /**
         * 공통 에러 제어
         */
        else {
            restApiException = ServerError(ex, 500L);
        }

        log.info(ex.getMessage());
        return new ResponseEntity<>(
                restApiException,
                HttpStatus.OK
        );
    }


    /**
     * Null Porint Exception
     */
    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<Object> NullPointExceptionHandler(Exception ex) {
        RestApiException restApiException = ServerError(ex, 500L);

        log.info(ex.getMessage());
        return new ResponseEntity<>(
                restApiException,
                HttpStatus.OK
        );
    }



    /**
     * Not Found Gps Exception
     */
    @ExceptionHandler(value = {NotFoundGps.class})
    public ResponseEntity<Object> NotFoundGps(Exception ex) {
        RestApiException restApiException = ServerError(ex, 500L);

        log.info(ex.getMessage());
        return new ResponseEntity<>(
                restApiException,
                HttpStatus.OK
        );
    }

    private RestApiException ServerError(Exception ex, long l) {
        RestApiException restApiException = new RestApiException();

        restApiException.setCode(l);
        restApiException.setData(null);
        restApiException.setMsg(ex.getMessage());

        return restApiException;
    }


}
package prac.service.TempService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import prac.ApiPayload.code.ErrorStatus.ErrorStatus;
import prac.ApiPayload.exception.handler.TempHandler;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}
package cn.lacknb.blog.apiversiontest.advice;

import cn.lacknb.myapiversion.ApiRuntimeContext;
import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import java.lang.reflect.Type;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.RequestBodyAdviceAdapter;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@RestControllerAdvice
public class RequestBodyBeforeAdvice extends RequestBodyAdviceAdapter {

    @Override
    public boolean supports(MethodParameter methodParameter, Type targetType,
        Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object afterBodyRead(Object body, HttpInputMessage inputMessage, MethodParameter parameter, Type targetType,
        Class<? extends HttpMessageConverter<?>> converterType) {
        JSONObject jsonObject = JSON.parseObject(JSON.toJSONBytes(body));
        String tnt = jsonObject.getString("tnt");
        if (tnt != null && tnt.trim().length() > 0) {
            ApiRuntimeContext.put(ApiRuntimeContext.CTX_KEY_API_VERSION, tnt);
        }
        return super.afterBodyRead(body, inputMessage, parameter, targetType, converterType);
    }
}

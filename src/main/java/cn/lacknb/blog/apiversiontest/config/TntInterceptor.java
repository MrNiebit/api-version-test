package cn.lacknb.blog.apiversiontest.config;

import cn.lacknb.myapiversion.ApiRuntimeContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@Component
public class TntInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
        throws Exception {
        String tnt = request.getParameter("tnt");
        if (tnt != null && tnt.length() > 0) {
            ApiRuntimeContext.put(ApiRuntimeContext.CTX_KEY_API_VERSION, tnt);
        }
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}

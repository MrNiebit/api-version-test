package cn.lacknb.blog.apiversiontest.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@Configuration
@RequiredArgsConstructor
public class AppConfig implements WebMvcConfigurer {

    private final TntInterceptor tntInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(tntInterceptor)
            .addPathPatterns("/**");
    }
}

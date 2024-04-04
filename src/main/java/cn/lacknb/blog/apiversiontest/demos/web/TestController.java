package cn.lacknb.blog.apiversiontest.demos.web;

import cn.lacknb.blog.apiversiontest.service.BizTntService;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final BizTntService bizTntService;

    @RequestMapping("/hello")
    public String hello() {
        return "<h1>hello Spring Boot ~ </h1>";
    }

    @RequestMapping("/process")
    public String process(@RequestBody(required = false) Map<String, Object> data) {
        return bizTntService.process();
    }

}

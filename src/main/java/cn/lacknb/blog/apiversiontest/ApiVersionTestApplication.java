package cn.lacknb.blog.apiversiontest;

import cn.lacknb.myapiversion.annotation.EnableImportApiVersion;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableImportApiVersion("cn.lacknb.blog.apiversiontest.service")
public class ApiVersionTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiVersionTestApplication.class, args);
    }

}

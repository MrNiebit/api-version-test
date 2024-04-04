package cn.lacknb.blog.apiversiontest.service.henan.mysql;

import cn.lacknb.blog.apiversiontest.service.BizTntService;
import cn.lacknb.myapiversion.annotation.ApiVersion;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@ApiVersion("hn_mysql")
public class HNMysqlService implements BizTntService {

    @Override
    public String process() {
        return "henan mysql process ~";
    }

}

package cn.lacknb.blog.apiversiontest.service.henan.clickhouse;

import cn.lacknb.blog.apiversiontest.service.BizTntService;
import cn.lacknb.myapiversion.annotation.ApiVersion;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@ApiVersion("hn_ck")
public class HNCkService implements BizTntService {

    @Override
    public String process() {
        return "henan clickhouse process ~";
    }

}

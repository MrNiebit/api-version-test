package cn.lacknb.blog.apiversiontest.service.zhejiang.clickhouse;

import cn.lacknb.blog.apiversiontest.service.BizTntService;
import cn.lacknb.myapiversion.annotation.ApiVersion;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@ApiVersion("zj_ck")
public class ZJCkService implements BizTntService {

    @Override
    public String process() {
        return "zhejiang clickhouse process ~";
    }

}

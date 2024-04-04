package cn.lacknb.blog.apiversiontest.service.zhejiang.mysql;

import cn.lacknb.blog.apiversiontest.service.BizTntService;
import cn.lacknb.myapiversion.annotation.ApiVersion;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@ApiVersion("zj_mysql")
public class ZJMysqlService implements BizTntService {

    @Override
    public String process() {
        return "zhejiang mysql process ~";
    }

}

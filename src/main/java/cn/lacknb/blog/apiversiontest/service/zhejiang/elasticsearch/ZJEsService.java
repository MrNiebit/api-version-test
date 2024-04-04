package cn.lacknb.blog.apiversiontest.service.zhejiang.elasticsearch;

import cn.lacknb.blog.apiversiontest.service.BizTntService;
import cn.lacknb.myapiversion.annotation.ApiVersion;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@ApiVersion("zj_es")
public class ZJEsService implements BizTntService {

    @Override
    public String process() {
        return "zhejiang Es process ~";
    }

}

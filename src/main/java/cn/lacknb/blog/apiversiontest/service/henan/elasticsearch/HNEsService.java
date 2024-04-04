package cn.lacknb.blog.apiversiontest.service.henan.elasticsearch;

import cn.lacknb.blog.apiversiontest.service.BizTntService;
import cn.lacknb.myapiversion.annotation.ApiVersion;

/**
 * @author gitsilence
 * @date 2024-04-04
 */
@ApiVersion("hn_es")
public class HNEsService implements BizTntService {

    @Override
    public String process() {
        return "henan Es process ~";
    }

}

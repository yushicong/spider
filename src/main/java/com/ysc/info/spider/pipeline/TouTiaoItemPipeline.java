package com.ysc.info.spider.pipeline;

import com.alibaba.fastjson.JSON;
import com.ysc.info.entity.toutiao.TouTiaoAD;
import com.ysc.info.entity.toutiao.TouTiaoADDto;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * Created by bjyushicong on 2017/2/9.
 */
@Component
public class TouTiaoItemPipeline {
    private static Logger logger = Logger.getLogger(TouTiaoItemPipeline.class);

    public TouTiaoAD conversionItem(TouTiaoADDto touTiaoADDto){
        logger.info(JSON.toJSONString(touTiaoADDto));
        TouTiaoAD touTiaoAD = new TouTiaoAD();
        return touTiaoAD;
    }

}

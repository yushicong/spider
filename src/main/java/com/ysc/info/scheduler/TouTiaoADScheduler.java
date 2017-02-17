package com.ysc.info.scheduler;

import com.ysc.info.dao.UserMapper;
import com.ysc.info.entity.toutiao.TouTiaoAD;
import com.ysc.info.entity.toutiao.TouTiaoADDto;
import com.ysc.info.entity.toutiao.TouTiaoADUrl;
import com.ysc.info.spider.TouTiaoSpider;
import com.ysc.info.spider.pipeline.TouTiaoItemPipeline;
import org.apache.log4j.Logger;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class TouTiaoADScheduler {
	private Logger log = Logger.getLogger(this.getClass());

	@Resource
	private TouTiaoSpider touTiaoSpider;
	@Resource
	private TouTiaoItemPipeline touTiaoItemPipeline;

	@Scheduled(cron= "00 43 17 ? * *")
	public void touTiaoADSchedulerProcess() throws Exception {
		log.info("colect intoutiao ad informations start");
		TouTiaoADUrl TouTiaoADurl = new TouTiaoADUrl();
		String url = TouTiaoADurl.getUrl();
		TouTiaoADDto touTiaoADDto = touTiaoSpider.crawl(url);
		TouTiaoAD touTiaoAD = touTiaoItemPipeline.conversionItem(touTiaoADDto);
		log.info("colect intoutiao ad informations end");
	}

}

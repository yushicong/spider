package com.ysc.info.spider;


import com.gargoylesoftware.htmlunit.WebClient;
import com.ysc.info.entity.toutiao.TouTiaoADDto;
import com.ysc.info.entity.toutiao.TouTiaoADDtoContect;
import com.ysc.info.util.HttpUtil;
import com.ysc.info.util.WebClientUtil;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bjyushicong on 2017/2/9.
 */
@Component
public class TouTiaoSpider {
    private static Logger logger = Logger.getLogger(TouTiaoSpider.class);

    private WebClient webClient;
    public TouTiaoSpider(){
        webClient = WebClientUtil.getNewInstance();
    }

    public TouTiaoADDto crawl(String url) throws Exception {
        TouTiaoADDto touTiaoADDto;
        String responseMsg = HttpUtil.getInstance().sendUrlOfGet(url);
        try{
            ObjectMapper mapper = new ObjectMapper();
            touTiaoADDto = mapper.readValue(responseMsg, TouTiaoADDto.class);
            List<TouTiaoADDto.Data> dataList = touTiaoADDto.getData();
            List<TouTiaoADDtoContect> list = new ArrayList<TouTiaoADDtoContect>();
            for (TouTiaoADDto.Data data : dataList){
                try{
                    TouTiaoADDtoContect touTiaoADDtoContect = mapper.readValue(data.getContent(), TouTiaoADDtoContect.class);
                    list.add(touTiaoADDtoContect);
                }catch (Exception e){
                    logger.error("TouTiaoSpider crawl error url:" + url + ", error :"+e.getMessage()+ " contect :" + data.getContent());
                    throw e;
                }
            }
            touTiaoADDto.setTouTiaoADDtoContects(list);
        }catch (Exception e){
            logger.error("TouTiaoSpider crawl error url:" + url + ", error :"+e.getMessage() + " responseMsg :" + responseMsg);
            throw e;
        }finally{
            webClient.closeAllWindows();
        }
        return touTiaoADDto;
    }

    public static void main(String[] args) throws Exception {
        TouTiaoSpider touTiaoSpider = new TouTiaoSpider();
        String url = "https://lh.snssdk.com/api/news/feed/v50/?version_code=5.9.8&app_name=news_article&vid=CFB5AAE3-4500-4BC0-ADDF-321A1B5CFB8E&device_id=22693512100&channel=App%20Store&resolution=750*1334&aid=13&ab_version=95362,101433,104014,101786,102972,103131,101533,104109,103923,104103,102435,97143,104086,103104,101558,103799,104171,102205,92439,104011,103173,104045,103570,103585,102772,98047,101405,103631,103435&ab_feature=z1&openudid=6d2a5711119e6b4553d3cb1ea3a37037ed402dbc&live_sdk_version=1.6.5&idfv=CFB5AAE3-4500-4BC0-ADDF-321A1B5CFB8E&ac=WIFI&os_version=10.0.2&ssmix=a&device_platform=iphone&iid=7841229806&ab_client=a1,f2,f7,e1&device_type=iPhone%206&idfa=E4FAF108-0B53-48C5-B0E6-A25436C31B36&LBS_status=authroize&city=%E5%8C%97%E4%BA%AC&concern_id=6286225228934679042&count=20&cp=508d9f7533867q1&detail=1&image=1&language=zh-Hans-CN&last_refresh_sub_entrance_interval=1486305383&latitude=40.04199522551153&loc_mode=1&loc_time=1486304662&longitude=116.4002513420921&min_behot_time=1486305165&refer=1&strict=0&tt_from=pull";
        TouTiaoADDto touTiaoADDto = touTiaoSpider.crawl(url);
        System.out.println(touTiaoADDto);
    }
}

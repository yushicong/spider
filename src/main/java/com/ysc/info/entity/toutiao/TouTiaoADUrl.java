package com.ysc.info.entity.toutiao;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bjyushicong on 2017/2/9.
 */
public class TouTiaoADUrl {
//    https://lh.snssdk.com/api/news/feed/v50/?version_code=5.9.8&app_name=news_article&vid=CFB5AAE3-4500-4BC0-ADDF-321A1B5CFB8E&device_id=22693512100&channel=App%20Store&resolution=750*1334&aid=13&ab_version=95362,101433,104014,101786,102972,103131,101533,104109,103923,104103,102435,97143,104086,103104,101558,103799,104171,102205,92439,104011,103173,104045,103570,103585,102772,98047,101405,103631,103435&ab_feature=z1&openudid=6d2a5711119e6b4553d3cb1ea3a37037ed402dbc&live_sdk_version=1.6.5&idfv=CFB5AAE3-4500-4BC0-ADDF-321A1B5CFB8E&ac=WIFI&os_version=10.0.2&ssmix=a&device_platform=iphone&iid=7841229806&ab_client=a1,f2,f7,e1&device_type=iPhone%206&idfa=E4FAF108-0B53-48C5-B0E6-A25436C31B36&LBS_status=authroize&city=%E5%8C%97%E4%BA%AC&concern_id=6286225228934679042&count=20&cp=508d9f7533867q1&detail=1&image=1&language=zh-Hans-CN&last_refresh_sub_entrance_interval=1486305383&latitude=40.04199522551153&loc_mode=1&loc_time=1486304662&longitude=116.4002513420921&min_behot_time=1486305165&refer=1&strict=0&tt_from=pull
    private static final String URI = "https://lh.snssdk.com/api/news/feed/v50/";

    private static Map<String,String> paramsMap = new HashMap<String, String>();

    public String getUrl(){
        StringBuffer url = new StringBuffer(URI);
        if (paramsMap != null && paramsMap.size() != 0){
            int i = 1;
            for (String key : paramsMap.keySet() ){
                if(i == 1){
                    url.append("?" + key + "=" + paramsMap.get(key));
                }else{
                    url.append("&" + key + "=" + paramsMap.get(key));
                }
                i++;
            }
        }
        return url.toString();
    }

    public TouTiaoADUrl(){
        String version_code = "5.9.8";
        String app_name = "news_article";
        String vid = "CFB5AAE3-4500-4BC0-ADDF-321A1B5CFB8E";
        String device_id = "22693512100";
        String channel = "App%20Store";
        String resolution = "750*1334";
        String aid = "13";
        String ab_version = "95362,101433,104014,101786,102972,103131,101533,104109,103923,104103,102435,97143,104086,103104,101558,103799,104171,102205,92439,104011,103173,104045,103570,103585,102772,98047,101405,103631,103435";
        String ab_feature = "z1";
        String openudid = "6d2a5711119e6b4553d3cb1ea3a37037ed402dbc";
        String live_sdk_version = "1.6.5";
        String idfv = "CFB5AAE3-4500-4BC0-ADDF-321A1B5CFB8E";
        String ac = "WIFI";
        String os_version = "10.0.2";
        String ssmix = "a";
        String device_platform = "iphone";
        String iid = "7841229806";
        String ab_client = "a1,f2,f7,e1";
        String device_type = "iPhone%206";
        String idfa = "E4FAF108-0B53-48C5-B0E6-A25436C31B36";
        String LBS_status = "authroize";
        String city = "%E5%8C%97%E4%BA%AC";
        String concern_id = "6286225228934679042";
        String count = "20";
        String cp = "508d9f7533867q1";
        String detail = "1";
        String image = "1";
        String language = "zh-Hans-CN";
        String last_refresh_sub_entrance_interval = "1486305383";
        String latitude = "40.04199522551153";
        String loc_mode = "1";
        String loc_time = "1486304662";
        String longitude = "116.4002513420921";
        String min_behot_time = "1486305165";
        String refer = "1";
        String strict = "0";
        String tt_from = "pull";
        paramsMap.put("version_code",version_code);
        paramsMap.put("app_name",app_name);
        paramsMap.put("vid",vid);
        paramsMap.put("device_id",device_id);
        paramsMap.put("channel",channel);
        paramsMap.put("resolution",resolution);
        paramsMap.put("aid",aid);
        paramsMap.put("ab_version",ab_version);
        paramsMap.put("ab_feature",ab_feature);
        paramsMap.put("openudid",openudid);
        paramsMap.put("live_sdk_version",live_sdk_version);
        paramsMap.put("idfv",idfv);
        paramsMap.put("ac",ac);
        paramsMap.put("os_version",os_version);
        paramsMap.put("ssmix",ssmix);
        paramsMap.put("device_platform",device_platform);
        paramsMap.put("iid",iid);
        paramsMap.put("ab_client",ab_client);
        paramsMap.put("device_type",device_type);
        paramsMap.put("idfa",idfa);
        paramsMap.put("LBS_status",LBS_status);
        paramsMap.put("city",city);
        paramsMap.put("concern_id",concern_id);
        paramsMap.put("count",count);
        paramsMap.put("cp",cp);
        paramsMap.put("detail",detail);
        paramsMap.put("image",image);
        paramsMap.put("language",language);
        paramsMap.put("last_refresh_sub_entrance_interval",last_refresh_sub_entrance_interval);
        paramsMap.put("latitude",latitude);
        paramsMap.put("loc_mode",loc_mode);
        paramsMap.put("loc_time",loc_time);
        paramsMap.put("longitude",longitude);
        paramsMap.put("min_behot_time",min_behot_time);
        paramsMap.put("refer",refer);
        paramsMap.put("strict",strict);
        paramsMap.put("tt_from",tt_from);

    }

}

package com.ysc.info.entity.toutiao;

import java.util.List;

/**
 * Created by bjyushicong on 2017/2/9.
 */
public class TouTiaoADDto {

    private int login_status;

    private int total_number;

    private boolean has_more;

    private String post_content_hint;

    private int show_et_status;

    private int feed_flag;

    private int action_to_last_stick;

    private String message;

    private boolean has_more_to_refresh;

    private List<Data> data ;

    private List<TouTiaoADDtoContect> touTiaoADDtoContects ;

    private Tips tips;

    public List<TouTiaoADDtoContect> getTouTiaoADDtoContects() {
        return touTiaoADDtoContects;
    }

    public void setTouTiaoADDtoContects(List<TouTiaoADDtoContect> touTiaoADDtoContects) {
        this.touTiaoADDtoContects = touTiaoADDtoContects;
    }

    public void setLogin_status(int login_status){
        this.login_status = login_status;
    }
    public int getLogin_status(){
        return this.login_status;
    }
    public void setTotal_number(int total_number){
        this.total_number = total_number;
    }
    public int getTotal_number(){
        return this.total_number;
    }
    public void setHas_more(boolean has_more){
        this.has_more = has_more;
    }
    public boolean getHas_more(){
        return this.has_more;
    }
    public void setPost_content_hint(String post_content_hint){
        this.post_content_hint = post_content_hint;
    }
    public String getPost_content_hint(){
        return this.post_content_hint;
    }
    public void setShow_et_status(int show_et_status){
        this.show_et_status = show_et_status;
    }
    public int getShow_et_status(){
        return this.show_et_status;
    }
    public void setFeed_flag(int feed_flag){
        this.feed_flag = feed_flag;
    }
    public int getFeed_flag(){
        return this.feed_flag;
    }
    public void setAction_to_last_stick(int action_to_last_stick){
        this.action_to_last_stick = action_to_last_stick;
    }
    public int getAction_to_last_stick(){
        return this.action_to_last_stick;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return this.message;
    }
    public void setHas_more_to_refresh(boolean has_more_to_refresh){
        this.has_more_to_refresh = has_more_to_refresh;
    }
    public boolean getHas_more_to_refresh(){
        return this.has_more_to_refresh;
    }
    public void setData(List<Data> data){
        this.data = data;
    }
    public List<Data> getData(){
        return this.data;
    }
    public void setTips(Tips tips){
        this.tips = tips;
    }
    public Tips getTips(){
        return this.tips;
    }


    public static class Data {
        private String content;

        private String code;

        public void setContent(String content){
            this.content = content;
        }
        public String getContent(){
            return this.content;
        }
        public void setCode(String code){
            this.code = code;
        }
        public String getCode(){
            return this.code;
        }

    }


    public static class Tips {
        private String display_info;

        private String open_url;

        private String web_url;

        private String app_name;

        private String package_name;

        private String display_template;

        private String type;

        private int display_duration;

        private String download_url;

        public void setDisplay_info(String display_info){
            this.display_info = display_info;
        }
        public String getDisplay_info(){
            return this.display_info;
        }
        public void setOpen_url(String open_url){
            this.open_url = open_url;
        }
        public String getOpen_url(){
            return this.open_url;
        }
        public void setWeb_url(String web_url){
            this.web_url = web_url;
        }
        public String getWeb_url(){
            return this.web_url;
        }
        public void setApp_name(String app_name){
            this.app_name = app_name;
        }
        public String getApp_name(){
            return this.app_name;
        }
        public void setPackage_name(String package_name){
            this.package_name = package_name;
        }
        public String getPackage_name(){
            return this.package_name;
        }
        public void setDisplay_template(String display_template){
            this.display_template = display_template;
        }
        public String getDisplay_template(){
            return this.display_template;
        }
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
        public void setDisplay_duration(int display_duration){
            this.display_duration = display_duration;
        }
        public int getDisplay_duration(){
            return this.display_duration;
        }
        public void setDownload_url(String download_url){
            this.download_url = download_url;
        }
        public String getDownload_url(){
            return this.download_url;
        }

    }

}
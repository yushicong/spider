package com.ysc.info.entity.toutiao;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

/**
 * Created by bjyushicong on 2017/2/14.
 */
public class TouTiaoADDtoContect {

    private Long id;

    private String log_extra;

    private Long read_count;

    private String media_name;

    private Long ban_comment;

    @JsonProperty("abstract")
    private String abstractString;

    private List<Image_list> image_list ;

    private boolean has_video;

    private Long article_type;

    private String tag;

    private Long has_m3u8_video;

    private String keywords;

    private String rid;

    private String label;

    private String stick_label;

    private boolean show_portrait_article;

    private Long user_verified;

    private Long aggr_type;

    private Long cell_type;

    private Long article_sub_type;

    private Long bury_count;

    private String title;

    private Long ignore_web_transform;

    private Long source_icon_style;

    private Long tip;

    private Long hot;

    private String share_url;

    private Long has_mp4_video;

    private String source;

    private Long comment_count;

    private String article_url;

    private List<Filter_words> filter_words ;

    private Long publish_time;

    private List<Action_list> action_list ;

    private Long gallary_image_count;

    private Long image_count;

    private Long cell_layout_style;

    private Long tag_id;

    private Long video_style;

    private String verified_content;

    private String display_url;

    private List<Large_image_list> large_image_list ;

    private Long item_id;

    private boolean is_subject;

    private boolean show_portrait;

    private Long repin_count;

    private Long cell_flag;

    private User_info user_info;

    private String source_open_url;

    private Long level;

    private Long like_count;

    private Long digg_count;

    private Long behot_time;

    private Long cursor;

    private String url;

    private Long preload_web;

    private Long user_repin;

    private boolean has_image;

    private Long item_version;

    private Media_info media_info;

    private Long group_id;

    private Middle_image middle_image;

    private Boolean is_stick;

    private Long stick_style;

    private String source_avatar;

    private String article_alt_url;

    private Long label_style;

    private String video_id;

    private Long group_flags;

    private Long gallary_style;

    private Long create_time;

    private Long gallary_flag;

    private Video_detail_info video_detail_info;

    private Long video_duration;

    private String open_url;

    private String source_desc;

    private List<Comments> comments;

    private Long expire_seconds;

    private Boolean more_mode;

    private String display_info;

    private Long ad_id;

    private String video_source;

    private Double video_proportion_article;

    private String city;

    private Long natant_level;

    private String ad_label;

    private String app_name;

    private String download_url;

    private String cell_ui_type;

    private Long rate;

    private Image image;

    private String type;

    private Long follow;

    private String tiny_toutiao_url;

    private String source_desc_open_url;

    private Ad_data ad_data;

    private Long max_text_line;

    private String description;

    private String appleid;

    private String content;

    private String schema;

    private Long ui_type;

    private User user;

    private Position position;

    private Forum forum;

    private Long thread_id;

    private Long inner_ui_flag;

    private String[] ad_track_url_list;

    private Long user_digg;

    private List<Friend_digg_list> friend_digg_list;

    private User_relation user_relation;

    private List<Thumb_image_list> thumb_image_list ;

    public List<Thumb_image_list> getThumb_image_list() {
        return thumb_image_list;
    }

    public void setThumb_image_list(List<Thumb_image_list> thumb_image_list) {
        this.thumb_image_list = thumb_image_list;
    }

    public User_relation getUser_relation() {
        return user_relation;
    }

    public void setUser_relation(User_relation user_relation) {
        this.user_relation = user_relation;
    }

    public List<Friend_digg_list> getFriend_digg_list() {
        return friend_digg_list;
    }

    public void setFriend_digg_list(List<Friend_digg_list> friend_digg_list) {
        this.friend_digg_list = friend_digg_list;
    }

    public Long getUser_digg() {
        return user_digg;
    }

    public void setUser_digg(Long user_digg) {
        this.user_digg = user_digg;
    }

    public String[] getAd_track_url_list() {
        return ad_track_url_list;
    }

    public void setAd_track_url_list(String[] ad_track_url_list) {
        this.ad_track_url_list = ad_track_url_list;
    }

    public Long getImage_count() {
        return image_count;
    }

    public void setImage_count(Long image_count) {
        this.image_count = image_count;
    }

    public Long getInner_ui_flag() {
        return inner_ui_flag;
    }

    public void setInner_ui_flag(Long inner_ui_flag) {
        this.inner_ui_flag = inner_ui_flag;
    }

    public Long getThread_id() {
        return thread_id;
    }

    public void setThread_id(Long thread_id) {
        this.thread_id = thread_id;
    }

    public Forum getForum() {
        return forum;
    }

    public void setForum(Forum forum) {
        this.forum = forum;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getUi_type() {
        return ui_type;
    }

    public void setUi_type(Long ui_type) {
        this.ui_type = ui_type;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAppleid() {
        return appleid;
    }

    public void setAppleid(String appleid) {
        this.appleid = appleid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getMax_text_line() {
        return max_text_line;
    }

    public void setMax_text_line(Long max_text_line) {
        this.max_text_line = max_text_line;
    }

    public Ad_data getAd_data() {
        return ad_data;
    }

    public void setAd_data(Ad_data ad_data) {
        this.ad_data = ad_data;
    }

    public String getSource_desc_open_url() {
        return source_desc_open_url;
    }

    public void setSource_desc_open_url(String source_desc_open_url) {
        this.source_desc_open_url = source_desc_open_url;
    }

    public String getTiny_toutiao_url() {
        return tiny_toutiao_url;
    }

    public void setTiny_toutiao_url(String tiny_toutiao_url) {
        this.tiny_toutiao_url = tiny_toutiao_url;
    }

    public Long getFollow() {
        return follow;
    }

    public void setFollow(Long follow) {
        this.follow = follow;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCell_ui_type() {
        return cell_ui_type;
    }

    public void setCell_ui_type(String cell_ui_type) {
        this.cell_ui_type = cell_ui_type;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public String getApp_name() {
        return app_name;
    }

    public void setApp_name(String app_name) {
        this.app_name = app_name;
    }

    public String getAd_label() {
        return ad_label;
    }

    public void setAd_label(String ad_label) {
        this.ad_label = ad_label;
    }

    public Long getNatant_level() {
        return natant_level;
    }

    public void setNatant_level(Long natant_level) {
        this.natant_level = natant_level;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getVideo_proportion_article() {
        return video_proportion_article;
    }

    public void setVideo_proportion_article(Double video_proportion_article) {
        this.video_proportion_article = video_proportion_article;
    }

    public String getVideo_source() {
        return video_source;
    }

    public void setVideo_source(String video_source) {
        this.video_source = video_source;
    }

    public Long getAd_id() {
        return ad_id;
    }

    public void setAd_id(Long ad_id) {
        this.ad_id = ad_id;
    }

    public String getDisplay_info() {
        return display_info;
    }

    public void setDisplay_info(String display_info) {
        this.display_info = display_info;
    }

    public Boolean getMore_mode() {
        return more_mode;
    }

    public void setMore_mode(Boolean more_mode) {
        this.more_mode = more_mode;
    }

    public Long getExpire_seconds() {
        return expire_seconds;
    }

    public void setExpire_seconds(Long expire_seconds) {
        this.expire_seconds = expire_seconds;
    }

    public String getLog_extra() {
        return log_extra;
    }

    public void setLog_extra(String log_extra) {
        this.log_extra = log_extra;
    }

    public List<Comments> getComments() {
        return comments;
    }

    public void setComments(List<Comments> comments) {
        this.comments = comments;
    }

    public String getSource_desc() {
        return source_desc;
    }

    public void setSource_desc(String source_desc) {
        this.source_desc = source_desc;
    }

    public String getOpen_url() {
        return open_url;
    }

    public void setOpen_url(String open_url) {
        this.open_url = open_url;
    }

    public Long getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(Long video_duration) {
        this.video_duration = video_duration;
    }

    public Video_detail_info getVideo_detail_info() {
        return video_detail_info;
    }

    public void setVideo_detail_info(Video_detail_info video_detail_info) {
        this.video_detail_info = video_detail_info;
    }

    public Long getGallary_flag() {
        return gallary_flag;
    }

    public void setGallary_flag(Long gallary_flag) {
        this.gallary_flag = gallary_flag;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getGallary_style() {
        return gallary_style;
    }

    public void setGallary_style(Long gallary_style) {
        this.gallary_style = gallary_style;
    }

    public Long getGroup_flags() {
        return group_flags;
    }

    public void setGroup_flags(Long group_flags) {
        this.group_flags = group_flags;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public Long getLabel_style() {
        return label_style;
    }

    public void setLabel_style(Long label_style) {
        this.label_style = label_style;
    }

    public String getArticle_alt_url() {
        return article_alt_url;
    }

    public void setArticle_alt_url(String article_alt_url) {
        this.article_alt_url = article_alt_url;
    }

    public String getSource_avatar() {
        return source_avatar;
    }

    public void setSource_avatar(String source_avatar) {
        this.source_avatar = source_avatar;
    }

    public Long getStick_style() {
        return stick_style;
    }

    public void setStick_style(Long stick_style) {
        this.stick_style = stick_style;
    }

    public Boolean getIs_stick() {
        return is_stick;
    }

    public void setIs_stick(Boolean is_stick) {
        this.is_stick = is_stick;
    }

    public boolean isHas_video() {
        return has_video;
    }

    public String getStick_label() {
        return stick_label;
    }

    public void setStick_label(String stick_label) {
        this.stick_label = stick_label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isShow_portrait_article() {
        return show_portrait_article;
    }

    public boolean is_subject() {
        return is_subject;
    }

    public boolean isShow_portrait() {
        return show_portrait;
    }

    public boolean isHas_image() {
        return has_image;
    }

    public void setRead_count(Long read_count){
        this.read_count = read_count;
    }
    public Long getRead_count(){
        return this.read_count;
    }
    public void setMedia_name(String media_name){
        this.media_name = media_name;
    }
    public String getMedia_name(){
        return this.media_name;
    }
    public void setBan_comment(Long ban_comment){
        this.ban_comment = ban_comment;
    }
    public Long getBan_comment(){
        return this.ban_comment;
    }
    public String getAbstractString() {
        return abstractString;
    }
    public void setAbstractString(String abstractString) {
        this.abstractString = abstractString;
    }
    public void setImage_list(List<Image_list> image_list){
        this.image_list = image_list;
    }
    public List<Image_list> getImage_list(){
        return this.image_list;
    }
    public void setHas_video(boolean has_video){
        this.has_video = has_video;
    }
    public boolean getHas_video(){
        return this.has_video;
    }
    public void setArticle_type(Long article_type){
        this.article_type = article_type;
    }
    public Long getArticle_type(){
        return this.article_type;
    }
    public void setTag(String tag){
        this.tag = tag;
    }
    public String getTag(){
        return this.tag;
    }
    public void setHas_m3u8_video(Long has_m3u8_video){
        this.has_m3u8_video = has_m3u8_video;
    }
    public Long getHas_m3u8_video(){
        return this.has_m3u8_video;
    }
    public void setKeywords(String keywords){
        this.keywords = keywords;
    }
    public String getKeywords(){
        return this.keywords;
    }
    public void setRid(String rid){
        this.rid = rid;
    }
    public String getRid(){
        return this.rid;
    }
    public void setShow_portrait_article(boolean show_portrait_article){
        this.show_portrait_article = show_portrait_article;
    }
    public boolean getShow_portrait_article(){
        return this.show_portrait_article;
    }
    public void setUser_verified(Long user_verified){
        this.user_verified = user_verified;
    }
    public Long getUser_verified(){
        return this.user_verified;
    }
    public void setAggr_type(Long aggr_type){
        this.aggr_type = aggr_type;
    }
    public Long getAggr_type(){
        return this.aggr_type;
    }
    public void setCell_type(Long cell_type){
        this.cell_type = cell_type;
    }
    public Long getCell_type(){
        return this.cell_type;
    }
    public void setArticle_sub_type(Long article_sub_type){
        this.article_sub_type = article_sub_type;
    }
    public Long getArticle_sub_type(){
        return this.article_sub_type;
    }
    public void setBury_count(Long bury_count){
        this.bury_count = bury_count;
    }
    public Long getBury_count(){
        return this.bury_count;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setIgnore_web_transform(Long ignore_web_transform){
        this.ignore_web_transform = ignore_web_transform;
    }
    public Long getIgnore_web_transform(){
        return this.ignore_web_transform;
    }
    public void setSource_icon_style(Long source_icon_style){
        this.source_icon_style = source_icon_style;
    }
    public Long getSource_icon_style(){
        return this.source_icon_style;
    }
    public void setTip(Long tip){
        this.tip = tip;
    }
    public Long getTip(){
        return this.tip;
    }
    public void setHot(Long hot){
        this.hot = hot;
    }
    public Long getHot(){
        return this.hot;
    }
    public void setShare_url(String share_url){
        this.share_url = share_url;
    }
    public String getShare_url(){
        return this.share_url;
    }
    public void setHas_mp4_video(Long has_mp4_video){
        this.has_mp4_video = has_mp4_video;
    }
    public Long getHas_mp4_video(){
        return this.has_mp4_video;
    }
    public void setSource(String source){
        this.source = source;
    }
    public String getSource(){
        return this.source;
    }
    public void setComment_count(Long comment_count){
        this.comment_count = comment_count;
    }
    public Long getComment_count(){
        return this.comment_count;
    }
    public void setArticle_url(String article_url){
        this.article_url = article_url;
    }
    public String getArticle_url(){
        return this.article_url;
    }
    public void setFilter_words(List<Filter_words> filter_words){
        this.filter_words = filter_words;
    }
    public List<Filter_words> getFilter_words(){
        return this.filter_words;
    }
    public void setPublish_time(Long publish_time){
        this.publish_time = publish_time;
    }
    public Long getPublish_time(){
        return this.publish_time;
    }
    public void setAction_list(List<Action_list> action_list){
        this.action_list = action_list;
    }
    public List<Action_list> getAction_list(){
        return this.action_list;
    }
    public void setGallary_image_count(Long gallary_image_count){
        this.gallary_image_count = gallary_image_count;
    }
    public Long getGallary_image_count(){
        return this.gallary_image_count;
    }
    public void setCell_layout_style(Long cell_layout_style){
        this.cell_layout_style = cell_layout_style;
    }
    public Long getCell_layout_style(){
        return this.cell_layout_style;
    }
    public void setTag_id(Long tag_id){
        this.tag_id = tag_id;
    }
    public Long getTag_id(){
        return this.tag_id;
    }
    public void setVideo_style(Long video_style){
        this.video_style = video_style;
    }
    public Long getVideo_style(){
        return this.video_style;
    }
    public void setVerified_content(String verified_content){
        this.verified_content = verified_content;
    }
    public String getVerified_content(){
        return this.verified_content;
    }
    public void setDisplay_url(String display_url){
        this.display_url = display_url;
    }
    public String getDisplay_url(){
        return this.display_url;
    }
    public void setLarge_image_list(List<Large_image_list> large_image_list){
        this.large_image_list = large_image_list;
    }
    public List<Large_image_list> getLarge_image_list(){
        return this.large_image_list;
    }
    public void setItem_id(Long item_id){
        this.item_id = item_id;
    }
    public Long getItem_id(){
        return this.item_id;
    }
    public void setIs_subject(boolean is_subject){
        this.is_subject = is_subject;
    }
    public boolean getIs_subject(){
        return this.is_subject;
    }
    public void setShow_portrait(boolean show_portrait){
        this.show_portrait = show_portrait;
    }
    public boolean getShow_portrait(){
        return this.show_portrait;
    }
    public void setRepin_count(Long repin_count){
        this.repin_count = repin_count;
    }
    public Long getRepin_count(){
        return this.repin_count;
    }
    public void setCell_flag(Long cell_flag){
        this.cell_flag = cell_flag;
    }
    public Long getCell_flag(){
        return this.cell_flag;
    }
    public void setUser_info(User_info user_info){
        this.user_info = user_info;
    }
    public User_info getUser_info(){
        return this.user_info;
    }
    public void setSource_open_url(String source_open_url){
        this.source_open_url = source_open_url;
    }
    public String getSource_open_url(){
        return this.source_open_url;
    }
    public void setLevel(Long level){
        this.level = level;
    }
    public Long getLevel(){
        return this.level;
    }
    public void setLike_count(Long like_count){
        this.like_count = like_count;
    }
    public Long getLike_count(){
        return this.like_count;
    }
    public void setDigg_count(Long digg_count){
        this.digg_count = digg_count;
    }
    public Long getDigg_count(){
        return this.digg_count;
    }
    public void setBehot_time(Long behot_time){
        this.behot_time = behot_time;
    }
    public Long getBehot_time(){
        return this.behot_time;
    }
    public void setCursor(Long cursor){
        this.cursor = cursor;
    }
    public Long getCursor(){
        return this.cursor;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setPreload_web(Long preload_web){
        this.preload_web = preload_web;
    }
    public Long getPreload_web(){
        return this.preload_web;
    }
    public void setUser_repin(Long user_repin){
        this.user_repin = user_repin;
    }
    public Long getUser_repin(){
        return this.user_repin;
    }
    public void setHas_image(boolean has_image){
        this.has_image = has_image;
    }
    public boolean getHas_image(){
        return this.has_image;
    }
    public void setItem_version(Long item_version){
        this.item_version = item_version;
    }
    public Long getItem_version(){
        return this.item_version;
    }
    public void setMedia_info(Media_info media_info){
        this.media_info = media_info;
    }
    public Media_info getMedia_info(){
        return this.media_info;
    }
    public void setGroup_id(Long group_id){
        this.group_id = group_id;
    }
    public Long getGroup_id(){
        return this.group_id;
    }
    public void setMiddle_image(Middle_image middle_image){
        this.middle_image = middle_image;
    }
    public Middle_image getMiddle_image(){
        return this.middle_image;
    }


    public static class Position {
        private String position;

        public void setPosition(String position){
            this.position = position;
        }
        public String getPosition(){
            return this.position;
        }

    }

    public static class Thumb_image_list {
        private String url;

        private List<Url_list> url_list ;

        private String uri;

        private int height;

        private int width;

        private int type;

        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setUrl_list(List<Url_list> url_list){
            this.url_list = url_list;
        }
        public List<Url_list> getUrl_list(){
            return this.url_list;
        }
        public void setUri(String uri){
            this.uri = uri;
        }
        public String getUri(){
            return this.uri;
        }
        public void setHeight(int height){
            this.height = height;
        }
        public int getHeight(){
            return this.height;
        }
        public void setWidth(int width){
            this.width = width;
        }
        public int getWidth(){
            return this.width;
        }
        public void setType(int type){
            this.type = type;
        }
        public int getType(){
            return this.type;
        }

    }

    public static class User_relation {
        private User_info user_info;

        private int reply_count;

        private String recommend_reason;

        public void setUser_info(User_info user_info){
            this.user_info = user_info;
        }
        public User_info getUser_info(){
            return this.user_info;
        }
        public void setReply_count(int reply_count){
            this.reply_count = reply_count;
        }
        public int getReply_count(){
            return this.reply_count;
        }
        public void setRecommend_reason(String recommend_reason){
            this.recommend_reason = recommend_reason;
        }
        public String getRecommend_reason(){
            return this.recommend_reason;
        }

    }

    public static class Friend_digg_list {

    }

    public static class Extra {

    }

    public static class Forum {
        private Long onlookers_count;

        private String banner_url;

        private String forum_name;

        private Long concern_id;

        private Long forum_id;

        private Long like_time;

        private Long talk_count;

        private String schema;

        public void setOnlookers_count(Long onlookers_count){
            this.onlookers_count = onlookers_count;
        }
        public Long getOnlookers_count(){
            return this.onlookers_count;
        }
        public void setBanner_url(String banner_url){
            this.banner_url = banner_url;
        }
        public String getBanner_url(){
            return this.banner_url;
        }
        public void setForum_name(String forum_name){
            this.forum_name = forum_name;
        }
        public String getForum_name(){
            return this.forum_name;
        }
        public void setConcern_id(Long concern_id){
            this.concern_id = concern_id;
        }
        public Long getConcern_id(){
            return this.concern_id;
        }
        public void setForum_id(Long forum_id){
            this.forum_id = forum_id;
        }
        public Long getForum_id(){
            return this.forum_id;
        }
        public void setLike_time(Long like_time){
            this.like_time = like_time;
        }
        public Long getLike_time(){
            return this.like_time;
        }
        public void setTalk_count(Long talk_count){
            this.talk_count = talk_count;
        }
        public Long getTalk_count(){
            return this.talk_count;
        }
        public void setSchema(String schema){
            this.schema = schema;
        }
        public String getSchema(){
            return this.schema;
        }

    }


    public static class User {
        private Long is_blocking;

        private Long user_id;

        private String screen_name;

        private Long is_friend;

        private String verified_content;

        private String schema;

        private String avatar_url;

        private Long is_following;

        private String user_auth_info;

        private Long is_blocked;

        private Long user_verified;

        private String desc;

        public void setIs_blocking(Long is_blocking){
            this.is_blocking = is_blocking;
        }
        public Long getIs_blocking(){
            return this.is_blocking;
        }
        public void setUser_id(Long user_id){
            this.user_id = user_id;
        }
        public Long getUser_id(){
            return this.user_id;
        }
        public void setScreen_name(String screen_name){
            this.screen_name = screen_name;
        }
        public String getScreen_name(){
            return this.screen_name;
        }
        public void setIs_friend(Long is_friend){
            this.is_friend = is_friend;
        }
        public Long getIs_friend(){
            return this.is_friend;
        }
        public void setVerified_content(String verified_content){
            this.verified_content = verified_content;
        }
        public String getVerified_content(){
            return this.verified_content;
        }
        public void setSchema(String schema){
            this.schema = schema;
        }
        public String getSchema(){
            return this.schema;
        }
        public void setAvatar_url(String avatar_url){
            this.avatar_url = avatar_url;
        }
        public String getAvatar_url(){
            return this.avatar_url;
        }
        public void setIs_following(Long is_following){
            this.is_following = is_following;
        }
        public Long getIs_following(){
            return this.is_following;
        }
        public void setUser_auth_info(String user_auth_info){
            this.user_auth_info = user_auth_info;
        }
        public String getUser_auth_info(){
            return this.user_auth_info;
        }
        public void setIs_blocked(Long is_blocked){
            this.is_blocked = is_blocked;
        }
        public Long getIs_blocked(){
            return this.is_blocked;
        }
        public void setUser_verified(Long user_verified){
            this.user_verified = user_verified;
        }
        public Long getUser_verified(){
            return this.user_verified;
        }
        public void setDesc(String desc){
            this.desc = desc;
        }
        public String getDesc(){
            return this.desc;
        }

    }




    public static class Ad_data {
        private String log_extra;

        private String phone_number;

        private String game_key;

        private String star;

        private String orientation;

        private String form_height;

        private String track_url;

        private Long button_icon;

        private String form_url;

        private Long display_type;

        private String alert_text;

        private Long id;

        private String description;

        private String click_track_url;

        private Long dial_action_type;

        private String use_size_validation;

        private String form_width;

        private String title;

        private List<Click_track_url_list> click_track_url_list ;

        private String label;

        private String source;

        private String btn_text;

        private List<Track_url_list> track_url_list ;

        private String game_name;

        private String type;

        private Image image;

        public void setLog_extra(String log_extra){
            this.log_extra = log_extra;
        }
        public String getLog_extra(){
            return this.log_extra;
        }
        public void setPhone_number(String phone_number){
            this.phone_number = phone_number;
        }
        public String getPhone_number(){
            return this.phone_number;
        }
        public void setGame_key(String game_key){
            this.game_key = game_key;
        }
        public String getGame_key(){
            return this.game_key;
        }
        public void setStar(String star){
            this.star = star;
        }
        public String getStar(){
            return this.star;
        }
        public void setOrientation(String orientation){
            this.orientation = orientation;
        }
        public String getOrientation(){
            return this.orientation;
        }
        public void setForm_height(String form_height){
            this.form_height = form_height;
        }
        public String getForm_height(){
            return this.form_height;
        }
        public void setTrack_url(String track_url){
            this.track_url = track_url;
        }
        public String getTrack_url(){
            return this.track_url;
        }
        public void setButton_icon(Long button_icon){
            this.button_icon = button_icon;
        }
        public Long getButton_icon(){
            return this.button_icon;
        }
        public void setForm_url(String form_url){
            this.form_url = form_url;
        }
        public String getForm_url(){
            return this.form_url;
        }
        public void setDisplay_type(Long display_type){
            this.display_type = display_type;
        }
        public Long getDisplay_type(){
            return this.display_type;
        }
        public void setAlert_text(String alert_text){
            this.alert_text = alert_text;
        }
        public String getAlert_text(){
            return this.alert_text;
        }
        public void setId(Long id){
            this.id = id;
        }
        public Long getId(){
            return this.id;
        }
        public void setDescription(String description){
            this.description = description;
        }
        public String getDescription(){
            return this.description;
        }
        public void setClick_track_url(String click_track_url){
            this.click_track_url = click_track_url;
        }
        public String getClick_track_url(){
            return this.click_track_url;
        }
        public void setDial_action_type(Long dial_action_type){
            this.dial_action_type = dial_action_type;
        }
        public Long getDial_action_type(){
            return this.dial_action_type;
        }
        public void setUse_size_validation(String use_size_validation){
            this.use_size_validation = use_size_validation;
        }
        public String getUse_size_validation(){
            return this.use_size_validation;
        }
        public void setForm_width(String form_width){
            this.form_width = form_width;
        }
        public String getForm_width(){
            return this.form_width;
        }
        public void setTitle(String title){
            this.title = title;
        }
        public String getTitle(){
            return this.title;
        }
        public void setClick_track_url_list(List<Click_track_url_list> click_track_url_list){
            this.click_track_url_list = click_track_url_list;
        }
        public List<Click_track_url_list> getClick_track_url_list(){
            return this.click_track_url_list;
        }
        public void setLabel(String label){
            this.label = label;
        }
        public String getLabel(){
            return this.label;
        }
        public void setSource(String source){
            this.source = source;
        }
        public String getSource(){
            return this.source;
        }
        public void setBtn_text(String btn_text){
            this.btn_text = btn_text;
        }
        public String getBtn_text(){
            return this.btn_text;
        }
        public void setTrack_url_list(List<Track_url_list> track_url_list){
            this.track_url_list = track_url_list;
        }
        public List<Track_url_list> getTrack_url_list(){
            return this.track_url_list;
        }
        public void setGame_name(String game_name){
            this.game_name = game_name;
        }
        public String getGame_name(){
            return this.game_name;
        }
        public void setType(String type){
            this.type = type;
        }
        public String getType(){
            return this.type;
        }
        public void setImage(Image image){
            this.image = image;
        }
        public Image getImage(){
            return this.image;
        }

    }

    public static class Track_url_list {

    }

    public static class Click_track_url_list {

    }

    public static class Comments {

    }

    public static class Image {
        private String url;

        private Long width;

        private List<Url_list> url_list ;

        private String uri;

        private Long height;

        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setWidth(Long width){
            this.width = width;
        }
        public Long getWidth(){
            return this.width;
        }
        public void setUrl_list(List<Url_list> url_list){
            this.url_list = url_list;
        }
        public List<Url_list> getUrl_list(){
            return this.url_list;
        }
        public void setUri(String uri){
            this.uri = uri;
        }
        public String getUri(){
            return this.uri;
        }
        public void setHeight(Long height){
            this.height = height;
        }
        public Long getHeight(){
            return this.height;
        }

    }

    public static class Video_detail_info {
        private Long show_pgc_subscribe;

        private Long video_preloading_flag;

        private Long group_flags;

        private Long direct_play;

        private Detail_video_large_image detail_video_large_image;

        private String video_id;

        private Long video_watch_count;

        private Long video_type;

        private Long video_watching_count;

        public void setShow_pgc_subscribe(Long show_pgc_subscribe){
            this.show_pgc_subscribe = show_pgc_subscribe;
        }
        public Long getShow_pgc_subscribe(){
            return this.show_pgc_subscribe;
        }
        public void setVideo_preloading_flag(Long video_preloading_flag){
            this.video_preloading_flag = video_preloading_flag;
        }
        public Long getVideo_preloading_flag(){
            return this.video_preloading_flag;
        }
        public void setGroup_flags(Long group_flags){
            this.group_flags = group_flags;
        }
        public Long getGroup_flags(){
            return this.group_flags;
        }
        public void setDirect_play(Long direct_play){
            this.direct_play = direct_play;
        }
        public Long getDirect_play(){
            return this.direct_play;
        }
        public void setDetail_video_large_image(Detail_video_large_image detail_video_large_image){
            this.detail_video_large_image = detail_video_large_image;
        }
        public Detail_video_large_image getDetail_video_large_image(){
            return this.detail_video_large_image;
        }
        public void setVideo_id(String video_id){
            this.video_id = video_id;
        }
        public String getVideo_id(){
            return this.video_id;
        }
        public void setVideo_watch_count(Long video_watch_count){
            this.video_watch_count = video_watch_count;
        }
        public Long getVideo_watch_count(){
            return this.video_watch_count;
        }
        public void setVideo_type(Long video_type){
            this.video_type = video_type;
        }
        public Long getVideo_type(){
            return this.video_type;
        }
        public void setVideo_watching_count(Long video_watching_count){
            this.video_watching_count = video_watching_count;
        }
        public Long getVideo_watching_count(){
            return this.video_watching_count;
        }

    }

    public static class Detail_video_large_image {
        private String url;

        private Long width;

        private List<Url_list> url_list ;

        private String uri;

        private Long height;

        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setWidth(Long width){
            this.width = width;
        }
        public Long getWidth(){
            return this.width;
        }
        public void setUrl_list(List<Url_list> url_list){
            this.url_list = url_list;
        }
        public List<Url_list> getUrl_list(){
            return this.url_list;
        }
        public void setUri(String uri){
            this.uri = uri;
        }
        public String getUri(){
            return this.uri;
        }
        public void setHeight(Long height){
            this.height = height;
        }
        public Long getHeight(){
            return this.height;
        }

    }

    public static class Large_image_list {
        private String url;

        private Long width;

        private List<Url_list> url_list ;

        private String uri;

        private Long height;

        private Long type;

        public Long getType() {
            return type;
        }

        public void setType(Long type) {
            this.type = type;
        }

        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setWidth(Long width){
            this.width = width;
        }
        public Long getWidth(){
            return this.width;
        }
        public void setUrl_list(List<Url_list> url_list){
            this.url_list = url_list;
        }
        public List<Url_list> getUrl_list(){
            return this.url_list;
        }
        public void setUri(String uri){
            this.uri = uri;
        }
        public String getUri(){
            return this.uri;
        }
        public void setHeight(Long height){
            this.height = height;
        }
        public Long getHeight(){
            return this.height;
        }

    }


    public static class Action_list {
        private Long action;

        private Extra extra;

        private String desc;

        public void setAction(Long action){
            this.action = action;
        }
        public Long getAction(){
            return this.action;
        }
        public void setExtra(Extra extra){
            this.extra = extra;
        }
        public Extra getExtra(){
            return this.extra;
        }
        public void setDesc(String desc){
            this.desc = desc;
        }
        public String getDesc(){
            return this.desc;
        }

    }


    public static class Filter_words {
        private String id;

        private String name;

        private boolean is_selected;

        public void setId(String id){
            this.id = id;
        }
        public String getId(){
            return this.id;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setIs_selected(boolean is_selected){
            this.is_selected = is_selected;
        }
        public boolean getIs_selected(){
            return this.is_selected;
        }

    }

    public static class Image_list {
        private String url;

        private Long width;

        private List<Url_list> url_list ;

        private String uri;

        private Long height;

        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setWidth(Long width){
            this.width = width;
        }
        public Long getWidth(){
            return this.width;
        }
        public void setUrl_list(List<Url_list> url_list){
            this.url_list = url_list;
        }
        public List<Url_list> getUrl_list(){
            return this.url_list;
        }
        public void setUri(String uri){
            this.uri = uri;
        }
        public String getUri(){
            return this.uri;
        }
        public void setHeight(Long height){
            this.height = height;
        }
        public Long getHeight(){
            return this.height;
        }

    }

    public static class Url_list {
        private String url;

        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }

    }

    public static class Middle_image {

        public static class Url_list {
            private String url;

            public void setUrl(String url){
                this.url = url;
            }
            public String getUrl(){
                return this.url;
            }

        }

        private String url;

        private Long width;

        private List<Url_list> url_list ;

        private String uri;

        private Long height;

        public void setUrl(String url){
            this.url = url;
        }
        public String getUrl(){
            return this.url;
        }
        public void setWidth(Long width){
            this.width = width;
        }
        public Long getWidth(){
            return this.width;
        }
        public void setUrl_list(List<Url_list> url_list){
            this.url_list = url_list;
        }
        public List<Url_list> getUrl_list(){
            return this.url_list;
        }
        public void setUri(String uri){
            this.uri = uri;
        }
        public String getUri(){
            return this.uri;
        }
        public void setHeight(Long height){
            this.height = height;
        }
        public Long getHeight(){
            return this.height;
        }

    }

    public static class Media_info {
        private Long user_id;

        private String verified_content;

        private String avatar_url;

        private Long media_id;

        private String name;

        private Long recommend_type;

        private boolean follow;

        private String recommend_reason;

        private boolean is_star_user;

        private boolean user_verified;

        public void setUser_id(Long user_id){
            this.user_id = user_id;
        }
        public Long getUser_id(){
            return this.user_id;
        }
        public void setVerified_content(String verified_content){
            this.verified_content = verified_content;
        }
        public String getVerified_content(){
            return this.verified_content;
        }
        public void setAvatar_url(String avatar_url){
            this.avatar_url = avatar_url;
        }
        public String getAvatar_url(){
            return this.avatar_url;
        }
        public void setMedia_id(Long media_id){
            this.media_id = media_id;
        }
        public Long getMedia_id(){
            return this.media_id;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setRecommend_type(Long recommend_type){
            this.recommend_type = recommend_type;
        }
        public Long getRecommend_type(){
            return this.recommend_type;
        }
        public void setFollow(boolean follow){
            this.follow = follow;
        }
        public boolean getFollow(){
            return this.follow;
        }
        public void setRecommend_reason(String recommend_reason){
            this.recommend_reason = recommend_reason;
        }
        public String getRecommend_reason(){
            return this.recommend_reason;
        }
        public void setIs_star_user(boolean is_star_user){
            this.is_star_user = is_star_user;
        }
        public boolean getIs_star_user(){
            return this.is_star_user;
        }
        public void setUser_verified(boolean user_verified){
            this.user_verified = user_verified;
        }
        public boolean getUser_verified(){
            return this.user_verified;
        }

    }


    public static class User_info {
        private String verified_content;

        private String avatar_url;

        private Long user_id;

        private String name;

        private Long follower_count;

        private boolean follow;

        private String user_auth_info;

        private boolean user_verified;

        private String description;

        public void setVerified_content(String verified_content){
            this.verified_content = verified_content;
        }
        public String getVerified_content(){
            return this.verified_content;
        }
        public void setAvatar_url(String avatar_url){
            this.avatar_url = avatar_url;
        }
        public String getAvatar_url(){
            return this.avatar_url;
        }
        public void setUser_id(Long user_id){
            this.user_id = user_id;
        }
        public Long getUser_id(){
            return this.user_id;
        }
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
        public void setFollower_count(Long follower_count){
            this.follower_count = follower_count;
        }
        public Long getFollower_count(){
            return this.follower_count;
        }
        public void setFollow(boolean follow){
            this.follow = follow;
        }
        public boolean getFollow(){
            return this.follow;
        }
        public void setUser_auth_info(String user_auth_info){
            this.user_auth_info = user_auth_info;
        }
        public String getUser_auth_info(){
            return this.user_auth_info;
        }
        public void setUser_verified(boolean user_verified){
            this.user_verified = user_verified;
        }
        public boolean getUser_verified(){
            return this.user_verified;
        }
        public void setDescription(String description){
            this.description = description;
        }
        public String getDescription(){
            return this.description;
        }

    }
}

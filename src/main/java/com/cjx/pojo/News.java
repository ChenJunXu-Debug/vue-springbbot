/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: News
 * Author:   ASUS
 * Date:     2019/10/14 16:53
 * Description: 新闻实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.pojo;


/**
 * 〈一句话功能简述〉<br> 
 * 〈新闻实体类〉
 *
 * @author ASUS
 * @create 2019/10/14
 * @since 1.0.0
 */
public class News {
    private int id;
    private String imgUrl;//标题图片路径
    private String title;//标题
    private String addTime;//发表时间
    private int click;//点击次数
    private String content;//内容 HTML格式 含标签

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

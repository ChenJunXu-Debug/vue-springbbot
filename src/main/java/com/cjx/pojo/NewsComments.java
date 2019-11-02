/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: NewsComments
 * Author:   ASUS
 * Date:     2019/10/15 23:05
 * Description: 新闻评论
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈新闻评论〉
 *
 * @author ASUS
 * @create 2019/10/15
 * @since 1.0.0
 */
public class NewsComments {
    private int id;
    private int newsId;//所属新闻的id
    private String userName;//发表评论的用户
    private String cTime;//发表时间
    private String content;//发表内容

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNewsId() {
        return newsId;
    }

    public void setNewsId(int newsId) {
        this.newsId = newsId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

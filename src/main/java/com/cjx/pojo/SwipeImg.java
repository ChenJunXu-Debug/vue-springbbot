/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SwipeImg
 * Author:   ASUS
 * Date:     2019/10/10 20:41
 * Description: 轮播图片
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈轮播图片〉
 *
 * @author ASUS
 * @create 2019/10/10
 * @since 1.0.0
 */
public class SwipeImg {
    private String url;
    private int id;

    public SwipeImg() {
    }

    public SwipeImg(String url, int id) {
        this.url = url;
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

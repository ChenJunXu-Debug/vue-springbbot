/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Photos
 * Author:   ASUS
 * Date:     2019/10/17 22:59
 * Description: 图片分享
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈图片分享〉
 *
 * @author ASUS
 * @create 2019/10/17
 * @since 1.0.0
 */
public class Photos {
    private int id;
    //分类 0(全部) 1（自然风光）2（城市旅游）3（动物图片）4（植物花卉）
    //5（海洋世界）6（人物图片）
    private int category;
    private String imgUrl;//图片地址的数组"['', '']"
    private String title;
    private String content;
    private String cTime;
    private int click;//点击/观看次数

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getcTime() {
        return cTime;
    }

    public void setcTime(String cTime) {
        this.cTime = cTime;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}

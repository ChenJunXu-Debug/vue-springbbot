/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GoodsComments
 * Author:   ASUS
 * Date:     2019/10/20 17:41
 * Description: 商品评论
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品评论〉
 *
 * @author ASUS
 * @create 2019/10/20
 * @since 1.0.0
 */
public class GoodsComments {
    private int id;
    private int goodsId;
    private String Comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    public String getComments() {
        return Comments;
    }

    public void setComments(String comments) {
        Comments = comments;
    }
}

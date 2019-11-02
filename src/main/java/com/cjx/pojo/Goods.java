/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Goods
 * Author:   ASUS
 * Date:     2019/10/20 17:21
 * Description: 商品类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.pojo;

/**
 * 〈一句话功能简述〉<br> 
 * 〈商品类〉
 *
 * @author ASUS
 * @create 2019/10/20
 * @since 1.0.0
 */
public class Goods {
    private int id;
    private String imgs;//轮播图数组 第一张作为封面
    private String title;
    private double marketPrice;//市场价
    private double sellPrice;//销售价
    private int stock;//商品存量
    private int goodsNo;//商品号
    private String addTime;//上架时间
    private String desc;//商品描述 html格式

    public int getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(int goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

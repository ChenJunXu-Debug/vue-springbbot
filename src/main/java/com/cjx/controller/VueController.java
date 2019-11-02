/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: VueController
 * Author:   ASUS
 * Date:     2019/10/10 20:36
 * Description: 接口类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cjx.controller;

import com.cjx.dao.GoodsMapper;
import com.cjx.dao.NewsCommentsMapper;
import com.cjx.dao.NewsMapper;
import com.cjx.dao.PhotosMapper;
import com.cjx.pojo.*;
import com.cjx.vo.Resp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈接口类〉
 *
 * @author ASUS
 * @create 2019/10/10
 * @since 1.0.0
 */
@Controller
public class VueController {
    @Autowired
    private NewsMapper newsMapper;
    @Autowired
    private NewsCommentsMapper newsCommentsMapper;
    @Autowired
    private PhotosMapper photosMapper;
    @Autowired
    private GoodsMapper goodsMapper;

    //首页
    @RequestMapping("/")
    public String index(){
        return "index.html";
    }

    //首页轮播图
    @RequestMapping("getSwipeImgs")
    @ResponseBody
    public MappingJacksonValue getSwipeImgs(String callback){
        Resp resp = new Resp();
        resp.setStatus(0);
        List<SwipeImg>list  = new ArrayList<>();
        /*list.add(new SwipeImg("http://localhost/1.jpg", 1));
        list.add(new SwipeImg("http://localhost/2.jpg", 2));
        list.add(new SwipeImg("http://localhost/3.jpg", 3));*/
        list.add(new SwipeImg("http://106.54.61.253/1.jpg", 1));
        list.add(new SwipeImg("http://106.54.61.253/2.jpg", 2));
        list.add(new SwipeImg("http://106.54.61.253/3.jpg", 3));
        resp.setMessage(list);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //新闻集
    @RequestMapping(value = "getNewsList")
    @ResponseBody
    public MappingJacksonValue getNewsList(String callback){
        List<News> list = newsMapper.findAll();
        for(News n: list){
            n.setContent("");
        }
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(list);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //根据id获取新闻详细信息
    @RequestMapping(value = "getNewsById/{id}")
    @ResponseBody
    public MappingJacksonValue getNewsById(@PathVariable int id, String callback){
        News news = newsMapper.findById(id);
        newsMapper.addClick( id );
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(news);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //获取新闻评论
    @RequestMapping(value = "getNewsComments/{newsId}/{pageIndex}")
    @ResponseBody
    public MappingJacksonValue getCommentsByNewsId(@PathVariable int newsId, @PathVariable int pageIndex, String callback){
        int start = (pageIndex - 1)*4;//默认一页4条数据
        List<NewsComments> list = newsCommentsMapper.findByNewsId(newsId, start, 4);
//        Collections.reverse(list);
        System.out.println( list.size() );
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(list);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //添加新闻评论
    @RequestMapping(value = "addNewsComment/{newsId}/{userName}/{content}")
    @ResponseBody
    public MappingJacksonValue addNewsComment(@PathVariable int newsId, @PathVariable String userName,
                                              @PathVariable String content, String callback){
        NewsComments newsComments = new NewsComments();
        if(userName == null||userName.equals("")){
            userName = "匿名用户";
        }
        newsComments.setUserName(userName);
        newsComments.setNewsId(newsId);
        String date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
        newsComments.setcTime(date);
        newsComments.setContent(content);
        newsCommentsMapper.addNewsComment(newsComments);
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(newsComments);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //根据分类获取图片（0表示全部）
    @RequestMapping(value = "findPhotos/{category}")
    @ResponseBody
    public MappingJacksonValue findPhotosByCategory(@PathVariable int category, String callback){
        List<Photos> list;
        if(category == 0){
            list = photosMapper.findAll();
        }else{
            list = photosMapper.findByCate(category);
        }
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(list);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //根据id获取图片详细信息
    @RequestMapping(value = "findPhotoById/{id}")
    @ResponseBody
    public MappingJacksonValue findPhotoById(@PathVariable int id, String callback){
        Photos photo = photosMapper.findById(id);
        photosMapper.addClick(id);
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(photo);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //获取商品列表
    @RequestMapping(value = "getGoodsList/{pageIndex}")
    @ResponseBody
    public MappingJacksonValue getGoodsList(@PathVariable int pageIndex, String callback){
        int start = (pageIndex - 1) * 4;//默认一页4条数据
        List<Goods> list = goodsMapper.findGoodsList(start);
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(list);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }

    //根据id获取商品
    @RequestMapping(value = "getGoodsInfo/{id}")
    @ResponseBody
    public MappingJacksonValue getGoodsInfoById(@PathVariable int id, String callback){
        Goods goods= goodsMapper.findGoodsById(id);
        Resp resp = new Resp();
        resp.setStatus(0);
        resp.setMessage(goods);
        MappingJacksonValue mjv = new MappingJacksonValue(resp);
        mjv.setJsonpFunction(callback);
        return mjv;
    }
}

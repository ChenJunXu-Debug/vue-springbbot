package com.cjx.dao;

import com.cjx.pojo.NewsComments;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NewsCommentsMapper {
    List<NewsComments> findByNewsId(int newsId, int start, int pageNum);
    void addNewsComment(NewsComments newsComments);
}

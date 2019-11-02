package com.cjx.dao;

import com.cjx.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NewsMapper {
    List<News> findAll();
    News findById(int id);
    void testIns();
    void addClick(int id);
}

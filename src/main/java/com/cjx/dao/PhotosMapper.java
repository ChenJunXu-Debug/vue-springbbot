package com.cjx.dao;

import com.cjx.pojo.Photos;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PhotosMapper {
    List<Photos> findAll();
    List<Photos> findByCate(int category);
    Photos findById(int id);
    void addClick(int id);
}

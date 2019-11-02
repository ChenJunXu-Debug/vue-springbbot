package com.cjx.dao;

import com.cjx.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface GoodsMapper {
    List<Goods> findGoodsList(int start);

    Goods findGoodsById(int id);
}

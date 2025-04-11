package com.dao;

import com.entity.XunlianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XunlianView;

/**
 * 训练 Dao 接口
 *
 * @author 
 */
public interface XunlianDao extends BaseMapper<XunlianEntity> {

   List<XunlianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

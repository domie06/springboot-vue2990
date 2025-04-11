package com.dao;

import com.entity.BiyexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.BiyexinxiView;

/**
 * 毕业信息 Dao 接口
 *
 * @author 
 */
public interface BiyexinxiDao extends BaseMapper<BiyexinxiEntity> {

   List<BiyexinxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

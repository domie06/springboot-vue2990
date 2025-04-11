package com.dao;

import com.entity.KaoshiyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshiyuyueView;

/**
 * 考试预约 Dao 接口
 *
 * @author 
 */
public interface KaoshiyuyueDao extends BaseMapper<KaoshiyuyueEntity> {

   List<KaoshiyuyueView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

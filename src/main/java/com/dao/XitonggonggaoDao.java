package com.dao;

import com.entity.XitonggonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XitonggonggaoView;

/**
 * 系统公告 Dao 接口
 *
 * @since 2021-03-15
 */
public interface XitonggonggaoDao extends BaseMapper<XitonggonggaoEntity> {

   List<XitonggonggaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

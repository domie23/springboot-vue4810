package com.dao;

import com.entity.JieyuezheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JieyuezheVO;
import com.entity.view.JieyuezheView;


/**
 * 借阅者
 * 
 * @author 
 * @email 
 * @date 2023-04-24 23:01:35
 */
public interface JieyuezheDao extends BaseMapper<JieyuezheEntity> {
	
	List<JieyuezheVO> selectListVO(@Param("ew") Wrapper<JieyuezheEntity> wrapper);
	
	JieyuezheVO selectVO(@Param("ew") Wrapper<JieyuezheEntity> wrapper);
	
	List<JieyuezheView> selectListView(@Param("ew") Wrapper<JieyuezheEntity> wrapper);

	List<JieyuezheView> selectListView(Pagination page,@Param("ew") Wrapper<JieyuezheEntity> wrapper);
	
	JieyuezheView selectView(@Param("ew") Wrapper<JieyuezheEntity> wrapper);
	

}

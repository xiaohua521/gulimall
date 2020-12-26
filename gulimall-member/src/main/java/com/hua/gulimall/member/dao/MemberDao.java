package com.hua.gulimall.member.dao;

import com.hua.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author quzhenhua
 * @email zhenhua708@163.com
 * @date 2020-12-26 10:12:00
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

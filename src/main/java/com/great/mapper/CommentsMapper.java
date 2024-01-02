package com.great.mapper;

import com.great.entity.Comments;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@Mapper
public interface CommentsMapper extends BaseMapper<Comments> {

}

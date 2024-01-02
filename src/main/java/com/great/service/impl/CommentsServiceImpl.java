package com.great.service.impl;

import com.great.entity.Comments;
import com.great.mapper.CommentsMapper;
import com.great.service.CommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author zhangzl1
 * @since 2023-12-24
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements CommentsService {

}

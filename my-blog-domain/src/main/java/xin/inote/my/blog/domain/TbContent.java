package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 * 文章表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbContent extends BaseEntity {
    //作者id
    private int authorId;
    //文章分类id
    private int classifyId;
    //文章标题
    private String title;
    //自定义文章地址
    private String slug;
    //文章内容
    private String content;
    //文章状态
    private boolean status;
    //文章标签
    private String tags;
    //文章点击量
    private int his;
    //评论数量
    private int commentNum;
    //是否允许评论
    private boolean allowComment;

}

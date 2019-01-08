package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 * 评论表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbComment extends BaseEntity {
    //文章id
    private int contentId;
    //作者名称
    private String author;
    //作业邮箱
    private String email;
    //作者网站
    private String url;
    //作者ip
    private String ip;
    //作者评论内容
    private String content;
    //状态
    private boolean stauts;
    //父id
    private int parent;
}

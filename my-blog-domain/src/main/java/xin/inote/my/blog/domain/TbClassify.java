package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 * 文章分类表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbClassify extends BaseEntity {
    //分类名称
    private String name;
    //分类权重
    private int top;
    //自定义分类地址
    private String slug;
}

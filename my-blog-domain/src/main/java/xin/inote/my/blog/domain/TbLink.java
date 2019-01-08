package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 * 友情链接表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbLink extends BaseEntity {
    //友情链接名称
    private String name;
    //友情链接地址
    private String url;
}

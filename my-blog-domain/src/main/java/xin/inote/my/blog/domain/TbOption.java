package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 * 设置表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbOption extends BaseEntity {
    //名称
    private String name;
    //值
    private String value;
}

package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 *资源表，用来储存附件信息。
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbAttach extends BaseEntity {
    //资源名称
    private String name;
    //作者id
    private int authorId;
    //资源类型
    private String type;
    //资源路径
    private String path;
}

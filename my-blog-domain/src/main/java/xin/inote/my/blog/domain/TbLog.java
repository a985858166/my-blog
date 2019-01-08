package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 * 日志表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbLog extends BaseEntity {
    //操作事件
    private String action;
    //涉及的数据
    private String data;
    //操作者Id
    private int authorId;
    //操作者ip
    private String ip;
}

package xin.inote.my.blog.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import xin.inote.my.blog.commons.persistence.BaseEntity;

/**
 * 用户表
 */
@Data
@EqualsAndHashCode(callSuper=true)
public class TbUser extends BaseEntity {
    //管理员登录名
    private String username;
    //密码
    private String password;
    //管理员名称
    private String screenName;
    //管理员邮箱
    private String email;
}

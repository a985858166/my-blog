package xin.inote.my.blog.commons.persistence;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;
@Data
public abstract class BaseEntity implements Serializable {
    private int id;
    private Date created;
    private Date updated;
}

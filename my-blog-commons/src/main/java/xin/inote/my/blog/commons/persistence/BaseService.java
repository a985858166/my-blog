package xin.inote.my.blog.commons.persistence;

import java.util.List;

public interface BaseService<T extends BaseEntity> {
    T getById(Integer id);
    void insert(T entity);
    void delete(Integer id);
    List<T> selectAll();
    void update(T entity);
    void deleteMulti(Integer[] idArray);
}

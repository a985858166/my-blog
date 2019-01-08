package xin.inote.my.blog.web.admin.abstracts;

import org.springframework.beans.factory.annotation.Autowired;
import xin.inote.my.blog.commons.persistence.BaseDao;
import xin.inote.my.blog.commons.persistence.BaseEntity;
import xin.inote.my.blog.commons.persistence.BaseService;

import java.util.List;

public abstract class AbstractsBaseServiceImpl<T extends BaseEntity,D extends BaseDao<T>> implements BaseService<T> {
    @Autowired
    protected D dao;
    @Override
    public T getById(Integer id) {
        return dao.getById(id);
    }

    @Override
    public void insert(T entity) {
        dao.insert(entity);
    }

    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

    @Override
    public List<T> selectAll() {
        return dao.selectAll();
    }

    @Override
    public void update(T entity) {
        dao.update(entity);
    }

    @Override
    public void deleteMulti(Integer[] idArray) {
        dao.deleteMulti(idArray);
    }
}

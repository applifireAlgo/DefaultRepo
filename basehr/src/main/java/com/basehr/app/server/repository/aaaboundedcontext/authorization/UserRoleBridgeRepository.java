package com.basehr.app.server.repository.aaaboundedcontext.authorization;
import com.basehr.app.server.repository.core.SearchInterface;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import java.util.List;

@SourceCodeAuthorClass(createdBy = "root", updatedBy = "", versionNumber = "1", comments = "Repository for UserRoleBridge Transaction table", complexity = Complexity.MEDIUM)
public interface UserRoleBridgeRepository<T> extends SearchInterface {

    public List<T> findAll() throws Exception;

    public T save(T entity) throws Exception;

    public List<T> save(List<T> entity) throws Exception;

    public void delete(String id) throws Exception;

    public void update(T entity) throws Exception;

    public void update(List<T> entity) throws Exception;

    public List<T> findByRoleId(String roleId) throws Exception;

    public List<T> findByUserId(String userId) throws Exception;

    public T findById(String roleUserMapId) throws Exception;
}
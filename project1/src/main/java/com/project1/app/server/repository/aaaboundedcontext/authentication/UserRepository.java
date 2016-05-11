package com.project1.app.server.repository.aaaboundedcontext.authentication;
import com.athena.server.repository.SearchInterface;
import com.spartan.shield.server.authentication.interfaces.UserRepositoryInterface;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import java.util.List;
import com.athena.framework.server.exception.biz.SpartanConstraintViolationException;
import com.project1.app.shared.aaaboundedcontext.authentication.PassRecovery;

<<<<<<< HEAD
@SourceCodeAuthorClass(createdBy = "sagar.jadhav@algorhythm.co.in", updatedBy = "", versionNumber = "1", comments = "Repository for User Transaction table", complexity = Complexity.MEDIUM)
=======
@SourceCodeAuthorClass(createdBy = "sagarjdhv2014@gmail.com", updatedBy = "", versionNumber = "1", comments = "Repository for User Transaction table", complexity = Complexity.MEDIUM)
>>>>>>> branch 'master' of https://github.com/applifireAlgo/DefaultRepo.git
public interface UserRepository<T> extends SearchInterface, UserRepositoryInterface {

    public List<T> findAll() throws SpartanPersistenceException;

    public T save(T entity) throws SpartanPersistenceException, SpartanConstraintViolationException;

    public List<T> save(List<T> entity) throws SpartanPersistenceException, SpartanConstraintViolationException;

    public void delete(String id) throws SpartanPersistenceException;

    public void deletePassRecovery(List<PassRecovery> passrecovery) throws SpartanPersistenceException;

    public void update(T entity) throws SpartanPersistenceException, SpartanConstraintViolationException;

    public List<T> findByUserAccessLevelId(String userAccessLevelId) throws Exception, SpartanPersistenceException;

    public List<T> findByUserAccessDomainId(String userAccessDomainId) throws Exception, SpartanPersistenceException;

    public T findById(String userId) throws Exception, SpartanPersistenceException;
}
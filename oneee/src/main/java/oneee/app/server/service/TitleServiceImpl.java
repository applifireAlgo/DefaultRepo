package oneee.app.server.service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import com.athena.annotation.Complexity;
import com.athena.annotation.SourceCodeAuthorClass;
import com.athena.framework.server.helper.RuntimeLogInfoHelper;
import com.spartan.sprinkler.core.Sprinkler;
import oneee.app.server.repository.TitleRepository;
import oneee.app.shared.contacts.Title;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.athena.framework.server.bean.ResponseBean;
import com.athena.framework.server.exception.repository.SpartanPersistenceException;
import java.lang.Override;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import com.athena.framework.server.exception.repository.SpartanTransactionException;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.PathVariable;
import com.athena.framework.server.bean.FindByBean;

@RestController
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@SourceCodeAuthorClass(createdBy = "john.doe", updatedBy = "", versionNumber = "1", comments = "Service for Title Master table Entity", complexity = Complexity.LOW)
@RequestMapping("/Title")
public class TitleServiceImpl extends TitleService {

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Autowired
    private Sprinkler sprinkler;

    @Autowired
    private TitleRepository<Title> titlerepo;

    @RequestMapping(value = "/findAll", consumes = "application/json", method = RequestMethod.GET)
    @Override
    public HttpEntity<ResponseBean> findAll() throws SpartanPersistenceException, Exception {
        ResponseBean responseBean = new ResponseBean();
        org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.OK;
        java.util.List<oneee.app.shared.contacts.Title> lsttitle = titlerepo.findAll();
        responseBean.add("success", true);
        responseBean.add("message", "Successfully retrived ");
        responseBean.add("data", lsttitle);
        return new org.springframework.http.ResponseEntity<ResponseBean>(responseBean, httpStatus);
    }

    @RequestMapping(consumes = "application/json", method = RequestMethod.POST)
    @Override
    public HttpEntity<ResponseBean> save(@RequestBody Title entity) throws SpartanPersistenceException, SpartanTransactionException, Exception {
        ResponseBean responseBean = new ResponseBean();
        org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.CREATED;
        try {
            titlerepo.save(entity);
            responseBean.add("success", true);
            responseBean.add("message", "Successfully Created");
            responseBean.add("data", entity);
            httpStatus = org.springframework.http.HttpStatus.CREATED;
        } catch (org.springframework.transaction.TransactionException e) {
            throw new com.athena.framework.server.exception.repository.SpartanTransactionException("can not save", e.getCause());
        }
        return new org.springframework.http.ResponseEntity<ResponseBean>(responseBean, httpStatus);
    }

    @RequestMapping(consumes = "application/json", headers = { "isArray" }, method = RequestMethod.POST)
    @Override
    public HttpEntity<ResponseBean> save(@RequestBody List<Title> entity, @RequestHeader("isArray") boolean request) throws SpartanPersistenceException, SpartanTransactionException, Exception {
        ResponseBean responseBean = new ResponseBean();
        org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.CREATED;
        try {
            titlerepo.save(entity);
            responseBean.add("success", true);
            responseBean.add("message", "Successfully Created");
            httpStatus = org.springframework.http.HttpStatus.CREATED;
        } catch (org.springframework.transaction.TransactionException e) {
            throw new com.athena.framework.server.exception.repository.SpartanTransactionException("can not save", e.getCause());
        }
        return new org.springframework.http.ResponseEntity<ResponseBean>(responseBean, httpStatus);
    }

    @RequestMapping(value = "/{cid}", consumes = "application/json", method = RequestMethod.DELETE)
    @Override
    public HttpEntity<ResponseBean> delete(@PathVariable("cid") String entity) throws SpartanPersistenceException, SpartanTransactionException, Exception {
        ResponseBean responseBean = new ResponseBean();
        org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.OK;
        try {
            titlerepo.delete(entity);
            httpStatus = org.springframework.http.HttpStatus.NO_CONTENT;
        } catch (org.springframework.transaction.TransactionException e) {
            throw new com.athena.framework.server.exception.repository.SpartanTransactionException("can not delete", e.getCause());
        }
        return new org.springframework.http.ResponseEntity<ResponseBean>(responseBean, httpStatus);
    }

    @RequestMapping(consumes = "application/json", method = RequestMethod.PUT)
    @Override
    public HttpEntity<ResponseBean> update(@RequestBody Title entity) throws SpartanPersistenceException, SpartanTransactionException, Exception {
        ResponseBean responseBean = new ResponseBean();
        org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.OK;
        try {
            titlerepo.update(entity);
            responseBean.add("success", true);
            responseBean.add("message", "Successfully updated ");
            responseBean.add("data", entity._getPrimarykey().toString());
        } catch (org.springframework.transaction.TransactionException e) {
            throw new com.athena.framework.server.exception.repository.SpartanTransactionException("can not update", e.getCause());
        }
        return new org.springframework.http.ResponseEntity<ResponseBean>(responseBean, httpStatus);
    }

    @RequestMapping(consumes = "application/json", headers = { "isArray" }, method = RequestMethod.PUT)
    @Override
    public HttpEntity<ResponseBean> update(@RequestBody List<Title> entity, @RequestHeader("isArray") boolean request) throws SpartanPersistenceException, SpartanTransactionException, Exception {
        ResponseBean responseBean = new ResponseBean();
        org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.OK;
        try {
            titlerepo.update(entity);
            responseBean.add("success", true);
            responseBean.add("message", "Successfully updated entities");
            httpStatus = org.springframework.http.HttpStatus.OK;
        } catch (org.springframework.transaction.TransactionException e) {
            throw new com.athena.framework.server.exception.repository.SpartanTransactionException("can not update", e.getCause());
        }
        return new org.springframework.http.ResponseEntity<ResponseBean>(responseBean, httpStatus);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.POST)
    @Override
    public HttpEntity<ResponseBean> findById(@RequestBody FindByBean findByBean) throws SpartanPersistenceException, Exception {
        com.athena.framework.server.bean.ResponseBean responseBean = new ResponseBean();
        org.springframework.http.HttpStatus httpStatus = org.springframework.http.HttpStatus.OK;
        try {
            oneee.app.shared.contacts.Title lsttitle = titlerepo.findById((String) findByBean.getFindKey());
            responseBean.add("success", true);
            responseBean.add("message", "Successfully retrived ");
            responseBean.add("data", lsttitle);
        } catch (org.springframework.transaction.TransactionException e) {
            throw new com.athena.framework.server.exception.repository.SpartanTransactionException("can not find ID", e.getCause());
        }
        return new org.springframework.http.ResponseEntity<ResponseBean>(responseBean, httpStatus);
    }
}

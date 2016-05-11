package com.basehr.app.server.repository.aaaboundedcontext.adsd.aspect;
import com.basehr.app.server.repository.aspect.RepositoryAspect;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import com.athena.framework.server.helper.RuntimeLogInfoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import com.spartan.healthmeter.entity.scheduler.ArtMethodCallStack;
import com.spartan.pluggable.logger.api.LogManager;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import com.spartan.healthmeter.entity.scheduler.MethodCallDetails;
import com.spartan.healthmeter.msgWriter.config.HealthConstants;
import com.spartan.pluggable.logger.api.LogManagerFactory;
import com.spartan.pluggable.logger.alarms.AppAlarm;
import com.basehr.app.server.repository.aspect.RepositoryException;

@Aspect
@Component
public class RepositoryadsdAspect extends RepositoryAspect {

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Autowired
    private ArtMethodCallStack requestDetails;

    private LogManager Log = LogManagerFactory.getInstance(System.getProperty("LOGGER_ID"));

    @Around("allOperation()")
    public Object aroundAllOtherOpeartion(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodCallDetails methodCallDetails = new MethodCallDetails(requestDetails.getRequestId(), requestDetails.getCallSequence(), HealthConstants.CLASS_TYPE.REPOSITORY, runtimeLogInfoHelper.getRuntimeLogInfo().getUserIPAddress(), "", joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), runtimeLogInfoHelper.getRuntimeLogInfo().getUserId(), requestDetails.getAppSessionId());
        Object object = null;
        repositoryLogic(joinPoint);
        try {
            Log.out.println("ABSHE314100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
            object = joinPoint.proceed();
            methodCallDetails.setPostCallDetails(HealthConstants.METHOD_NORMAL_EXECUTION);
            Log.out.println("ABSHE317100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        } catch (Exception e) {
            RepositoryException repositoryException = new RepositoryException();
            repositoryException.getException("ABS", "HE", e, runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint);
        } finally {
            requestDetails.addMethodCallDetails(methodCallDetails);
        }
        return object;
    }

    @Around("findOperation()||getOperation()")
    public Object aroundfindAll(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodCallDetails methodCallDetails = new MethodCallDetails(requestDetails.getRequestId(), requestDetails.getCallSequence(), HealthConstants.CLASS_TYPE.REPOSITORY, runtimeLogInfoHelper.getRuntimeLogInfo().getUserIPAddress(), "", joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), runtimeLogInfoHelper.getRuntimeLogInfo().getUserId(), requestDetails.getAppSessionId());
        Object object = null;
        repositoryLogic(joinPoint);
        try {
            Log.out.println("ABSHE314100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
            object = joinPoint.proceed();
            methodCallDetails.setPostCallDetails(HealthConstants.METHOD_NORMAL_EXECUTION);
            Log.out.println("ABSHE317100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        } catch (Exception e) {
            RepositoryException repositoryException = new RepositoryException();
            repositoryException.getException("ABS", "HE", e, runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint);
        } finally {
            requestDetails.addMethodCallDetails(methodCallDetails);
        }
        return object;
    }

    @Around("saveOperation()")
    public Object aroundSave(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodCallDetails methodCallDetails = new MethodCallDetails(requestDetails.getRequestId(), requestDetails.getCallSequence(), HealthConstants.CLASS_TYPE.REPOSITORY, runtimeLogInfoHelper.getRuntimeLogInfo().getUserIPAddress(), "", joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), runtimeLogInfoHelper.getRuntimeLogInfo().getUserId(), requestDetails.getAppSessionId());
        Object object = null;
        repositoryLogic(joinPoint);
        try {
            Log.out.println("ABSHE312100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
            object = joinPoint.proceed();
            methodCallDetails.setPostCallDetails(HealthConstants.METHOD_NORMAL_EXECUTION);
            Log.out.println("ABSHE317100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        } catch (Exception e) {
            RepositoryException repositoryException = new RepositoryException();
            repositoryException.getException("ABS", "HE", e, runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint);
        } finally {
            requestDetails.addMethodCallDetails(methodCallDetails);
        }
        return object;
    }

    @Around("updateOperation()")
    public Object aroundUpdate(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodCallDetails methodCallDetails = new MethodCallDetails(requestDetails.getRequestId(), requestDetails.getCallSequence(), HealthConstants.CLASS_TYPE.REPOSITORY, runtimeLogInfoHelper.getRuntimeLogInfo().getUserIPAddress(), "", joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), runtimeLogInfoHelper.getRuntimeLogInfo().getUserId(), requestDetails.getAppSessionId());
        Object object = null;
        repositoryLogic(joinPoint);
        try {
            Log.out.println("ABSHE311100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
            object = joinPoint.proceed();
            methodCallDetails.setPostCallDetails(HealthConstants.METHOD_NORMAL_EXECUTION);
            Log.out.println("ABSHE317100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        } catch (Exception e) {
            RepositoryException repositoryException = new RepositoryException();
            repositoryException.getException("ABS", "HE", e, runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint);
        } finally {
            requestDetails.addMethodCallDetails(methodCallDetails);
        }
        return object;
    }

    @Around("deleteOperation()")
    public Object aroundDelete(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodCallDetails methodCallDetails = new MethodCallDetails(requestDetails.getRequestId(), requestDetails.getCallSequence(), HealthConstants.CLASS_TYPE.REPOSITORY, runtimeLogInfoHelper.getRuntimeLogInfo().getUserIPAddress(), "", joinPoint.getTarget().getClass().toString(), joinPoint.getSignature().getName(), runtimeLogInfoHelper.getRuntimeLogInfo().getUserId(), requestDetails.getAppSessionId());
        Object object = null;
        repositoryLogic(joinPoint);
        try {
            Log.out.println("ABSHE318100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
            object = joinPoint.proceed();
            methodCallDetails.setPostCallDetails(HealthConstants.METHOD_NORMAL_EXECUTION);
            Log.out.println("ABSHE317100100", runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName(), joinPoint.getSignature().getDeclaringTypeName(), joinPoint.getSignature().getName());
        } catch (Exception e) {
            RepositoryException repositoryException = new RepositoryException();
            repositoryException.getException("ABS", "HE", e, runtimeLogInfoHelper.getRequestHeaderBean(), joinPoint);
        } finally {
            requestDetails.addMethodCallDetails(methodCallDetails);
        }
        return object;
    }

    @Pointcut("execution(* com.basehr.app.server.repository.aaaboundedcontext.adsd..save*(..))")
    protected void saveOperation() {
    }

    @Pointcut("execution(* com.basehr.app.server.repository.aaaboundedcontext.adsd..update*(..))")
    protected void updateOperation() {
    }

    @Pointcut("execution(* com.basehr.app.server.repository.aaaboundedcontext.adsd..delete*(..))")
    protected void deleteOperation() {
    }

    @Pointcut("execution(* com.basehr.app.server.repository.aaaboundedcontext.adsd..find*(..))")
    protected void findOperation() {
    }

    @Pointcut("execution(* com.basehr.app.server.repository.aaaboundedcontext.adsd..get*(..))")
    protected void getOperation() {
    }

    @Pointcut("execution(* com.basehr.app.server.repository.aaaboundedcontext.adsd..*(..)) && ! findOperation() && ! saveOperation() && ! updateOperation() && ! deleteOperation() && ! getOperation()")
    protected void allOperation() {
    }
}
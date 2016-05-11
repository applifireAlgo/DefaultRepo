package com.app.server.service.organization.locationmanagement;
import com.app.server.service.EntityTestCriteria;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import com.app.config.WebConfigExtended;
import org.springframework.test.context.ContextConfiguration;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.TestExecutionListeners;
import com.app.server.repository.organization.locationmanagement.StateRepository;
import com.app.shared.organization.locationmanagement.State;
import org.springframework.beans.factory.annotation.Autowired;
import com.athena.server.pluggable.utils.helper.RuntimeLogInfoHelper;
import com.athena.server.pluggable.utils.helper.EntityValidatorHelper;
import com.app.server.service.RandomValueGenerator;
import java.util.HashMap;
import java.util.List;
import com.spartan.healthmeter.entity.scheduler.ArtMethodCallStack;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.springframework.mock.web.MockServletContext;
import com.spartan.pluggable.logger.api.LogManagerFactory;
import com.athena.server.pluggable.utils.AppLoggerConstant;
import com.spartan.pluggable.logger.api.LogManager;
import com.spartan.pluggable.logger.event.RequestHeaderBean;
import com.spartan.pluggable.logger.api.RuntimeLogUserInfoBean;
import com.athena.server.pluggable.interfaces.CommonEntityInterface.RECORD_TYPE;
import org.junit.Test;
import com.app.shared.organization.locationmanagement.Country;
import com.app.server.repository.organization.locationmanagement.CountryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = WebConfigExtended.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestExecutionListeners({ org.springframework.test.context.support.DependencyInjectionTestExecutionListener.class, org.springframework.test.context.support.DirtiesContextTestExecutionListener.class, org.springframework.test.context.transaction.TransactionalTestExecutionListener.class })
public class StateTestCase extends EntityTestCriteria {

    @Autowired
    private StateRepository<State> stateRepository;

    @Autowired
    private RuntimeLogInfoHelper runtimeLogInfoHelper;

    @Autowired
    private EntityValidatorHelper<Object> entityValidator;

    private RandomValueGenerator valueGenerator = new RandomValueGenerator();

    private static HashMap<String, Object> map = new HashMap<String, Object>();

    private static List<EntityTestCriteria> entityContraint;

    @Autowired
    private ArtMethodCallStack methodCallStack;

    protected MockHttpSession session;

    protected MockHttpServletRequest request;

    protected MockHttpServletResponse response;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        MockServletContext mockServletContext = new MockServletContext("file:src/main/webapp");
        try {
            String _path = mockServletContext.getRealPath("/WEB-INF/conf/");
            LogManagerFactory.createLogManager(_path, AppLoggerConstant.LOGGER_ID);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void startSession() {
        session = new MockHttpSession();
    }

    protected void endSession() {
        session.clearAttributes();
        session.invalidate();
        session = null;
    }

    protected void startRequest() {
        request = new MockHttpServletRequest();
        request.setSession(session);
        org.springframework.web.context.request.RequestContextHolder.setRequestAttributes(new org.springframework.web.context.request.ServletRequestAttributes(request));
    }

    protected void endRequest() {
        ((org.springframework.web.context.request.ServletRequestAttributes) org.springframework.web.context.request.RequestContextHolder.getRequestAttributes()).requestCompleted();
        org.springframework.web.context.request.RequestContextHolder.resetRequestAttributes();
        request = null;
    }

    @Before
    public void before() {
        startSession();
        startRequest();
        setBeans();
    }

    @After
    public void after() {
        endSession();
        endRequest();
    }

    private void setBeans() {
        runtimeLogInfoHelper.createRuntimeLogUserInfo("customer", "AAAAA", request.getRemoteHost());
        org.junit.Assert.assertNotNull(runtimeLogInfoHelper);
        methodCallStack.setRequestId(java.util.UUID.randomUUID().toString().toUpperCase());
        entityContraint = addingListOfFieldForNegativeTesting();
        runtimeLogInfoHelper.setRequestHeaderBean(new RequestHeaderBean(new RuntimeLogUserInfoBean("AAAA", "AAAA", request.getRemoteHost(), 0, 0, 0), "", methodCallStack.getRequestId()));
    }

    private State createState(Boolean isSave) throws Exception {
        Country country = new Country();
        country.setCountryCode2("pKx");
        country.setCurrencySymbol("TSj1uyOBz8ncd9vYGtoVZVKO5K2nWtkY");
        country.setCountryName("ZEtlbyg2DjZbRDyvuyx4zateurnjc3V8oCCmaW3nBKyPLR6Qui");
        country.setCapitalLongitude(3);
        country.setIsoNumeric(165);
        country.setCurrencyName("BDXWlZfAZzABPdBcwGQpqPFyHtBiG8fxLLPbHxJ7C94fXUsKvk");
        country.setCountryCode1("yVa");
        country.setCurrencyCode("YYd");
        country.setCapitalLatitude(5);
        country.setCountryFlag("ze1bbpzDXl5r7s2Rz8vueir1BeYlQ09zkrN0VdIaORY9yq9s6V");
        country.setCapital("WxrhvpMiwGn9DM9VVUAdc2IgRZzVWehD");
        Country CountryTest = new Country();
        if (isSave) {
            CountryTest = countryRepository.save(country);
            map.put("CountryPrimaryKey", country._getPrimarykey());
        }
        State state = new State();
        state.setStateCapital("nVMkt9u5Bhkdx5dnmUb7aNDfLx9CyBGmxdgR7DGz1Qa1ZLlbf5");
        state.setStateName("mBhgZrrFOi98b8SftOQObOCLXvfkQQUugkVAouM4zmWrPtVKrH");
        state.setStateDescription("x8oGncNruckuEy1aNVmk8IrSVnnCkBK2raDaqsxoYLuC8VhHmS");
        state.setCountryId((java.lang.String) CountryTest._getPrimarykey());
        state.setStateCodeChar3("QwgAuQAS3agVpMbEjOxynFPpDRXTDki9");
        state.setStateCodeChar2("VWN7s1NFYETcAOwFVPGqL2yDQD9oVah7");
        state.setStateCapitalLatitude(8);
        state.setStateId("BORdpw797JfhmGe7PCZAiINvy4gbek0y5XnjdLmdZauoLSDY9X");
        state.setStateFlag("l58L1mShjIrx3pYfsUoCm3hMbbuTPzM8K3ZzcFVN1fZpENqPLQ");
        state.setStateCapitalLongitude(8);
        state.setStateCode(1);
        state.setEntityValidator(entityValidator);
        return state;
    }

    @Test
    public void test1Save() {
        try {
            State state = createState(true);
            state.setEntityAudit(1, "xyz", RECORD_TYPE.ADD);
            state.isValid();
            stateRepository.save(state);
            map.put("StatePrimaryKey", state._getPrimarykey());
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Autowired
    private CountryRepository<Country> countryRepository;

    @Test
    public void test2Update() {
        try {
            org.junit.Assert.assertNotNull(map.get("StatePrimaryKey"));
            State state = stateRepository.findById((java.lang.String) map.get("StatePrimaryKey"));
            state.setStateCapital("9YR87pasIvkGQCbppt6Q4QD7VSRlleqqm1VrTxoXviex4kB0EW");
            state.setStateName("JMx5kWwMe8CeNEHpZSu1qDtpz95bRUfmCkEV1pFCviEGrOJVbA");
            state.setStateDescription("vgXcZGHNXCybUyfWkMiuHBQspzn62Z2gMnGOVvBFYj9x9NBpVN");
            state.setVersionId(1);
            state.setStateCodeChar3("4wxy5bM4auGv1TqSSZRraWJWryDEjPUr");
            state.setStateCodeChar2("po6XxmWb4tC0GuE2uh4ISFTc3J3Njiwg");
            state.setStateCapitalLatitude(9);
            state.setStateFlag("uOuGQwFM8ZBWADqYxXlean8ZiwXKGjDPZTGp991u5TvJE3IeuT");
            state.setStateCapitalLongitude(11);
            state.setStateCode(2);
            state.setEntityAudit(1, "xyz", RECORD_TYPE.UPDATE);
            stateRepository.update(state);
        } catch (java.lang.Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3findBycountryId() {
        try {
            java.util.List<State> listofcountryId = stateRepository.findByCountryId((java.lang.String) map.get("CountryPrimaryKey"));
            if (listofcountryId.size() == 0) {
                org.junit.Assert.fail("Query did not return any records.");
            }
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test3FindById() {
        try {
            org.junit.Assert.assertNotNull(map.get("StatePrimaryKey"));
            stateRepository.findById((java.lang.String) map.get("StatePrimaryKey"));
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    @Test
    public void test6Delete() {
        try {
            org.junit.Assert.assertNotNull(map.get("StatePrimaryKey"));
            stateRepository.delete((java.lang.String) map.get("StatePrimaryKey")); /* Deleting refrenced data */
            countryRepository.delete((java.lang.String) map.get("CountryPrimaryKey"));
        } catch (Exception e) {
            org.junit.Assert.fail(e.getMessage());
        }
    }

    private void validateState(EntityTestCriteria contraints, State state) throws Exception {
        if (contraints.getRuleType() == MIN_MAX) {
            state.isValid();
        } else if (contraints.getRuleType() == NOT_NULL) {
            state.isValid();
        } else if (contraints.getRuleType() == REGEX) {
            state.isValid();
        } else if (contraints.getRuleType() == UNIQUE) {
            stateRepository.save(state);
        }
    }

    private List<EntityTestCriteria> addingListOfFieldForNegativeTesting() {
        List<EntityTestCriteria> entityContraints = new java.util.ArrayList<EntityTestCriteria>();
        entityContraints.add(new EntityTestCriteria(NOT_NULL, 1, "stateName", null));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 2, "stateName", "y6Yz3RZrp1FrOFdqL3n2xLs0So4BPByLhcaqRu3o5luqrWs7utIqUJv7x3cgYSU9TISZ0jFN62HyHTiIKOJykcI6Dsg71w21eBIAQLy7zYkt1N6Q8CxNkJwGmVIRGb7E8DVKUhqSeAz6HtJx1daPrzSZsHchWmRQ60lsD9Sqbongl1OzalEbJt7N6eCVkvdfdefQdsgTHW1xa1WSmQpqCHCEicpUpDx9H8to9DxjnR1R5vN6dj9X9AeDkCEFxlAO0"));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 3, "stateCode", 4));
        entityContraints.add(new EntityTestCriteria(NOT_NULL, 4, "stateCodeChar2", null));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 5, "stateCodeChar2", "swTuEZNHraS0MFFwYY9fj40nGtQeVGydE"));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 6, "stateCodeChar3", "4jmgBnTEbDCaljHzSY64w6WmTMb7vBdVC"));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 7, "stateDescription", "Ex4K73DYZor69iPSBNQCr17KZ3TG02JysWk1NAwE8IOXn62ReFiPlehj5RfDn0aO6mdJxjpNKQIeP6NJxMudDjyAjNPAeVVwmve390wrIX2KpW8LwmTF75bIilR4CUIVJwlcGZ8YEaFddUhabSQdP5sxkI34LC5BKBzrSzzbTLpuSBhglxocdVZtECZcBFTHc8jrXwHmifC1O5So0LrcX9netS7h0VyOtnEz3S3wReLznsyyZG5kX6SuWpD5Kke0I"));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 8, "stateFlag", "8SwgCjT5CebjrpUX1QtPtaBOnpNFTBo7ResnbdBVxZMOF3mI5V2c4QxUFw0p7IPCetQMF0zSx0T7cfEzNKA0nA2QruLJYfLUF7AtiO31usBqMmmAHfG9wiaXMBU35C4Gi"));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 9, "stateCapital", "plstxeBi6FbPG0l7hlzAw3AXgGpUYqS8hNF3kePpdYisLM9O9G4QpCS0uu1tJpzLc35w1hJrRx94PmNnuYNMTdCpMxBRKrkcrQwgolM3rNL3uGVfDsMQgRJxqjIkbcgKP"));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 10, "stateCapitalLatitude", 14));
        entityContraints.add(new EntityTestCriteria(MIN_MAX, 11, "stateCapitalLongitude", 21));
        return entityContraints;
    }

    @Test
    public void test5NegativeTesting() throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, Exception {
        int failureCount = 0;
        for (EntityTestCriteria contraints : this.entityContraint) {
            try {
                State state = createState(false);
                java.lang.reflect.Field field = null;
                if (!contraints.getFieldName().equalsIgnoreCase("CombineUniqueKey")) {
                    field = state.getClass().getDeclaredField(contraints.getFieldName());
                }
                switch(((contraints.getTestId()))) {
                    case 0:
                        break;
                    case 1:
                        field.setAccessible(true);
                        field.set(state, null);
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 2:
                        state.setStateName(contraints.getNegativeValue().toString());
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 3:
                        state.setStateCode(Integer.parseInt(contraints.getNegativeValue().toString()));
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 4:
                        field.setAccessible(true);
                        field.set(state, null);
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 5:
                        state.setStateCodeChar2(contraints.getNegativeValue().toString());
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 6:
                        state.setStateCodeChar3(contraints.getNegativeValue().toString());
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 7:
                        state.setStateDescription(contraints.getNegativeValue().toString());
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 8:
                        state.setStateFlag(contraints.getNegativeValue().toString());
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 9:
                        state.setStateCapital(contraints.getNegativeValue().toString());
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 10:
                        state.setStateCapitalLatitude(Integer.parseInt(contraints.getNegativeValue().toString()));
                        validateState(contraints, state);
                        failureCount++;
                        break;
                    case 11:
                        state.setStateCapitalLongitude(Integer.parseInt(contraints.getNegativeValue().toString()));
                        validateState(contraints, state);
                        failureCount++;
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (failureCount > 0) {
            org.junit.Assert.fail();
        }
    }
}
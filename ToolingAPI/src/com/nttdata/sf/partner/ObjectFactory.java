
package com.nttdata.sf.partner;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nttdata.sf.partner package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RelatedListColumnLookupId_QNAME = new QName("urn:partner.soap.sforce.com", "lookupId");
    private final static QName _UnexpectedErrorFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "UnexpectedErrorFault");
    private final static QName _Fault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "fault");
    private final static QName _LoginFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "LoginFault");
    private final static QName _InvalidQueryLocatorFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "InvalidQueryLocatorFault");
    private final static QName _InvalidNewPasswordFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "InvalidNewPasswordFault");
    private final static QName _InvalidSObjectFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "InvalidSObjectFault");
    private final static QName _MalformedQueryFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "MalformedQueryFault");
    private final static QName _InvalidIdFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "InvalidIdFault");
    private final static QName _InvalidFieldFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "InvalidFieldFault");
    private final static QName _MalformedSearchFault_QNAME = new QName("urn:fault.partner.soap.sforce.com", "MalformedSearchFault");
    private final static QName _EmailFileAttachmentContentType_QNAME = new QName("urn:partner.soap.sforce.com", "contentType");
    private final static QName _EmailFileAttachmentBody_QNAME = new QName("urn:partner.soap.sforce.com", "body");
    private final static QName _SingleEmailMessageOrgWideEmailAddressId_QNAME = new QName("urn:partner.soap.sforce.com", "orgWideEmailAddressId");
    private final static QName _SingleEmailMessageInReplyTo_QNAME = new QName("urn:partner.soap.sforce.com", "inReplyTo");
    private final static QName _SingleEmailMessageReferences_QNAME = new QName("urn:partner.soap.sforce.com", "references");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nttdata.sf.partner
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SObject }
     * 
     */
    public SObject createSObject() {
        return new SObject();
    }

    /**
     * Create an instance of {@link DescribeTheme }
     * 
     */
    public DescribeTheme createDescribeTheme() {
        return new DescribeTheme();
    }

    /**
     * Create an instance of {@link Upsert }
     * 
     */
    public Upsert createUpsert() {
        return new Upsert();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructuresResponse }
     * 
     */
    public DescribeDataCategoryGroupStructuresResponse createDescribeDataCategoryGroupStructuresResponse() {
        return new DescribeDataCategoryGroupStructuresResponse();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructureResult }
     * 
     */
    public DescribeDataCategoryGroupStructureResult createDescribeDataCategoryGroupStructureResult() {
        return new DescribeDataCategoryGroupStructureResult();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrder }
     * 
     */
    public DescribeSearchScopeOrder createDescribeSearchScopeOrder() {
        return new DescribeSearchScopeOrder();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroups }
     * 
     */
    public DescribeDataCategoryGroups createDescribeDataCategoryGroups() {
        return new DescribeDataCategoryGroups();
    }

    /**
     * Create an instance of {@link PerformQuickActionsResponse }
     * 
     */
    public PerformQuickActionsResponse createPerformQuickActionsResponse() {
        return new PerformQuickActionsResponse();
    }

    /**
     * Create an instance of {@link PerformQuickActionResult }
     * 
     */
    public PerformQuickActionResult createPerformQuickActionResult() {
        return new PerformQuickActionResult();
    }

    /**
     * Create an instance of {@link Search }
     * 
     */
    public Search createSearch() {
        return new Search();
    }

    /**
     * Create an instance of {@link RetrieveQuickActionTemplates }
     * 
     */
    public RetrieveQuickActionTemplates createRetrieveQuickActionTemplates() {
        return new RetrieveQuickActionTemplates();
    }

    /**
     * Create an instance of {@link DebuggingHeader }
     * 
     */
    public DebuggingHeader createDebuggingHeader() {
        return new DebuggingHeader();
    }

    /**
     * Create an instance of {@link DebuggingInfo }
     * 
     */
    public DebuggingInfo createDebuggingInfo() {
        return new DebuggingInfo();
    }

    /**
     * Create an instance of {@link QueryMoreResponse }
     * 
     */
    public QueryMoreResponse createQueryMoreResponse() {
        return new QueryMoreResponse();
    }

    /**
     * Create an instance of {@link QueryResult }
     * 
     */
    public QueryResult createQueryResult() {
        return new QueryResult();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link GetUserInfoResult }
     * 
     */
    public GetUserInfoResult createGetUserInfoResult() {
        return new GetUserInfoResult();
    }

    /**
     * Create an instance of {@link DescribeTabsResponse }
     * 
     */
    public DescribeTabsResponse createDescribeTabsResponse() {
        return new DescribeTabsResponse();
    }

    /**
     * Create an instance of {@link DescribeTabSetResult }
     * 
     */
    public DescribeTabSetResult createDescribeTabSetResult() {
        return new DescribeTabSetResult();
    }

    /**
     * Create an instance of {@link MruHeader }
     * 
     */
    public MruHeader createMruHeader() {
        return new MruHeader();
    }

    /**
     * Create an instance of {@link Create }
     * 
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link AllowFieldTruncationHeader }
     * 
     */
    public AllowFieldTruncationHeader createAllowFieldTruncationHeader() {
        return new AllowFieldTruncationHeader();
    }

    /**
     * Create an instance of {@link GetServerTimestampResponse }
     * 
     */
    public GetServerTimestampResponse createGetServerTimestampResponse() {
        return new GetServerTimestampResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestampResult }
     * 
     */
    public GetServerTimestampResult createGetServerTimestampResult() {
        return new GetServerTimestampResult();
    }

    /**
     * Create an instance of {@link SendEmailResponse }
     * 
     */
    public SendEmailResponse createSendEmailResponse() {
        return new SendEmailResponse();
    }

    /**
     * Create an instance of {@link SendEmailResult }
     * 
     */
    public SendEmailResult createSendEmailResult() {
        return new SendEmailResult();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActions }
     * 
     */
    public DescribeAvailableQuickActions createDescribeAvailableQuickActions() {
        return new DescribeAvailableQuickActions();
    }

    /**
     * Create an instance of {@link AllOrNoneHeader }
     * 
     */
    public AllOrNoneHeader createAllOrNoneHeader() {
        return new AllOrNoneHeader();
    }

    /**
     * Create an instance of {@link DescribeFlexiPagesResponse }
     * 
     */
    public DescribeFlexiPagesResponse createDescribeFlexiPagesResponse() {
        return new DescribeFlexiPagesResponse();
    }

    /**
     * Create an instance of {@link DescribeFlexiPageResult }
     * 
     */
    public DescribeFlexiPageResult createDescribeFlexiPageResult() {
        return new DescribeFlexiPageResult();
    }

    /**
     * Create an instance of {@link DescribeGlobalTheme }
     * 
     */
    public DescribeGlobalTheme createDescribeGlobalTheme() {
        return new DescribeGlobalTheme();
    }

    /**
     * Create an instance of {@link UserTerritoryDeleteHeader }
     * 
     */
    public UserTerritoryDeleteHeader createUserTerritoryDeleteHeader() {
        return new UserTerritoryDeleteHeader();
    }

    /**
     * Create an instance of {@link DescribeQuickActionsResponse }
     * 
     */
    public DescribeQuickActionsResponse createDescribeQuickActionsResponse() {
        return new DescribeQuickActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeQuickActionResult }
     * 
     */
    public DescribeQuickActionResult createDescribeQuickActionResult() {
        return new DescribeQuickActionResult();
    }

    /**
     * Create an instance of {@link Undelete }
     * 
     */
    public Undelete createUndelete() {
        return new Undelete();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResponse }
     * 
     */
    public InvalidateSessionsResponse createInvalidateSessionsResponse() {
        return new InvalidateSessionsResponse();
    }

    /**
     * Create an instance of {@link InvalidateSessionsResult }
     * 
     */
    public InvalidateSessionsResult createInvalidateSessionsResult() {
        return new InvalidateSessionsResult();
    }

    /**
     * Create an instance of {@link MergeResponse }
     * 
     */
    public MergeResponse createMergeResponse() {
        return new MergeResponse();
    }

    /**
     * Create an instance of {@link MergeResult }
     * 
     */
    public MergeResult createMergeResult() {
        return new MergeResult();
    }

    /**
     * Create an instance of {@link ConvertLeadResponse }
     * 
     */
    public ConvertLeadResponse createConvertLeadResponse() {
        return new ConvertLeadResponse();
    }

    /**
     * Create an instance of {@link LeadConvertResult }
     * 
     */
    public LeadConvertResult createLeadConvertResult() {
        return new LeadConvertResult();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayout }
     * 
     */
    public DescribeApprovalLayout createDescribeApprovalLayout() {
        return new DescribeApprovalLayout();
    }

    /**
     * Create an instance of {@link Query }
     * 
     */
    public Query createQuery() {
        return new Query();
    }

    /**
     * Create an instance of {@link Merge }
     * 
     */
    public Merge createMerge() {
        return new Merge();
    }

    /**
     * Create an instance of {@link MergeRequest }
     * 
     */
    public MergeRequest createMergeRequest() {
        return new MergeRequest();
    }

    /**
     * Create an instance of {@link DescribeAppMenuResponse }
     * 
     */
    public DescribeAppMenuResponse createDescribeAppMenuResponse() {
        return new DescribeAppMenuResponse();
    }

    /**
     * Create an instance of {@link DescribeAppMenuResult }
     * 
     */
    public DescribeAppMenuResult createDescribeAppMenuResult() {
        return new DescribeAppMenuResult();
    }

    /**
     * Create an instance of {@link QueryAll }
     * 
     */
    public QueryAll createQueryAll() {
        return new QueryAll();
    }

    /**
     * Create an instance of {@link DescribeSObjects }
     * 
     */
    public DescribeSObjects createDescribeSObjects() {
        return new DescribeSObjects();
    }

    /**
     * Create an instance of {@link DescribeSObject }
     * 
     */
    public DescribeSObject createDescribeSObject() {
        return new DescribeSObject();
    }

    /**
     * Create an instance of {@link StreamingEnabledHeader }
     * 
     */
    public StreamingEnabledHeader createStreamingEnabledHeader() {
        return new StreamingEnabledHeader();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DescribeTabs }
     * 
     */
    public DescribeTabs createDescribeTabs() {
        return new DescribeTabs();
    }

    /**
     * Create an instance of {@link SetPassword }
     * 
     */
    public SetPassword createSetPassword() {
        return new SetPassword();
    }

    /**
     * Create an instance of {@link EmailHeader }
     * 
     */
    public EmailHeader createEmailHeader() {
        return new EmailHeader();
    }

    /**
     * Create an instance of {@link DescribeLayoutResponse }
     * 
     */
    public DescribeLayoutResponse createDescribeLayoutResponse() {
        return new DescribeLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeLayoutResult }
     * 
     */
    public DescribeLayoutResult createDescribeLayoutResult() {
        return new DescribeLayoutResult();
    }

    /**
     * Create an instance of {@link RetrieveQuickActionTemplatesResponse }
     * 
     */
    public RetrieveQuickActionTemplatesResponse createRetrieveQuickActionTemplatesResponse() {
        return new RetrieveQuickActionTemplatesResponse();
    }

    /**
     * Create an instance of {@link QuickActionTemplateResult }
     * 
     */
    public QuickActionTemplateResult createQuickActionTemplateResult() {
        return new QuickActionTemplateResult();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link LoginResult }
     * 
     */
    public LoginResult createLoginResult() {
        return new LoginResult();
    }

    /**
     * Create an instance of {@link LimitInfoHeader }
     * 
     */
    public LimitInfoHeader createLimitInfoHeader() {
        return new LimitInfoHeader();
    }

    /**
     * Create an instance of {@link LimitInfo }
     * 
     */
    public LimitInfo createLimitInfo() {
        return new LimitInfo();
    }

    /**
     * Create an instance of {@link DescribeSearchLayoutsResponse }
     * 
     */
    public DescribeSearchLayoutsResponse createDescribeSearchLayoutsResponse() {
        return new DescribeSearchLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchLayoutResult }
     * 
     */
    public DescribeSearchLayoutResult createDescribeSearchLayoutResult() {
        return new DescribeSearchLayoutResult();
    }

    /**
     * Create an instance of {@link InvalidateSessions }
     * 
     */
    public InvalidateSessions createInvalidateSessions() {
        return new InvalidateSessions();
    }

    /**
     * Create an instance of {@link Process }
     * 
     */
    public Process createProcess() {
        return new Process();
    }

    /**
     * Create an instance of {@link ProcessRequest }
     * 
     */
    public ProcessRequest createProcessRequest() {
        return new ProcessRequest();
    }

    /**
     * Create an instance of {@link EmptyRecycleBin }
     * 
     */
    public EmptyRecycleBin createEmptyRecycleBin() {
        return new EmptyRecycleBin();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link GetDeletedResponse }
     * 
     */
    public GetDeletedResponse createGetDeletedResponse() {
        return new GetDeletedResponse();
    }

    /**
     * Create an instance of {@link GetDeletedResult }
     * 
     */
    public GetDeletedResult createGetDeletedResult() {
        return new GetDeletedResult();
    }

    /**
     * Create an instance of {@link SetPasswordResponse }
     * 
     */
    public SetPasswordResponse createSetPasswordResponse() {
        return new SetPasswordResponse();
    }

    /**
     * Create an instance of {@link SetPasswordResult }
     * 
     */
    public SetPasswordResult createSetPasswordResult() {
        return new SetPasswordResult();
    }

    /**
     * Create an instance of {@link DescribeSObjectsResponse }
     * 
     */
    public DescribeSObjectsResponse createDescribeSObjectsResponse() {
        return new DescribeSObjectsResponse();
    }

    /**
     * Create an instance of {@link DescribeSObjectResult }
     * 
     */
    public DescribeSObjectResult createDescribeSObjectResult() {
        return new DescribeSObjectResult();
    }

    /**
     * Create an instance of {@link UpsertResponse }
     * 
     */
    public UpsertResponse createUpsertResponse() {
        return new UpsertResponse();
    }

    /**
     * Create an instance of {@link UpsertResult }
     * 
     */
    public UpsertResult createUpsertResult() {
        return new UpsertResult();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrderResponse }
     * 
     */
    public DescribeSearchScopeOrderResponse createDescribeSearchScopeOrderResponse() {
        return new DescribeSearchScopeOrderResponse();
    }

    /**
     * Create an instance of {@link DescribeSearchScopeOrderResult }
     * 
     */
    public DescribeSearchScopeOrderResult createDescribeSearchScopeOrderResult() {
        return new DescribeSearchScopeOrderResult();
    }

    /**
     * Create an instance of {@link AssignmentRuleHeader }
     * 
     */
    public AssignmentRuleHeader createAssignmentRuleHeader() {
        return new AssignmentRuleHeader();
    }

    /**
     * Create an instance of {@link DescribeSObjectResponse }
     * 
     */
    public DescribeSObjectResponse createDescribeSObjectResponse() {
        return new DescribeSObjectResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedResponse }
     * 
     */
    public GetUpdatedResponse createGetUpdatedResponse() {
        return new GetUpdatedResponse();
    }

    /**
     * Create an instance of {@link GetUpdatedResult }
     * 
     */
    public GetUpdatedResult createGetUpdatedResult() {
        return new GetUpdatedResult();
    }

    /**
     * Create an instance of {@link QueryOptions }
     * 
     */
    public QueryOptions createQueryOptions() {
        return new QueryOptions();
    }

    /**
     * Create an instance of {@link QueryAllResponse }
     * 
     */
    public QueryAllResponse createQueryAllResponse() {
        return new QueryAllResponse();
    }

    /**
     * Create an instance of {@link QueryMore }
     * 
     */
    public QueryMore createQueryMore() {
        return new QueryMore();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link SaveResult }
     * 
     */
    public SaveResult createSaveResult() {
        return new SaveResult();
    }

    /**
     * Create an instance of {@link ResetPasswordResponse }
     * 
     */
    public ResetPasswordResponse createResetPasswordResponse() {
        return new ResetPasswordResponse();
    }

    /**
     * Create an instance of {@link ResetPasswordResult }
     * 
     */
    public ResetPasswordResult createResetPasswordResult() {
        return new ResetPasswordResult();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link PerformQuickActions }
     * 
     */
    public PerformQuickActions createPerformQuickActions() {
        return new PerformQuickActions();
    }

    /**
     * Create an instance of {@link PerformQuickActionRequest }
     * 
     */
    public PerformQuickActionRequest createPerformQuickActionRequest() {
        return new PerformQuickActionRequest();
    }

    /**
     * Create an instance of {@link PackageVersionHeader }
     * 
     */
    public PackageVersionHeader createPackageVersionHeader() {
        return new PackageVersionHeader();
    }

    /**
     * Create an instance of {@link PackageVersion }
     * 
     */
    public PackageVersion createPackageVersion() {
        return new PackageVersion();
    }

    /**
     * Create an instance of {@link DescribeGlobalResponse }
     * 
     */
    public DescribeGlobalResponse createDescribeGlobalResponse() {
        return new DescribeGlobalResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalResult }
     * 
     */
    public DescribeGlobalResult createDescribeGlobalResult() {
        return new DescribeGlobalResult();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayoutResponse }
     * 
     */
    public DescribeApprovalLayoutResponse createDescribeApprovalLayoutResponse() {
        return new DescribeApprovalLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayoutResult }
     * 
     */
    public DescribeApprovalLayoutResult createDescribeApprovalLayoutResult() {
        return new DescribeApprovalLayoutResult();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link DescribeQuickActions }
     * 
     */
    public DescribeQuickActions createDescribeQuickActions() {
        return new DescribeQuickActions();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupsResponse }
     * 
     */
    public DescribeDataCategoryGroupsResponse createDescribeDataCategoryGroupsResponse() {
        return new DescribeDataCategoryGroupsResponse();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupResult }
     * 
     */
    public DescribeDataCategoryGroupResult createDescribeDataCategoryGroupResult() {
        return new DescribeDataCategoryGroupResult();
    }

    /**
     * Create an instance of {@link GetDeleted }
     * 
     */
    public GetDeleted createGetDeleted() {
        return new GetDeleted();
    }

    /**
     * Create an instance of {@link SendEmailMessageResponse }
     * 
     */
    public SendEmailMessageResponse createSendEmailMessageResponse() {
        return new SendEmailMessageResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalThemeResponse }
     * 
     */
    public DescribeGlobalThemeResponse createDescribeGlobalThemeResponse() {
        return new DescribeGlobalThemeResponse();
    }

    /**
     * Create an instance of {@link DescribeGlobalTheme2 }
     * 
     */
    public DescribeGlobalTheme2 createDescribeGlobalTheme2() {
        return new DescribeGlobalTheme2();
    }

    /**
     * Create an instance of {@link DisableFeedTrackingHeader }
     * 
     */
    public DisableFeedTrackingHeader createDisableFeedTrackingHeader() {
        return new DisableFeedTrackingHeader();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link ProcessResult }
     * 
     */
    public ProcessResult createProcessResult() {
        return new ProcessResult();
    }

    /**
     * Create an instance of {@link ConvertLead }
     * 
     */
    public ConvertLead createConvertLead() {
        return new ConvertLead();
    }

    /**
     * Create an instance of {@link LeadConvert }
     * 
     */
    public LeadConvert createLeadConvert() {
        return new LeadConvert();
    }

    /**
     * Create an instance of {@link SendEmail }
     * 
     */
    public SendEmail createSendEmail() {
        return new SendEmail();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link DescribeDataCategoryGroupStructures }
     * 
     */
    public DescribeDataCategoryGroupStructures createDescribeDataCategoryGroupStructures() {
        return new DescribeDataCategoryGroupStructures();
    }

    /**
     * Create an instance of {@link DataCategoryGroupSobjectTypePair }
     * 
     */
    public DataCategoryGroupSobjectTypePair createDataCategoryGroupSobjectTypePair() {
        return new DataCategoryGroupSobjectTypePair();
    }

    /**
     * Create an instance of {@link UndeleteResponse }
     * 
     */
    public UndeleteResponse createUndeleteResponse() {
        return new UndeleteResponse();
    }

    /**
     * Create an instance of {@link UndeleteResult }
     * 
     */
    public UndeleteResult createUndeleteResult() {
        return new UndeleteResult();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link ResetPassword }
     * 
     */
    public ResetPassword createResetPassword() {
        return new ResetPassword();
    }

    /**
     * Create an instance of {@link GetUpdated }
     * 
     */
    public GetUpdated createGetUpdated() {
        return new GetUpdated();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActionsResponse }
     * 
     */
    public DescribeAvailableQuickActionsResponse createDescribeAvailableQuickActionsResponse() {
        return new DescribeAvailableQuickActionsResponse();
    }

    /**
     * Create an instance of {@link DescribeAvailableQuickActionResult }
     * 
     */
    public DescribeAvailableQuickActionResult createDescribeAvailableQuickActionResult() {
        return new DescribeAvailableQuickActionResult();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayout }
     * 
     */
    public DescribeSoftphoneLayout createDescribeSoftphoneLayout() {
        return new DescribeSoftphoneLayout();
    }

    /**
     * Create an instance of {@link DescribeThemeResponse }
     * 
     */
    public DescribeThemeResponse createDescribeThemeResponse() {
        return new DescribeThemeResponse();
    }

    /**
     * Create an instance of {@link DescribeThemeResult }
     * 
     */
    public DescribeThemeResult createDescribeThemeResult() {
        return new DescribeThemeResult();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link CallOptions }
     * 
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link SendEmailMessage }
     * 
     */
    public SendEmailMessage createSendEmailMessage() {
        return new SendEmailMessage();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutResponse }
     * 
     */
    public DescribeSoftphoneLayoutResponse createDescribeSoftphoneLayoutResponse() {
        return new DescribeSoftphoneLayoutResponse();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutResult }
     * 
     */
    public DescribeSoftphoneLayoutResult createDescribeSoftphoneLayoutResult() {
        return new DescribeSoftphoneLayoutResult();
    }

    /**
     * Create an instance of {@link OwnerChangeOptions }
     * 
     */
    public OwnerChangeOptions createOwnerChangeOptions() {
        return new OwnerChangeOptions();
    }

    /**
     * Create an instance of {@link DescribeFlexiPages }
     * 
     */
    public DescribeFlexiPages createDescribeFlexiPages() {
        return new DescribeFlexiPages();
    }

    /**
     * Create an instance of {@link DescribeCompactLayoutsResponse }
     * 
     */
    public DescribeCompactLayoutsResponse createDescribeCompactLayoutsResponse() {
        return new DescribeCompactLayoutsResponse();
    }

    /**
     * Create an instance of {@link DescribeCompactLayoutsResult }
     * 
     */
    public DescribeCompactLayoutsResult createDescribeCompactLayoutsResult() {
        return new DescribeCompactLayoutsResult();
    }

    /**
     * Create an instance of {@link SearchResponse }
     * 
     */
    public SearchResponse createSearchResponse() {
        return new SearchResponse();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link LoginScopeHeader }
     * 
     */
    public LoginScopeHeader createLoginScopeHeader() {
        return new LoginScopeHeader();
    }

    /**
     * Create an instance of {@link DescribeSearchLayouts }
     * 
     */
    public DescribeSearchLayouts createDescribeSearchLayouts() {
        return new DescribeSearchLayouts();
    }

    /**
     * Create an instance of {@link EmptyRecycleBinResponse }
     * 
     */
    public EmptyRecycleBinResponse createEmptyRecycleBinResponse() {
        return new EmptyRecycleBinResponse();
    }

    /**
     * Create an instance of {@link EmptyRecycleBinResult }
     * 
     */
    public EmptyRecycleBinResult createEmptyRecycleBinResult() {
        return new EmptyRecycleBinResult();
    }

    /**
     * Create an instance of {@link QueryResponse }
     * 
     */
    public QueryResponse createQueryResponse() {
        return new QueryResponse();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link RetrieveResponse }
     * 
     */
    public RetrieveResponse createRetrieveResponse() {
        return new RetrieveResponse();
    }

    /**
     * Create an instance of {@link GetServerTimestamp }
     * 
     */
    public GetServerTimestamp createGetServerTimestamp() {
        return new GetServerTimestamp();
    }

    /**
     * Create an instance of {@link SessionHeader }
     * 
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link LocaleOptions }
     * 
     */
    public LocaleOptions createLocaleOptions() {
        return new LocaleOptions();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link DeleteResult }
     * 
     */
    public DeleteResult createDeleteResult() {
        return new DeleteResult();
    }

    /**
     * Create an instance of {@link DescribeAppMenu }
     * 
     */
    public DescribeAppMenu createDescribeAppMenu() {
        return new DescribeAppMenu();
    }

    /**
     * Create an instance of {@link DescribeLayout }
     * 
     */
    public DescribeLayout createDescribeLayout() {
        return new DescribeLayout();
    }

    /**
     * Create an instance of {@link DescribeCompactLayouts }
     * 
     */
    public DescribeCompactLayouts createDescribeCompactLayouts() {
        return new DescribeCompactLayouts();
    }

    /**
     * Create an instance of {@link Retrieve }
     * 
     */
    public Retrieve createRetrieve() {
        return new Retrieve();
    }

    /**
     * Create an instance of {@link DescribeGlobal }
     * 
     */
    public DescribeGlobal createDescribeGlobal() {
        return new DescribeGlobal();
    }

    /**
     * Create an instance of {@link DescribeApprovalLayout2 }
     * 
     */
    public DescribeApprovalLayout2 createDescribeApprovalLayout2() {
        return new DescribeApprovalLayout2();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutItem }
     * 
     */
    public DescribeSoftphoneLayoutItem createDescribeSoftphoneLayoutItem() {
        return new DescribeSoftphoneLayoutItem();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutSection }
     * 
     */
    public DescribeSoftphoneLayoutSection createDescribeSoftphoneLayoutSection() {
        return new DescribeSoftphoneLayoutSection();
    }

    /**
     * Create an instance of {@link DescribeColor }
     * 
     */
    public DescribeColor createDescribeColor() {
        return new DescribeColor();
    }

    /**
     * Create an instance of {@link ReportChartComponent }
     * 
     */
    public ReportChartComponent createReportChartComponent() {
        return new ReportChartComponent();
    }

    /**
     * Create an instance of {@link RecordTypeInfo }
     * 
     */
    public RecordTypeInfo createRecordTypeInfo() {
        return new RecordTypeInfo();
    }

    /**
     * Create an instance of {@link DescribeColumn }
     * 
     */
    public DescribeColumn createDescribeColumn() {
        return new DescribeColumn();
    }

    /**
     * Create an instance of {@link RelatedContent }
     * 
     */
    public RelatedContent createRelatedContent() {
        return new RelatedContent();
    }

    /**
     * Create an instance of {@link DescribeComponentInstance }
     * 
     */
    public DescribeComponentInstance createDescribeComponentInstance() {
        return new DescribeComponentInstance();
    }

    /**
     * Create an instance of {@link DescribeRelatedContentItem }
     * 
     */
    public DescribeRelatedContentItem createDescribeRelatedContentItem() {
        return new DescribeRelatedContentItem();
    }

    /**
     * Create an instance of {@link ChildRelationship }
     * 
     */
    public ChildRelationship createChildRelationship() {
        return new ChildRelationship();
    }

    /**
     * Create an instance of {@link DescribeLayoutComponent }
     * 
     */
    public DescribeLayoutComponent createDescribeLayoutComponent() {
        return new DescribeLayoutComponent();
    }

    /**
     * Create an instance of {@link ProcessWorkitemRequest }
     * 
     */
    public ProcessWorkitemRequest createProcessWorkitemRequest() {
        return new ProcessWorkitemRequest();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutInfoField }
     * 
     */
    public DescribeSoftphoneLayoutInfoField createDescribeSoftphoneLayoutInfoField() {
        return new DescribeSoftphoneLayoutInfoField();
    }

    /**
     * Create an instance of {@link DescribeLayoutButton }
     * 
     */
    public DescribeLayoutButton createDescribeLayoutButton() {
        return new DescribeLayoutButton();
    }

    /**
     * Create an instance of {@link SendEmailError }
     * 
     */
    public SendEmailError createSendEmailError() {
        return new SendEmailError();
    }

    /**
     * Create an instance of {@link DescribeLayoutItem }
     * 
     */
    public DescribeLayoutItem createDescribeLayoutItem() {
        return new DescribeLayoutItem();
    }

    /**
     * Create an instance of {@link RecordTypeCompactLayoutMapping }
     * 
     */
    public RecordTypeCompactLayoutMapping createRecordTypeCompactLayoutMapping() {
        return new RecordTypeCompactLayoutMapping();
    }

    /**
     * Create an instance of {@link RelatedListSort }
     * 
     */
    public RelatedListSort createRelatedListSort() {
        return new RelatedListSort();
    }

    /**
     * Create an instance of {@link EmailFileAttachment }
     * 
     */
    public EmailFileAttachment createEmailFileAttachment() {
        return new EmailFileAttachment();
    }

    /**
     * Create an instance of {@link DescribeQuickActionListResult }
     * 
     */
    public DescribeQuickActionListResult createDescribeQuickActionListResult() {
        return new DescribeQuickActionListResult();
    }

    /**
     * Create an instance of {@link DescribeLayoutButtonSection }
     * 
     */
    public DescribeLayoutButtonSection createDescribeLayoutButtonSection() {
        return new DescribeLayoutButtonSection();
    }

    /**
     * Create an instance of {@link DescribeComponentInstanceProperty }
     * 
     */
    public DescribeComponentInstanceProperty createDescribeComponentInstanceProperty() {
        return new DescribeComponentInstanceProperty();
    }

    /**
     * Create an instance of {@link RelatedList }
     * 
     */
    public RelatedList createRelatedList() {
        return new RelatedList();
    }

    /**
     * Create an instance of {@link DescribeThemeItem }
     * 
     */
    public DescribeThemeItem createDescribeThemeItem() {
        return new DescribeThemeItem();
    }

    /**
     * Create an instance of {@link ProcessSubmitRequest }
     * 
     */
    public ProcessSubmitRequest createProcessSubmitRequest() {
        return new ProcessSubmitRequest();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link DescribeFlexiPageRegion }
     * 
     */
    public DescribeFlexiPageRegion createDescribeFlexiPageRegion() {
        return new DescribeFlexiPageRegion();
    }

    /**
     * Create an instance of {@link DescribeQuickActionListItemResult }
     * 
     */
    public DescribeQuickActionListItemResult createDescribeQuickActionListItemResult() {
        return new DescribeQuickActionListItemResult();
    }

    /**
     * Create an instance of {@link DescribeIcon }
     * 
     */
    public DescribeIcon createDescribeIcon() {
        return new DescribeIcon();
    }

    /**
     * Create an instance of {@link DeletedRecord }
     * 
     */
    public DeletedRecord createDeletedRecord() {
        return new DeletedRecord();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneScreenPopOption }
     * 
     */
    public DescribeSoftphoneScreenPopOption createDescribeSoftphoneScreenPopOption() {
        return new DescribeSoftphoneScreenPopOption();
    }

    /**
     * Create an instance of {@link DataCategory }
     * 
     */
    public DataCategory createDataCategory() {
        return new DataCategory();
    }

    /**
     * Create an instance of {@link DescribeLayoutSection }
     * 
     */
    public DescribeLayoutSection createDescribeLayoutSection() {
        return new DescribeLayoutSection();
    }

    /**
     * Create an instance of {@link SingleEmailMessage }
     * 
     */
    public SingleEmailMessage createSingleEmailMessage() {
        return new SingleEmailMessage();
    }

    /**
     * Create an instance of {@link MassEmailMessage }
     * 
     */
    public MassEmailMessage createMassEmailMessage() {
        return new MassEmailMessage();
    }

    /**
     * Create an instance of {@link DescribeAppMenuItem }
     * 
     */
    public DescribeAppMenuItem createDescribeAppMenuItem() {
        return new DescribeAppMenuItem();
    }

    /**
     * Create an instance of {@link PicklistForRecordType }
     * 
     */
    public PicklistForRecordType createPicklistForRecordType() {
        return new PicklistForRecordType();
    }

    /**
     * Create an instance of {@link Field }
     * 
     */
    public Field createField() {
        return new Field();
    }

    /**
     * Create an instance of {@link DescribeLayout2 }
     * 
     */
    public DescribeLayout2 createDescribeLayout2() {
        return new DescribeLayout2();
    }

    /**
     * Create an instance of {@link DescribeGlobalSObjectResult }
     * 
     */
    public DescribeGlobalSObjectResult createDescribeGlobalSObjectResult() {
        return new DescribeGlobalSObjectResult();
    }

    /**
     * Create an instance of {@link RecordTypeMapping }
     * 
     */
    public RecordTypeMapping createRecordTypeMapping() {
        return new RecordTypeMapping();
    }

    /**
     * Create an instance of {@link PicklistEntry }
     * 
     */
    public PicklistEntry createPicklistEntry() {
        return new PicklistEntry();
    }

    /**
     * Create an instance of {@link SearchRecord }
     * 
     */
    public SearchRecord createSearchRecord() {
        return new SearchRecord();
    }

    /**
     * Create an instance of {@link RelatedListColumn }
     * 
     */
    public RelatedListColumn createRelatedListColumn() {
        return new RelatedListColumn();
    }

    /**
     * Create an instance of {@link DescribeQuickActionDefaultValue }
     * 
     */
    public DescribeQuickActionDefaultValue createDescribeQuickActionDefaultValue() {
        return new DescribeQuickActionDefaultValue();
    }

    /**
     * Create an instance of {@link DescribeCompactLayout }
     * 
     */
    public DescribeCompactLayout createDescribeCompactLayout() {
        return new DescribeCompactLayout();
    }

    /**
     * Create an instance of {@link DescribeLayoutRow }
     * 
     */
    public DescribeLayoutRow createDescribeLayoutRow() {
        return new DescribeLayoutRow();
    }

    /**
     * Create an instance of {@link DescribeSoftphoneLayoutCallType }
     * 
     */
    public DescribeSoftphoneLayoutCallType createDescribeSoftphoneLayoutCallType() {
        return new DescribeSoftphoneLayoutCallType();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link DescribeTab }
     * 
     */
    public DescribeTab createDescribeTab() {
        return new DescribeTab();
    }

    /**
     * Create an instance of {@link InvalidSObjectFault }
     * 
     */
    public InvalidSObjectFault createInvalidSObjectFault() {
        return new InvalidSObjectFault();
    }

    /**
     * Create an instance of {@link MalformedQueryFault }
     * 
     */
    public MalformedQueryFault createMalformedQueryFault() {
        return new MalformedQueryFault();
    }

    /**
     * Create an instance of {@link InvalidIdFault }
     * 
     */
    public InvalidIdFault createInvalidIdFault() {
        return new InvalidIdFault();
    }

    /**
     * Create an instance of {@link MalformedSearchFault }
     * 
     */
    public MalformedSearchFault createMalformedSearchFault() {
        return new MalformedSearchFault();
    }

    /**
     * Create an instance of {@link InvalidFieldFault }
     * 
     */
    public InvalidFieldFault createInvalidFieldFault() {
        return new InvalidFieldFault();
    }

    /**
     * Create an instance of {@link UnexpectedErrorFault }
     * 
     */
    public UnexpectedErrorFault createUnexpectedErrorFault() {
        return new UnexpectedErrorFault();
    }

    /**
     * Create an instance of {@link ApiFault }
     * 
     */
    public ApiFault createApiFault() {
        return new ApiFault();
    }

    /**
     * Create an instance of {@link InvalidQueryLocatorFault }
     * 
     */
    public InvalidQueryLocatorFault createInvalidQueryLocatorFault() {
        return new InvalidQueryLocatorFault();
    }

    /**
     * Create an instance of {@link LoginFault }
     * 
     */
    public LoginFault createLoginFault() {
        return new LoginFault();
    }

    /**
     * Create an instance of {@link InvalidNewPasswordFault }
     * 
     */
    public InvalidNewPasswordFault createInvalidNewPasswordFault() {
        return new InvalidNewPasswordFault();
    }

    /**
     * Create an instance of {@link ApiQueryFault }
     * 
     */
    public ApiQueryFault createApiQueryFault() {
        return new ApiQueryFault();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "lookupId", scope = RelatedListColumn.class)
    public JAXBElement<String> createRelatedListColumnLookupId(String value) {
        return new JAXBElement<String>(_RelatedListColumnLookupId_QNAME, String.class, RelatedListColumn.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnexpectedErrorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "UnexpectedErrorFault")
    public JAXBElement<UnexpectedErrorFault> createUnexpectedErrorFault(UnexpectedErrorFault value) {
        return new JAXBElement<UnexpectedErrorFault>(_UnexpectedErrorFault_QNAME, UnexpectedErrorFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApiFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "fault")
    public JAXBElement<ApiFault> createFault(ApiFault value) {
        return new JAXBElement<ApiFault>(_Fault_QNAME, ApiFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "LoginFault")
    public JAXBElement<LoginFault> createLoginFault(LoginFault value) {
        return new JAXBElement<LoginFault>(_LoginFault_QNAME, LoginFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidQueryLocatorFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "InvalidQueryLocatorFault")
    public JAXBElement<InvalidQueryLocatorFault> createInvalidQueryLocatorFault(InvalidQueryLocatorFault value) {
        return new JAXBElement<InvalidQueryLocatorFault>(_InvalidQueryLocatorFault_QNAME, InvalidQueryLocatorFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidNewPasswordFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "InvalidNewPasswordFault")
    public JAXBElement<InvalidNewPasswordFault> createInvalidNewPasswordFault(InvalidNewPasswordFault value) {
        return new JAXBElement<InvalidNewPasswordFault>(_InvalidNewPasswordFault_QNAME, InvalidNewPasswordFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidSObjectFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "InvalidSObjectFault")
    public JAXBElement<InvalidSObjectFault> createInvalidSObjectFault(InvalidSObjectFault value) {
        return new JAXBElement<InvalidSObjectFault>(_InvalidSObjectFault_QNAME, InvalidSObjectFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedQueryFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "MalformedQueryFault")
    public JAXBElement<MalformedQueryFault> createMalformedQueryFault(MalformedQueryFault value) {
        return new JAXBElement<MalformedQueryFault>(_MalformedQueryFault_QNAME, MalformedQueryFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidIdFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "InvalidIdFault")
    public JAXBElement<InvalidIdFault> createInvalidIdFault(InvalidIdFault value) {
        return new JAXBElement<InvalidIdFault>(_InvalidIdFault_QNAME, InvalidIdFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidFieldFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "InvalidFieldFault")
    public JAXBElement<InvalidFieldFault> createInvalidFieldFault(InvalidFieldFault value) {
        return new JAXBElement<InvalidFieldFault>(_InvalidFieldFault_QNAME, InvalidFieldFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MalformedSearchFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:fault.partner.soap.sforce.com", name = "MalformedSearchFault")
    public JAXBElement<MalformedSearchFault> createMalformedSearchFault(MalformedSearchFault value) {
        return new JAXBElement<MalformedSearchFault>(_MalformedSearchFault_QNAME, MalformedSearchFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "contentType", scope = EmailFileAttachment.class)
    public JAXBElement<String> createEmailFileAttachmentContentType(String value) {
        return new JAXBElement<String>(_EmailFileAttachmentContentType_QNAME, String.class, EmailFileAttachment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "body", scope = EmailFileAttachment.class)
    public JAXBElement<byte[]> createEmailFileAttachmentBody(byte[] value) {
        return new JAXBElement<byte[]>(_EmailFileAttachmentBody_QNAME, byte[].class, EmailFileAttachment.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "orgWideEmailAddressId", scope = SingleEmailMessage.class)
    public JAXBElement<String> createSingleEmailMessageOrgWideEmailAddressId(String value) {
        return new JAXBElement<String>(_SingleEmailMessageOrgWideEmailAddressId_QNAME, String.class, SingleEmailMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "inReplyTo", scope = SingleEmailMessage.class)
    public JAXBElement<String> createSingleEmailMessageInReplyTo(String value) {
        return new JAXBElement<String>(_SingleEmailMessageInReplyTo_QNAME, String.class, SingleEmailMessage.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:partner.soap.sforce.com", name = "references", scope = SingleEmailMessage.class)
    public JAXBElement<String> createSingleEmailMessageReferences(String value) {
        return new JAXBElement<String>(_SingleEmailMessageReferences_QNAME, String.class, SingleEmailMessage.class, value);
    }

}

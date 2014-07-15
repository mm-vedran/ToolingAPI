
package com.nttdata.sf.tooling;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALL_OR_NONE_OPERATION_ROLLED_BACK"/>
 *     &lt;enumeration value="ALREADY_IN_PROCESS"/>
 *     &lt;enumeration value="ASSIGNEE_TYPE_REQUIRED"/>
 *     &lt;enumeration value="BAD_CUSTOM_ENTITY_PARENT_DOMAIN"/>
 *     &lt;enumeration value="BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED"/>
 *     &lt;enumeration value="CANNOT_CASCADE_PRODUCT_ACTIVE"/>
 *     &lt;enumeration value="CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE"/>
 *     &lt;enumeration value="CANNOT_DEACTIVATE_DIVISION"/>
 *     &lt;enumeration value="CANNOT_DELETE_LAST_DATED_CONVERSION_RATE"/>
 *     &lt;enumeration value="CANNOT_DELETE_MANAGED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_DISABLE_LAST_ADMIN"/>
 *     &lt;enumeration value="CANNOT_ENABLE_IP_RESTRICT_REQUESTS"/>
 *     &lt;enumeration value="CANNOT_EXECUTE_FLOW_TRIGGER"/>
 *     &lt;enumeration value="CANNOT_FREEZE_SELF"/>
 *     &lt;enumeration value="CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY"/>
 *     &lt;enumeration value="CANNOT_MODIFY_MANAGED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_PASSWORD_LOCKOUT"/>
 *     &lt;enumeration value="CANNOT_RENAME_APEX_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_RENAME_APEX_REFERENCED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_RENAME_REFERENCED_FIELD"/>
 *     &lt;enumeration value="CANNOT_RENAME_REFERENCED_OBJECT"/>
 *     &lt;enumeration value="CANNOT_REPARENT_RECORD"/>
 *     &lt;enumeration value="CANNOT_UPDATE_CONVERTED_LEAD"/>
 *     &lt;enumeration value="CANT_DISABLE_CORP_CURRENCY"/>
 *     &lt;enumeration value="CANT_UNSET_CORP_CURRENCY"/>
 *     &lt;enumeration value="CHILD_SHARE_FAILS_PARENT"/>
 *     &lt;enumeration value="CIRCULAR_DEPENDENCY"/>
 *     &lt;enumeration value="COLLISION_DETECTED"/>
 *     &lt;enumeration value="COMMUNITY_NOT_ACCESSIBLE"/>
 *     &lt;enumeration value="CUSTOM_APEX_ERROR"/>
 *     &lt;enumeration value="CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="CUSTOM_ENTITY_OR_FIELD_LIMIT"/>
 *     &lt;enumeration value="CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="CUSTOM_INDEX_EXISTS"/>
 *     &lt;enumeration value="CUSTOM_LINK_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="CUSTOM_METADATA_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="CUSTOM_TAB_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="DELETE_FAILED"/>
 *     &lt;enumeration value="DELETE_OPERATION_TOO_LARGE"/>
 *     &lt;enumeration value="DELETE_REQUIRED_ON_CASCADE"/>
 *     &lt;enumeration value="DEPENDENCY_EXISTS"/>
 *     &lt;enumeration value="DUPLICATES_DETECTED"/>
 *     &lt;enumeration value="DUPLICATE_CASE_SOLUTION"/>
 *     &lt;enumeration value="DUPLICATE_COMM_NICKNAME"/>
 *     &lt;enumeration value="DUPLICATE_CUSTOM_ENTITY_DEFINITION"/>
 *     &lt;enumeration value="DUPLICATE_CUSTOM_TAB_MOTIF"/>
 *     &lt;enumeration value="DUPLICATE_DEVELOPER_NAME"/>
 *     &lt;enumeration value="DUPLICATE_EXTERNAL_ID"/>
 *     &lt;enumeration value="DUPLICATE_MASTER_LABEL"/>
 *     &lt;enumeration value="DUPLICATE_SENDER_DISPLAY_NAME"/>
 *     &lt;enumeration value="DUPLICATE_USERNAME"/>
 *     &lt;enumeration value="DUPLICATE_VALUE"/>
 *     &lt;enumeration value="EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR"/>
 *     &lt;enumeration value="EMPTY_SCONTROL_FILE_NAME"/>
 *     &lt;enumeration value="ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE"/>
 *     &lt;enumeration value="ENTITY_IS_ARCHIVED"/>
 *     &lt;enumeration value="ENTITY_IS_DELETED"/>
 *     &lt;enumeration value="ENTITY_IS_LOCKED"/>
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT"/>
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_ERROR_JOINING_HUB"/>
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_USER_ALREADY_IN_HUB"/>
 *     &lt;enumeration value="ENVIRONMENT_HUB_MEMBERSHIP_USER_NOT_ORG_ADMIN"/>
 *     &lt;enumeration value="ERROR_IN_MAILER"/>
 *     &lt;enumeration value="FAILED_ACTIVATION"/>
 *     &lt;enumeration value="FIELD_CUSTOM_VALIDATION_EXCEPTION"/>
 *     &lt;enumeration value="FIELD_FILTER_VALIDATION_EXCEPTION"/>
 *     &lt;enumeration value="FIELD_INTEGRITY_EXCEPTION"/>
 *     &lt;enumeration value="FILTERED_LOOKUP_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="HTML_FILE_UPLOAD_NOT_ALLOWED"/>
 *     &lt;enumeration value="IMAGE_TOO_LARGE"/>
 *     &lt;enumeration value="INACTIVE_OWNER_OR_USER"/>
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY"/>
 *     &lt;enumeration value="INSUFFICIENT_ACCESS_OR_READONLY"/>
 *     &lt;enumeration value="INVALID_ACCESS_LEVEL"/>
 *     &lt;enumeration value="INVALID_ARGUMENT_TYPE"/>
 *     &lt;enumeration value="INVALID_ASSIGNEE_TYPE"/>
 *     &lt;enumeration value="INVALID_ASSIGNMENT_RULE"/>
 *     &lt;enumeration value="INVALID_BATCH_OPERATION"/>
 *     &lt;enumeration value="INVALID_CONTENT_TYPE"/>
 *     &lt;enumeration value="INVALID_CREDIT_CARD_INFO"/>
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_KEY"/>
 *     &lt;enumeration value="INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD"/>
 *     &lt;enumeration value="INVALID_CURRENCY_CONV_RATE"/>
 *     &lt;enumeration value="INVALID_CURRENCY_CORP_RATE"/>
 *     &lt;enumeration value="INVALID_CURRENCY_ISO"/>
 *     &lt;enumeration value="INVALID_DATA_CATEGORY_GROUP_REFERENCE"/>
 *     &lt;enumeration value="INVALID_DATA_URI"/>
 *     &lt;enumeration value="INVALID_EMAIL_ADDRESS"/>
 *     &lt;enumeration value="INVALID_EMPTY_KEY_OWNER"/>
 *     &lt;enumeration value="INVALID_FIELD"/>
 *     &lt;enumeration value="INVALID_FIELD_FOR_INSERT_UPDATE"/>
 *     &lt;enumeration value="INVALID_FIELD_WHEN_USING_TEMPLATE"/>
 *     &lt;enumeration value="INVALID_FILTER_ACTION"/>
 *     &lt;enumeration value="INVALID_GOOGLE_DOCS_URL"/>
 *     &lt;enumeration value="INVALID_ID_FIELD"/>
 *     &lt;enumeration value="INVALID_INET_ADDRESS"/>
 *     &lt;enumeration value="INVALID_LINEITEM_CLONE_STATE"/>
 *     &lt;enumeration value="INVALID_MASTER_OR_TRANSLATED_SOLUTION"/>
 *     &lt;enumeration value="INVALID_MESSAGE_ID_REFERENCE"/>
 *     &lt;enumeration value="INVALID_OAUTH_URL"/>
 *     &lt;enumeration value="INVALID_OPERATION"/>
 *     &lt;enumeration value="INVALID_OPERATOR"/>
 *     &lt;enumeration value="INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST"/>
 *     &lt;enumeration value="INVALID_OWNER"/>
 *     &lt;enumeration value="INVALID_PACKAGE_VERSION"/>
 *     &lt;enumeration value="INVALID_PARTNER_NETWORK_STATUS"/>
 *     &lt;enumeration value="INVALID_PERSON_ACCOUNT_OPERATION"/>
 *     &lt;enumeration value="INVALID_QUERY_LOCATOR"/>
 *     &lt;enumeration value="INVALID_READ_ONLY_USER_DML"/>
 *     &lt;enumeration value="INVALID_SAVE_AS_ACTIVITY_FLAG"/>
 *     &lt;enumeration value="INVALID_SESSION_ID"/>
 *     &lt;enumeration value="INVALID_SETUP_OWNER"/>
 *     &lt;enumeration value="INVALID_SIGNUP_COUNTRY"/>
 *     &lt;enumeration value="INVALID_SITE_DELETE_EXCEPTION"/>
 *     &lt;enumeration value="INVALID_SITE_FILE_IMPORTED_EXCEPTION"/>
 *     &lt;enumeration value="INVALID_SITE_FILE_TYPE_EXCEPTION"/>
 *     &lt;enumeration value="INVALID_STATUS"/>
 *     &lt;enumeration value="INVALID_SUBDOMAIN"/>
 *     &lt;enumeration value="INVALID_TYPE"/>
 *     &lt;enumeration value="INVALID_TYPE_FOR_OPERATION"/>
 *     &lt;enumeration value="INVALID_TYPE_ON_FIELD_IN_RECORD"/>
 *     &lt;enumeration value="IP_RANGE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="JIGSAW_IMPORT_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="LICENSE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="LIGHT_PORTAL_USER_EXCEPTION"/>
 *     &lt;enumeration value="LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="MALFORMED_ID"/>
 *     &lt;enumeration value="MANAGER_NOT_DEFINED"/>
 *     &lt;enumeration value="MASSMAIL_RETRY_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="MASS_MAIL_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="MATCH_DEFINITION_ERROR"/>
 *     &lt;enumeration value="MATCH_OPERATION_ERROR"/>
 *     &lt;enumeration value="MATCH_OPERATION_INVALID_ENGINE_ERROR"/>
 *     &lt;enumeration value="MATCH_OPERATION_UNKNOWN_ENGINE_ERROR"/>
 *     &lt;enumeration value="MATCH_OPERATION_UNKNOWN_RULE_ERROR"/>
 *     &lt;enumeration value="MATCH_RUNTIME_ERROR"/>
 *     &lt;enumeration value="MAXIMUM_CCEMAILS_EXCEEDED"/>
 *     &lt;enumeration value="MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED"/>
 *     &lt;enumeration value="MAXIMUM_HIERARCHY_LEVELS_REACHED"/>
 *     &lt;enumeration value="MAXIMUM_SIZE_OF_ATTACHMENT"/>
 *     &lt;enumeration value="MAXIMUM_SIZE_OF_DOCUMENT"/>
 *     &lt;enumeration value="MAX_ACTIONS_PER_RULE_EXCEEDED"/>
 *     &lt;enumeration value="MAX_ACTIVE_RULES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_APPROVAL_STEPS_EXCEEDED"/>
 *     &lt;enumeration value="MAX_FORMULAS_PER_RULE_EXCEEDED"/>
 *     &lt;enumeration value="MAX_RULES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_RULE_ENTRIES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_TASK_DESCRIPTION_EXCEEEDED"/>
 *     &lt;enumeration value="MAX_TM_RULES_EXCEEDED"/>
 *     &lt;enumeration value="MAX_TM_RULE_ITEMS_EXCEEDED"/>
 *     &lt;enumeration value="MERGE_FAILED"/>
 *     &lt;enumeration value="MISSING_ARGUMENT"/>
 *     &lt;enumeration value="MIXED_DML_OPERATION"/>
 *     &lt;enumeration value="NONUNIQUE_SHIPPING_ADDRESS"/>
 *     &lt;enumeration value="NO_APPLICABLE_PROCESS"/>
 *     &lt;enumeration value="NO_ATTACHMENT_PERMISSION"/>
 *     &lt;enumeration value="NO_INACTIVE_DIVISION_MEMBERS"/>
 *     &lt;enumeration value="NO_MASS_MAIL_PERMISSION"/>
 *     &lt;enumeration value="NO_SUCH_USER_EXISTS"/>
 *     &lt;enumeration value="NUMBER_OUTSIDE_VALID_RANGE"/>
 *     &lt;enumeration value="NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED"/>
 *     &lt;enumeration value="OPTED_OUT_OF_MASS_MAIL"/>
 *     &lt;enumeration value="OP_WITH_INVALID_USER_TYPE_EXCEPTION"/>
 *     &lt;enumeration value="PACKAGE_LICENSE_REQUIRED"/>
 *     &lt;enumeration value="PACKAGING_API_INSTALL_FAILED"/>
 *     &lt;enumeration value="PACKAGING_API_UNINSTALL_FAILED"/>
 *     &lt;enumeration value="PORTAL_NO_ACCESS"/>
 *     &lt;enumeration value="PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT"/>
 *     &lt;enumeration value="PRIVATE_CONTACT_ON_ASSET"/>
 *     &lt;enumeration value="QUERY_TIMEOUT"/>
 *     &lt;enumeration value="RECORD_IN_USE_BY_WORKFLOW"/>
 *     &lt;enumeration value="REQUEST_RUNNING_TOO_LONG"/>
 *     &lt;enumeration value="REQUIRED_FEATURE_MISSING"/>
 *     &lt;enumeration value="REQUIRED_FIELD_MISSING"/>
 *     &lt;enumeration value="SELF_REFERENCE_FROM_FLOW"/>
 *     &lt;enumeration value="SELF_REFERENCE_FROM_TRIGGER"/>
 *     &lt;enumeration value="SHARE_NEEDED_FOR_CHILD_OWNER"/>
 *     &lt;enumeration value="SINGLE_EMAIL_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="STANDARD_PRICE_NOT_DEFINED"/>
 *     &lt;enumeration value="STORAGE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="STRING_TOO_LONG"/>
 *     &lt;enumeration value="SUBDOMAIN_IN_USE"/>
 *     &lt;enumeration value="TABSET_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="TEMPLATE_NOT_ACTIVE"/>
 *     &lt;enumeration value="TEMPLATE_NOT_FOUND"/>
 *     &lt;enumeration value="TERRITORY_REALIGN_IN_PROGRESS"/>
 *     &lt;enumeration value="TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET"/>
 *     &lt;enumeration value="TOO_MANY_APEX_REQUESTS"/>
 *     &lt;enumeration value="TOO_MANY_ENUM_VALUE"/>
 *     &lt;enumeration value="TOO_MANY_POSSIBLE_USERS_EXIST"/>
 *     &lt;enumeration value="TRANSFER_REQUIRES_READ"/>
 *     &lt;enumeration value="UNABLE_TO_LOCK_ROW"/>
 *     &lt;enumeration value="UNAVAILABLE_RECORDTYPE_EXCEPTION"/>
 *     &lt;enumeration value="UNDELETE_FAILED"/>
 *     &lt;enumeration value="UNKNOWN_EXCEPTION"/>
 *     &lt;enumeration value="UNSPECIFIED_EMAIL_ADDRESS"/>
 *     &lt;enumeration value="UNSUPPORTED_APEX_TRIGGER_OPERATON"/>
 *     &lt;enumeration value="UNVERIFIED_SENDER_ADDRESS"/>
 *     &lt;enumeration value="USER_OWNS_PORTAL_ACCOUNT_EXCEPTION"/>
 *     &lt;enumeration value="USER_WITH_APEX_SHARES_EXCEPTION"/>
 *     &lt;enumeration value="WEBLINK_SIZE_LIMIT_EXCEEDED"/>
 *     &lt;enumeration value="WEBLINK_URL_INVALID"/>
 *     &lt;enumeration value="WRONG_CONTROLLER_TYPE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusCode")
@XmlEnum
public enum StatusCode {

    ALL_OR_NONE_OPERATION_ROLLED_BACK,
    ALREADY_IN_PROCESS,
    ASSIGNEE_TYPE_REQUIRED,
    BAD_CUSTOM_ENTITY_PARENT_DOMAIN,
    BCC_NOT_ALLOWED_IF_BCC_COMPLIANCE_ENABLED,
    CANNOT_CASCADE_PRODUCT_ACTIVE,
    CANNOT_CHANGE_FIELD_TYPE_OF_APEX_REFERENCED_FIELD,
    CANNOT_CHANGE_FIELD_TYPE_OF_REFERENCED_FIELD,
    CANNOT_CREATE_ANOTHER_MANAGED_PACKAGE,
    CANNOT_DEACTIVATE_DIVISION,
    CANNOT_DELETE_LAST_DATED_CONVERSION_RATE,
    CANNOT_DELETE_MANAGED_OBJECT,
    CANNOT_DISABLE_LAST_ADMIN,
    CANNOT_ENABLE_IP_RESTRICT_REQUESTS,
    CANNOT_EXECUTE_FLOW_TRIGGER,
    CANNOT_FREEZE_SELF,
    CANNOT_INSERT_UPDATE_ACTIVATE_ENTITY,
    CANNOT_MODIFY_MANAGED_OBJECT,
    CANNOT_PASSWORD_LOCKOUT,
    CANNOT_RENAME_APEX_REFERENCED_FIELD,
    CANNOT_RENAME_APEX_REFERENCED_OBJECT,
    CANNOT_RENAME_REFERENCED_FIELD,
    CANNOT_RENAME_REFERENCED_OBJECT,
    CANNOT_REPARENT_RECORD,
    CANNOT_UPDATE_CONVERTED_LEAD,
    CANT_DISABLE_CORP_CURRENCY,
    CANT_UNSET_CORP_CURRENCY,
    CHILD_SHARE_FAILS_PARENT,
    CIRCULAR_DEPENDENCY,
    COLLISION_DETECTED,
    COMMUNITY_NOT_ACCESSIBLE,
    CUSTOM_APEX_ERROR,
    CUSTOM_CLOB_FIELD_LIMIT_EXCEEDED,
    CUSTOM_ENTITY_OR_FIELD_LIMIT,
    CUSTOM_FIELD_INDEX_LIMIT_EXCEEDED,
    CUSTOM_INDEX_EXISTS,
    CUSTOM_LINK_LIMIT_EXCEEDED,
    CUSTOM_METADATA_LIMIT_EXCEEDED,
    CUSTOM_TAB_LIMIT_EXCEEDED,
    DELETE_FAILED,
    DELETE_OPERATION_TOO_LARGE,
    DELETE_REQUIRED_ON_CASCADE,
    DEPENDENCY_EXISTS,
    DUPLICATES_DETECTED,
    DUPLICATE_CASE_SOLUTION,
    DUPLICATE_COMM_NICKNAME,
    DUPLICATE_CUSTOM_ENTITY_DEFINITION,
    DUPLICATE_CUSTOM_TAB_MOTIF,
    DUPLICATE_DEVELOPER_NAME,
    DUPLICATE_EXTERNAL_ID,
    DUPLICATE_MASTER_LABEL,
    DUPLICATE_SENDER_DISPLAY_NAME,
    DUPLICATE_USERNAME,
    DUPLICATE_VALUE,
    EMAIL_NOT_PROCESSED_DUE_TO_PRIOR_ERROR,
    EMPTY_SCONTROL_FILE_NAME,
    ENTITY_FAILED_IFLASTMODIFIED_ON_UPDATE,
    ENTITY_IS_ARCHIVED,
    ENTITY_IS_DELETED,
    ENTITY_IS_LOCKED,
    ENVIRONMENT_HUB_MEMBERSHIP_CONFLICT,
    ENVIRONMENT_HUB_MEMBERSHIP_ERROR_JOINING_HUB,
    ENVIRONMENT_HUB_MEMBERSHIP_USER_ALREADY_IN_HUB,
    ENVIRONMENT_HUB_MEMBERSHIP_USER_NOT_ORG_ADMIN,
    ERROR_IN_MAILER,
    FAILED_ACTIVATION,
    FIELD_CUSTOM_VALIDATION_EXCEPTION,
    FIELD_FILTER_VALIDATION_EXCEPTION,
    FIELD_INTEGRITY_EXCEPTION,
    FILTERED_LOOKUP_LIMIT_EXCEEDED,
    HTML_FILE_UPLOAD_NOT_ALLOWED,
    IMAGE_TOO_LARGE,
    INACTIVE_OWNER_OR_USER,
    INSUFFICIENT_ACCESS_ON_CROSS_REFERENCE_ENTITY,
    INSUFFICIENT_ACCESS_OR_READONLY,
    INVALID_ACCESS_LEVEL,
    INVALID_ARGUMENT_TYPE,
    INVALID_ASSIGNEE_TYPE,
    INVALID_ASSIGNMENT_RULE,
    INVALID_BATCH_OPERATION,
    INVALID_CONTENT_TYPE,
    INVALID_CREDIT_CARD_INFO,
    INVALID_CROSS_REFERENCE_KEY,
    INVALID_CROSS_REFERENCE_TYPE_FOR_FIELD,
    INVALID_CURRENCY_CONV_RATE,
    INVALID_CURRENCY_CORP_RATE,
    INVALID_CURRENCY_ISO,
    INVALID_DATA_CATEGORY_GROUP_REFERENCE,
    INVALID_DATA_URI,
    INVALID_EMAIL_ADDRESS,
    INVALID_EMPTY_KEY_OWNER,
    INVALID_FIELD,
    INVALID_FIELD_FOR_INSERT_UPDATE,
    INVALID_FIELD_WHEN_USING_TEMPLATE,
    INVALID_FILTER_ACTION,
    INVALID_GOOGLE_DOCS_URL,
    INVALID_ID_FIELD,
    INVALID_INET_ADDRESS,
    INVALID_LINEITEM_CLONE_STATE,
    INVALID_MASTER_OR_TRANSLATED_SOLUTION,
    INVALID_MESSAGE_ID_REFERENCE,
    INVALID_OAUTH_URL,
    INVALID_OPERATION,
    INVALID_OPERATOR,
    INVALID_OR_NULL_FOR_RESTRICTED_PICKLIST,
    INVALID_OWNER,
    INVALID_PACKAGE_VERSION,
    INVALID_PARTNER_NETWORK_STATUS,
    INVALID_PERSON_ACCOUNT_OPERATION,
    INVALID_QUERY_LOCATOR,
    INVALID_READ_ONLY_USER_DML,
    INVALID_SAVE_AS_ACTIVITY_FLAG,
    INVALID_SESSION_ID,
    INVALID_SETUP_OWNER,
    INVALID_SIGNUP_COUNTRY,
    INVALID_SITE_DELETE_EXCEPTION,
    INVALID_SITE_FILE_IMPORTED_EXCEPTION,
    INVALID_SITE_FILE_TYPE_EXCEPTION,
    INVALID_STATUS,
    INVALID_SUBDOMAIN,
    INVALID_TYPE,
    INVALID_TYPE_FOR_OPERATION,
    INVALID_TYPE_ON_FIELD_IN_RECORD,
    IP_RANGE_LIMIT_EXCEEDED,
    JIGSAW_IMPORT_LIMIT_EXCEEDED,
    LICENSE_LIMIT_EXCEEDED,
    LIGHT_PORTAL_USER_EXCEPTION,
    LIMIT_EXCEEDED,
    MALFORMED_ID,
    MANAGER_NOT_DEFINED,
    MASSMAIL_RETRY_LIMIT_EXCEEDED,
    MASS_MAIL_LIMIT_EXCEEDED,
    MATCH_DEFINITION_ERROR,
    MATCH_OPERATION_ERROR,
    MATCH_OPERATION_INVALID_ENGINE_ERROR,
    MATCH_OPERATION_UNKNOWN_ENGINE_ERROR,
    MATCH_OPERATION_UNKNOWN_RULE_ERROR,
    MATCH_RUNTIME_ERROR,
    MAXIMUM_CCEMAILS_EXCEEDED,
    MAXIMUM_DASHBOARD_COMPONENTS_EXCEEDED,
    MAXIMUM_HIERARCHY_LEVELS_REACHED,
    MAXIMUM_SIZE_OF_ATTACHMENT,
    MAXIMUM_SIZE_OF_DOCUMENT,
    MAX_ACTIONS_PER_RULE_EXCEEDED,
    MAX_ACTIVE_RULES_EXCEEDED,
    MAX_APPROVAL_STEPS_EXCEEDED,
    MAX_FORMULAS_PER_RULE_EXCEEDED,
    MAX_RULES_EXCEEDED,
    MAX_RULE_ENTRIES_EXCEEDED,
    MAX_TASK_DESCRIPTION_EXCEEEDED,
    MAX_TM_RULES_EXCEEDED,
    MAX_TM_RULE_ITEMS_EXCEEDED,
    MERGE_FAILED,
    MISSING_ARGUMENT,
    MIXED_DML_OPERATION,
    NONUNIQUE_SHIPPING_ADDRESS,
    NO_APPLICABLE_PROCESS,
    NO_ATTACHMENT_PERMISSION,
    NO_INACTIVE_DIVISION_MEMBERS,
    NO_MASS_MAIL_PERMISSION,
    NO_SUCH_USER_EXISTS,
    NUMBER_OUTSIDE_VALID_RANGE,
    NUM_HISTORY_FIELDS_BY_SOBJECT_EXCEEDED,
    OPTED_OUT_OF_MASS_MAIL,
    OP_WITH_INVALID_USER_TYPE_EXCEPTION,
    PACKAGE_LICENSE_REQUIRED,
    PACKAGING_API_INSTALL_FAILED,
    PACKAGING_API_UNINSTALL_FAILED,
    PORTAL_NO_ACCESS,
    PORTAL_USER_ALREADY_EXISTS_FOR_CONTACT,
    PRIVATE_CONTACT_ON_ASSET,
    QUERY_TIMEOUT,
    RECORD_IN_USE_BY_WORKFLOW,
    REQUEST_RUNNING_TOO_LONG,
    REQUIRED_FEATURE_MISSING,
    REQUIRED_FIELD_MISSING,
    SELF_REFERENCE_FROM_FLOW,
    SELF_REFERENCE_FROM_TRIGGER,
    SHARE_NEEDED_FOR_CHILD_OWNER,
    SINGLE_EMAIL_LIMIT_EXCEEDED,
    STANDARD_PRICE_NOT_DEFINED,
    STORAGE_LIMIT_EXCEEDED,
    STRING_TOO_LONG,
    SUBDOMAIN_IN_USE,
    TABSET_LIMIT_EXCEEDED,
    TEMPLATE_NOT_ACTIVE,
    TEMPLATE_NOT_FOUND,
    TERRITORY_REALIGN_IN_PROGRESS,
    TEXT_DATA_OUTSIDE_SUPPORTED_CHARSET,
    TOO_MANY_APEX_REQUESTS,
    TOO_MANY_ENUM_VALUE,
    TOO_MANY_POSSIBLE_USERS_EXIST,
    TRANSFER_REQUIRES_READ,
    UNABLE_TO_LOCK_ROW,
    UNAVAILABLE_RECORDTYPE_EXCEPTION,
    UNDELETE_FAILED,
    UNKNOWN_EXCEPTION,
    UNSPECIFIED_EMAIL_ADDRESS,
    UNSUPPORTED_APEX_TRIGGER_OPERATON,
    UNVERIFIED_SENDER_ADDRESS,
    USER_OWNS_PORTAL_ACCOUNT_EXCEPTION,
    USER_WITH_APEX_SHARES_EXCEPTION,
    WEBLINK_SIZE_LIMIT_EXCEEDED,
    WEBLINK_URL_INVALID,
    WRONG_CONTROLLER_TYPE;

    public String value() {
        return name();
    }

    public static StatusCode fromValue(String v) {
        return valueOf(v);
    }

}
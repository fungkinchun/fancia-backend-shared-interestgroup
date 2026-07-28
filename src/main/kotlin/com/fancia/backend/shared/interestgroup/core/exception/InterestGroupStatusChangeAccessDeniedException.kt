package com.fancia.backend.shared.interestgroup.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException

class InterestGroupStatusChangeAccessDeniedException(
    title: String = "Access denied for changing interest group status",
    message: String = "Only admins can change status (except withdrawal)",
    errorCode: String = "INTEREST_GROUP_STATUS_CHANGE_ACCESS_DENIED"
) : DomainException(title, message, errorCode)
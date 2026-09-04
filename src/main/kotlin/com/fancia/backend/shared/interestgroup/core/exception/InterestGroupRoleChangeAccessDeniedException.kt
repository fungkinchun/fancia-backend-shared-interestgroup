package com.fancia.backend.shared.interestgroup.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException

class InterestGroupRoleChangeAccessDeniedException(
    title: String = "Access denied for changing interest group role",
    message: String = "Only admins can promote or demote members, and the organiser cannot be demoted",
    errorCode: String = "INTEREST_GROUP_ROLE_CHANGE_ACCESS_DENIED",
) : DomainException(title, message, errorCode)

package com.fancia.backend.shared.interestgroup.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class InterestGroupMembershipAccessDeniedException(
    val interestGroupId: UUID,
    val userId: UUID,
    title: String = "Access denied to create interest group membership",
    message: String = "Only admins or the member themselves can create membership in interest group $interestGroupId for user $userId",
    errorCode: String = "INTEREST_GROUP_MEMBERSHIP_ACCESS_DENIED"
) : DomainException(title, message, errorCode)
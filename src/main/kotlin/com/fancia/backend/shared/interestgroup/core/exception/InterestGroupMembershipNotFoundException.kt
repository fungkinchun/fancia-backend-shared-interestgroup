package com.fancia.backend.shared.interestgroup.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class InterestGroupMembershipNotFoundException(
    val interestGroupId: UUID,
    val userId: UUID,
    title: String = "Interest group membership not found",
    message: String = "Interest group membership not found with interestGroupId: $interestGroupId userId: $userId",
    errorCode: String = "INTEREST_GROUP_MEMBERSHIP_NOT_FOUND"
) : DomainException(title, message, errorCode)
package com.fancia.backend.shared.interestgroup.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class InterestGroupMembershipAlreadyExistsException(
    val interestGroupId: UUID,
    val userId: UUID,
    title: String = "Interest group membership already exists",
    message: String = "User $userId already joined interest group $interestGroupId",
    errorCode: String = "INTEREST_GROUP_MEMBERSHIP_ALREADY_EXISTS"
) : DomainException(title, message, errorCode)
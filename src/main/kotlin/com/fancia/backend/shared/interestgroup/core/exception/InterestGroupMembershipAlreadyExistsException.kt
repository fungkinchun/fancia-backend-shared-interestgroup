package com.fancia.backend.shared.interestgroup.core.exception

import java.util.*

class InterestGroupMembershipAlreadyExistsException(
    val interestGroupId: UUID,
    val userId: UUID,
    message: String = "User $userId already joined interest group $interestGroupId"
) : Throwable()
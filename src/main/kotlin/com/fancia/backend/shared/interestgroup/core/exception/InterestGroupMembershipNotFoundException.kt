package com.fancia.backend.shared.interestgroup.core.exception

import java.util.*

class InterestGroupMembershipNotFoundException(
    val interestGroupId: UUID,
    val userId: UUID,
    message: String = "Interest group membership not found with interestGroupId: $interestGroupId userId: $userId"
) : Throwable()
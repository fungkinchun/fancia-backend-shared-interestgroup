package com.fancia.backend.shared.interestgroup.core.exception

import java.util.*

class InterestGroupMembershipAccessDeniedException(
    val interestGroupId: UUID,
    val userId: UUID,
    message: String = "Only admins or the member themselves can create membership in interest group $interestGroupId for user $userId"
) : Throwable()
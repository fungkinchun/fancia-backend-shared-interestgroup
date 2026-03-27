package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.interestgroup.core.enums.MembershipStatus
import java.util.*

data class InterestGroupMembershipResponse(
    val interestGroupId: UUID,
    val userId: UUID,
    val status: MembershipStatus
)
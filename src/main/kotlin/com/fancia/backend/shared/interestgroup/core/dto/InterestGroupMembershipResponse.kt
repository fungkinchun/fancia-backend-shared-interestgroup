package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.interestgroup.core.enums.MembershipStatus
import java.util.*

data class InterestGroupMembershipResponse(
    val interestGroupId: UUID? = null,
    val userId: UUID? = null,
    val status: MembershipStatus? = null,
)
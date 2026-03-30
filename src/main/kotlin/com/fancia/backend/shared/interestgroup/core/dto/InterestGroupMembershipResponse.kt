package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.interestgroup.core.enums.MembershipStatus
import java.util.*

data class InterestGroupMembershipResponse(
    var interestGroupId: UUID? = null,
    var userId: UUID? = null,
    var status: MembershipStatus? = null,
)
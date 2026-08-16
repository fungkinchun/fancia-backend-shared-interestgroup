package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.interestgroup.core.enums.InterestGroupRole
import com.fancia.backend.shared.interestgroup.core.enums.MembershipStatus
import java.time.LocalDateTime
import java.util.*

data class InterestGroupMembershipResponse(
    var interestGroupId: UUID? = null,
    var userId: UUID? = null,
    var status: MembershipStatus? = null,
    var role: InterestGroupRole? = null,
    var joinedAt: LocalDateTime? = null,
)

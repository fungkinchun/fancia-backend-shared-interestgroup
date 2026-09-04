package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.interestgroup.core.enums.InterestGroupRole
import com.fancia.backend.shared.interestgroup.core.enums.MembershipStatus

data class UpdateInterestGroupMembershipRequest(
    var status: MembershipStatus? = null,
    var role: InterestGroupRole? = null,
)

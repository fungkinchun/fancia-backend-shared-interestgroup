package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.interestgroup.core.enums.MembershipStatus

data class UpdateInterestGroupMembershipRequest(
    var status: MembershipStatus
)
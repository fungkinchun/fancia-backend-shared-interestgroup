package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.interestgroup.core.enums.MembershipStatus
import jakarta.validation.constraints.NotBlank
import java.util.*

data class UpdateInterestGroupMembershipRequest(
    var status: MembershipStatus
)
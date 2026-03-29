package com.fancia.backend.shared.interestgroup.core.dto

import jakarta.validation.constraints.NotBlank
import java.util.*

data class CreateInterestGroupMembershipRequest(
    @field:NotBlank(message = "Interest Group ID is required")
    val interestGroupId: UUID,
    @field:NotBlank(message = "User ID is required")
    val userId: UUID,
    var payload: String,
)
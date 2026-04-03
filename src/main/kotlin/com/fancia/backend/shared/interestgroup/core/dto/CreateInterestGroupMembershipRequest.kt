package com.fancia.backend.shared.interestgroup.core.dto

import jakarta.validation.constraints.NotBlank
import java.util.*

data class CreateInterestGroupMembershipRequest(
    var payload: String,
)
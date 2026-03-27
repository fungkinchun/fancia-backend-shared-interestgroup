package com.fancia.backend.shared.interestgroup.core.dto

import jakarta.validation.constraints.NotBlank

data class UpdateInterestGroupRequest(
    @field:NotBlank(message = "Interest group description is required")
    val description: String,
    val tags: Set<String>
)

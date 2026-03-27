package com.fancia.backend.shared.interestgroup.core.dto

import jakarta.validation.constraints.NotBlank

data class CreateInterestGroupRequest(
    @field:NotBlank(message = "Interest group name is required")
    val name: String,
    @field:NotBlank(message = "Interest group description is required")
    val description: String,
    val tags: Set<String>
)
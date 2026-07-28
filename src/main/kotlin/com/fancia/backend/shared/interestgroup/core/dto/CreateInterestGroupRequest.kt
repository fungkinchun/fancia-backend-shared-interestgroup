package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.common.social.core.dto.LinkItem
import com.fancia.backend.shared.common.tag.core.dto.TagItemRequest
import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.Size

data class CreateInterestGroupRequest(
    @field:NotBlank(message = "Interest group name is required")
    @field:Size(max = 255, message = "Interest group name must be at most 255 characters")
    val name: String,
    @field:NotBlank(message = "Interest group description is required")
    @field:Size(max = 4000, message = "Interest group description must be at most 4000 characters")
    val description: String,
    val tags: Set<@Valid TagItemRequest>,
    @field:Valid
    val links: List<LinkItem> = emptyList(),
)
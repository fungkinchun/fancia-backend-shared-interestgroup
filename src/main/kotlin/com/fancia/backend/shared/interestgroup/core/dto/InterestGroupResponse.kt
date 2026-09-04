package com.fancia.backend.shared.interestgroup.core.dto

import com.fancia.backend.shared.common.core.enums.ResourceVisibility
import com.fancia.backend.shared.common.social.core.dto.LinkResponse
import java.time.LocalDateTime
import java.util.*

data class InterestGroupResponse(
    var id: UUID? = null,
    var name: String = "",
    var slug: String = "",
    var description: String = "",
    var createdBy: UUID? = null,
    var createdAt: LocalDateTime? = null,
    var tags: Set<UUID> = emptySet(),
    var memberCount: Long = 0,
    var links: List<LinkResponse> = emptyList(),
    var visibility: ResourceVisibility = ResourceVisibility.PUBLIC,
    var savedByCurrentUser: Boolean? = null,
)

package com.fancia.backend.shared.interestgroup.core.dto

import java.time.LocalDateTime
import java.util.*

data class InterestGroupResponse(
    val id: UUID? = null,
    var name: String = "",
    var description: String = "",
    var createdBy: UUID,
    var createdAt: LocalDateTime? = null,
    var tags: Set<String>
)
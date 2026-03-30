package com.fancia.backend.shared.interestgroup.core.dto

import java.time.LocalDateTime
import java.util.*

data class InterestGroupResponse(
    var id: UUID? = null,
    var name: String = "",
    var description: String = "",
    var createdBy: UUID? = null,
    var createdAt: LocalDateTime? = null,
    var tags: Set<String>
)
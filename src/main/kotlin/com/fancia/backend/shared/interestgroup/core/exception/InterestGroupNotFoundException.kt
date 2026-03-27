package com.fancia.backend.shared.interestgroup.core.exception

import java.util.*

class InterestGroupNotFoundException(
    val interestGroupId: UUID,
    message: String = "Interest group not found with id: $interestGroupId"
) : Throwable()
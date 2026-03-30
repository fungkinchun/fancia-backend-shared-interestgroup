package com.fancia.backend.shared.interestgroup.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class InterestGroupNotFoundException(
    val interestGroupId: UUID,
    title: String = "Interest group not found",
    message: String = "Interest group not found with id: $interestGroupId",
    errorCode: String = "INTEREST_GROUP_NOT_FOUND"
) : DomainException(title, message, errorCode)
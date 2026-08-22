package com.fancia.backend.shared.interestgroup.core.exception

import com.fancia.backend.shared.common.core.exception.DomainException
import java.util.*

class InterestGroupNotFoundException : DomainException {
    val interestGroupId: UUID?
    val ref: String

    constructor(
        interestGroupId: UUID,
        title: String = "Interest group not found",
        message: String = "Interest group not found with id: $interestGroupId",
        errorCode: String = "INTEREST_GROUP_NOT_FOUND",
    ) : super(title, message, errorCode) {
        this.interestGroupId = interestGroupId
        this.ref = interestGroupId.toString()
    }

    constructor(
        ref: String,
        title: String = "Interest group not found",
        message: String = "Interest group not found with id or slug: $ref",
        errorCode: String = "INTEREST_GROUP_NOT_FOUND",
    ) : super(title, message, errorCode) {
        this.interestGroupId = null
        this.ref = ref
    }
}
package com.fancia.backend.shared.interestgroup.core.exception

class InterestGroupStatusChangeAccessDeniedException(
    message: String = "Only admins can change status (except withdrawal)"
) : Throwable()
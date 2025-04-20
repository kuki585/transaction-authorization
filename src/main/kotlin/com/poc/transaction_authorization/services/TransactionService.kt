/***********************************************
 * @Copyright Ankur Jain
 *
 *  Date    		Author      Comments
 *  20-Apr-2025     Ankur Jain  Initial Draft
 *
 ***********************************************/
package com.poc.transaction_authorization.services

import com.poc.transaction_authorization.dtos.AuthorizationRequestDTO
import com.poc.transaction_authorization.dtos.AuthorizationResponseDTO

/**
 * This interface acts as the template to provide business logic for the
 * addition of Authentication.
 * @author Ankur Jain
 *
 */
interface TransactionService {
    fun authorize(authorizationRequestDTO : AuthorizationRequestDTO) : AuthorizationResponseDTO
}

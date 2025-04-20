package com.poc.transaction_authorization.controllers

import com.poc.transaction_authorization.dtos.AuthorizationRequestDTO
import com.poc.transaction_authorization.kafka.AuthRequestProducer
import com.poc.transaction_authorization.services.TransactionService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transaction")
class TransactionController(
    private val transactionService: TransactionService,
    private val kafkaProducer: AuthRequestProducer
) {

    @PostMapping("/authorize")
    fun authorize(@RequestBody authorizationRequestDTO :
                  AuthorizationRequestDTO
    ): ResponseEntity<String> {
        kafkaProducer.sendAuthorizationRequest(authorizationRequestDTO)
        return ResponseEntity.accepted().
        body("Transaction Authorization request sent.")

    }
}
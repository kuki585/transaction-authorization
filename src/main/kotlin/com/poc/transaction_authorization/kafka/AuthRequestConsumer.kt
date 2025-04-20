package com.poc.transaction_authorization.kafka

import com.poc.transaction_authorization.dtos.AuthorizationRequestDTO
import com.poc.transaction_authorization.dtos.AuthorizationResponseDTO
import com.poc.transaction_authorization.services.TransactionService
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class AuthRequestConsumer(
    private val transactionService: TransactionService,
    private val kafkaTemplate: KafkaTemplate<String, AuthorizationResponseDTO>
) {

    @KafkaListener(topics = ["test-request-topic"], groupId = "test-group")
    fun consume(request: AuthorizationRequestDTO) {
        val response = transactionService.authorize(request)
        kafkaTemplate.send("test-response-topic", response)
    }
}

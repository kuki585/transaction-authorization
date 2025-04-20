package com.poc.transaction_authorization.kafka

import com.poc.transaction_authorization.dtos.AuthorizationRequestDTO
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class AuthRequestProducer(
    private val kafkaTemplate: KafkaTemplate<String, AuthorizationRequestDTO>
) {

    fun sendAuthorizationRequest(request: AuthorizationRequestDTO) {
        kafkaTemplate.send("test-request-topic", request)
    }
}

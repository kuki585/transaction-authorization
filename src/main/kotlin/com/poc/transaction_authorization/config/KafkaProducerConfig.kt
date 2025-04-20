package com.poc.transaction_authorization.config

import com.poc.transaction_authorization.dtos.AuthorizationRequestDTO
import com.poc.transaction_authorization.dtos.AuthorizationResponseDTO
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.core.DefaultKafkaProducerFactory
import org.springframework.kafka.core.ProducerFactory
import org.apache.kafka.clients.producer.ProducerConfig
import org.apache.kafka.common.serialization.StringSerializer
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.kafka.support.serializer.JsonSerializer

@Configuration
class KafkaProducerConfig {

    private val producerProps = mapOf(
        ProducerConfig.BOOTSTRAP_SERVERS_CONFIG to "localhost:9092",
        ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG to StringSerializer::class.java,
        ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG to JsonSerializer::class.java
    )

    @Bean
    fun requestProducerFactory(): ProducerFactory<String, AuthorizationRequestDTO> =
        DefaultKafkaProducerFactory(producerProps)

    @Bean
    fun requestKafkaTemplate(): KafkaTemplate<String, AuthorizationRequestDTO> =
        KafkaTemplate(requestProducerFactory())

    @Bean
    fun responseProducerFactory(): ProducerFactory<String, AuthorizationResponseDTO> =
        DefaultKafkaProducerFactory(producerProps)

    @Bean
    fun responseKafkaTemplate(): KafkaTemplate<String, AuthorizationResponseDTO> =
        KafkaTemplate(responseProducerFactory())
}

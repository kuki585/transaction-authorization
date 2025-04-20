package com.poc.transaction_authorization.config

import com.poc.transaction_authorization.dtos.AuthorizationRequestDTO
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory
import org.springframework.kafka.core.ConsumerFactory
import org.springframework.kafka.core.DefaultKafkaConsumerFactory
import org.apache.kafka.clients.consumer.ConsumerConfig
import org.apache.kafka.common.serialization.StringDeserializer
import org.springframework.kafka.support.serializer.JsonDeserializer


@Configuration
class KafkaConsumerConfig {

    @Bean
    fun consumerFactory(): ConsumerFactory<String, AuthorizationRequestDTO> =
        DefaultKafkaConsumerFactory(
            mapOf(
                ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG to "localhost:9092",
                ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG to StringDeserializer::class.java,
                ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG to JsonDeserializer::class.java,
                JsonDeserializer.TRUSTED_PACKAGES to "*"
            )
        )

    @Bean
    fun kafkaListenerContainerFactory(): ConcurrentKafkaListenerContainerFactory<String, AuthorizationRequestDTO> {
        val factory = ConcurrentKafkaListenerContainerFactory<String, AuthorizationRequestDTO>()
        factory.consumerFactory = consumerFactory()
        return factory
    }
}

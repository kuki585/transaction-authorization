package com.poc.transaction_authorization

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TransactionAuthorizationApplication

fun main(args: Array<String>) {
	runApplication<TransactionAuthorizationApplication>(*args)
}

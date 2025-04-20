This is the transaction authorization solution API which integrates with Kafka as well

This basically helps to authorize the transaction based on the given input.

Step to execute the application.

1. clone the git repo
git clone https://github.com/kuki585/transaction-authorization.git
2. Import into IDE of your choice, I used Intellij 2025.1 
3. Build the project using gradle tool
    Use Java 17, Kotlin 1.95
4. Go to com.poc.transaction_authorization.TransactionAuthorizationApplication
Run as Spring boot application.

Note:
Please import transaction_authorization.postman_collection.json file in postman
and call
POST
localhost:9090/transaction/authorize

{
"stationUuid": "3397d3d4-c67d-4fe8-bea8-5ca83ddf9bdc",
"driverIdentifier": {
"id": "f75b7166-4a2b-477d-9016-264b9552b334"
}
}

If you want you can create drivers using below API

POST
localhost:9090/drivers

{

    "driverName": "John",
    "chargingAllowed": true
}
 
In order to check Kafka integration 
you will have to open a cmd and listen for test-response-topic after firing
localhost:9090/transaction/authorize API

Refer to kafka_windows_setup.md for that

Todo:
Test case writing is pending
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
#1.Below url will open Swagger documentation to refer Rest APIs
#http://localhost:9090/swagger-ui.html

#2.Below URL contains all the APIs with sample data
#https://www.getpostman.com/collections/b55eb1f28ffd59fad282
#Import this url in your postman.

#3.Use below URL to login to H2 console
http://localhost:9090/h2-console/login.do?jsessionid=24bf33546732cf7b0e0698856e192da5

#4.Use below query to check the data in H2
#select * from drivers;
#select * from stations;
#select * from driver_stations;
 

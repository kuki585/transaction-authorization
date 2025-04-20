1. Download Kafka from below official website and choose binary version
https://archive.apache.org/dist/kafka/3.6.1/kafka_2.13-3.6.1.tgz

2. Extract to a location
e.g. C:\kafka

3. Set KAFKA_HOME=C:\kafka and Path = %KAFKA_HOME%\bin

4. Start zookeeper
   %KAFKA_HOME%\bin\windows\zookeeper-server-start.bat %KAFKA_HOME%\config\zookeeper.properties

5. Start Kafka in new terminal
   %KAFKA_HOME%\bin\windows\kafka-server-start.bat %KAFKA_HOME%\config\server.properties

6. Create topic
   %KAFKA_HOME%\bin\windows\kafka-topics.bat --create --topic test-topic --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

7. List topic
   %KAFKA_HOME%\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

8. Start Producer in new terminal
   %KAFKA_HOME%\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test-topic
   -->Type some messages

9. Start Consumer and you will see messages sent by Producer
   %KAFKA_HOME%\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning





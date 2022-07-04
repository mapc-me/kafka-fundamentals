FROM confluentinc/cp-kafka-connect-base:latest

# The plugin location is where the .jar of the connector (kafka-connect-jdbc-X.X.X.jar) is located
ENV PLUGIN_LOCATION=/usr/share/confluent-hub-components/confluentinc-kafka-connect-jdbc/lib/

RUN confluent-hub install --no-prompt confluentinc/kafka-connect-jdbc:latest

COPY mysql-connector-java-8.0.25.jar ${PLUGIN_LOCATION}

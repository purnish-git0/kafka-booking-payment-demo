A Demo for Kafka operations

Kafka is configured using Spring boot configuration

KafkaProducer and consumer are configured

Topics can be created from CLI,then using

ProducerFactory such as ProducerFactory<String, PaymentRequest>

ProducerFactory<String, Booking>

etc.

when REST Endpoints recei es a request for Booking, then KafkaTemplate<String, Booking> etc. derived

from the ProducerFactory is used to publish to the Topic

Listeners are configured using ConsumerFactories, which can read the messages pushed

to topic and can do further processing.

TODO: Generify the ProducerFactory to ProducerFactory<T,V> etc.

and then generify KafkaTemplate to KafkaTemplate<T,V> etc.

TODO 2: Use KafkaStreams to define request response 

streams,

TODO 3: do logging through a log Kafka topic

TODO 4: Implement Design Patterns like SAGA and Outbox Design pattern


and 

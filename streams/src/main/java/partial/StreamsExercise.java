package partial;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.KafkaStreams;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KStreamBuilder;

public class StreamsExercise {

	public static void main(String[] args) throws Exception {

		Properties streamsConfiguration = new Properties();
		// TODO: Give the Streams application a unique name.  The name must be unique in the Kafka cluster

		streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, "broker1:9092");
		streamsConfiguration.put(StreamsConfig.ZOOKEEPER_CONNECT_CONFIG, "zookeeper1:2181");
		streamsConfiguration.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
		    
		// Specify default (de)serializers for record keys and for record values.
		streamsConfiguration.put(StreamsConfig.KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		streamsConfiguration.put(StreamsConfig.VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
		    
		// TODO: Create a KStreamBuilder

		// TODO: Read the input Kafka topic into a KStream instance.

		// TODO: Convert the values to upper case
		    	    
		    	    
		// TODO: Write the uppercased results to a new Kafka topic called "uppercasehamlet".
		    	    

		// TODO: Create a new KafkaStreams object, and start the stream processing
	}

}


package example

import com.typesafe.config.{Config, ConfigFactory}

object Config {
  val producerConfig: Config = ConfigFactory.load().getConfig("akka.kafka.producer")
  val consumerConfig: Config = ConfigFactory.load().getConfig("akka.kafka.consumer")
}

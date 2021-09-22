package com.swetank.utility

import org.apache.spark.sql.SparkSession

object SparkConfig {
  def getSparkSession: SparkSession = {
    SparkSession.builder()
      .config("spark.network.timeout", "800")
      .config("spark.io.compression.codec", "snappy")
      .config("spark.serializer", "org.apache.spark.serializer.kryoSerializer")
      .getOrCreate()
  }

}

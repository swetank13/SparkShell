package com.swetank.constants

import com.swetank.config.SparkConfig
import org.apache.spark.sql.SparkSession

object Constants {
  val spark: SparkSession = SparkConfig.getSparkSession

}

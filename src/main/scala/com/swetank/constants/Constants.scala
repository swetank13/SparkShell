package com.swetank.constants

import org.apache.spark.sql.SparkSession
import com.swetank.utility.SparkConfig

object Constants {
  val spark: SparkSession = SparkConfig.getSparkSession

}

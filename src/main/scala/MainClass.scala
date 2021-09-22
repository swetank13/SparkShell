
import com.swetank.utility.Arguments
import com.swetank.constants.Constants._
import com.swetank.runner.MyFirstProgram

object MainClass {

  def main(args: Array[String]): Unit = {
    System.setProperty("user.timezone", "UTC")
    System.setProperty("hadoop.home.dir", "C:\\winutils")
    val jobArguments = Arguments.getArguments(args)
    val jobType = jobArguments.jobType
    spark.sparkContext.setLogLevel("ERROR")
    jobType match {
      case "My First Job" => MyFirstProgram.runMyFirstJob(jobType)
    }
  }

}

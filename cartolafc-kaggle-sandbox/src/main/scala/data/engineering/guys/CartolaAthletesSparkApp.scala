package data.engineering.guys

import org.apache.spark.sql.SparkSession


object CartolaAthletesSparkApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Spark SQL basic example").getOrCreate()

    val df = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load(args(0))
    df.show()
  }
}

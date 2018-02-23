package data.engineering.guys

import org.apache.spark.sql.SparkSession


object CartolaAthletesSparkApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("Spark SQL basic example").getOrCreate()

    val df = spark.read.format("csv").option("header", "true").option("inferSchema", "true").load("D:\\projects\\cartolafc-kaggle\\data\\2014_atletas.csv")
    df.show()
  }
}

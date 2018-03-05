package data.engineering.guys

import org.apache.spark.sql.SparkSession

object S3FileReadApp {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder().appName("S3 file read app").master("local").getOrCreate()
    spark.sparkContext.hadoopConfiguration.set("fs.s3n.awsAccessKeyId", "")
    spark.sparkContext.hadoopConfiguration.set("fs.s3n.awsSecretAccessKey", "")


    val contents = spark.sparkContext.textFile("s3n://bucket/folder/2014_atletas.csv")
    contents.take(5).foreach(println)
  }
}

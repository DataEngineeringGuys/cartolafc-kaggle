package data.engineering.guys

import org.apache.spark.{SparkConf, SparkContext}


object SparkApp {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("Spark sandbox application")
    val sc = new SparkContext(conf)

    val fileName = args(0)
    val lines = sc.textFile(fileName).cache

    val c = lines.count
    println(s"There are $c lines in $fileName")
  }
}
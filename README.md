# cartolafc-kaggle

# Kaggle repository

- https://www.kaggle.com/schiller/cartolafc/data

# Build

```
$ sbt assembly
$  spark-submit --master "local[*]" --class data.engineering.guys.SparkApp .\target\scala-2.12\cartolafc-kaggle-1.0.0.jar <file>
```
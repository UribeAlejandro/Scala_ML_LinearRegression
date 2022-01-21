import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.regression.LinearRegression

def main(): Unit = {
  val spark = SparkSession.builder().appName("LinearRegression").getOrCreate()

  val path = "data/sample_linear_reg_data.txt"

  val training = spark.read.format("libsvm").load(path)
  training.printSchema()

  val lr = new LinearRegression()
    .setMaxIter(100)
    .setRegParam(0.3)
    .setElasticNetParam(0.8)

  val lrModel = lr.fit(training)

  println(s"Coefficients: ${lrModel.coefficients} Intercept: ${lrModel.intercept}")

  val trainingSummary = lrModel.summary
  println(s"numIterations: ${trainingSummary.totalIterations}")
  println(s"objectiveHistory: [${trainingSummary.objectiveHistory.mkString(",")}]")
  trainingSummary.residuals.show()
  println(s"RMSE: ${trainingSummary.rootMeanSquaredError}")
  println(s"r2: ${trainingSummary.r2}")

  spark.stop()
}
main()
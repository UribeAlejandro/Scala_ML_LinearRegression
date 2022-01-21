# Linear Regression using Spark ML 

## How to run?
Start a Spark Shell session
```shell
user $ spark-shell
```

Run the code, using the :load command and you will get a similar result.

```shell
scala> :load /Scala/Scala_ML_LinearRegression/src/main/scala/Main.scala

val args: Array[String] = Array()
Loading /Scala/Scala_ML_LinearRegression/src/main/scala/Main.scala...
import org.apache.spark.sql.SparkSession
import org.apache.spark.ml.regression.LinearRegression
def main(): Unit
22/01/21 12:00:19 WARN SparkSession$Builder: Using an existing SparkSession; some spark core configurations may not take effect.
22/01/21 12:00:20 WARN LibSVMFileFormat: 'numFeatures' option not specified, determining the number of features by going though the input. If you know the number in advance, please specify it via 'numFeatures' option to avoid the extra scan.
root                                                                            
 |-- label: double (nullable = true)
 |-- features: vector (nullable = true)

Coefficients: [0.0,0.3229251667740594,-0.3438548034562219,1.915601702345841,0.05288058680386255,0.765962720459771,0.0,-0.15105392669186676,-0.21587930360904645,0.2202536918881343] Intercept: 0.15989368442397356
numIterations: 6
objectiveHistory: [0.49999999999999994,0.4967620357443381,0.49363616643404634,0.4936351537897608,0.4936351214177871,0.49363512062528014,0.4936351206216114]
+--------------------+
|           residuals|
+--------------------+
|  -9.889232683103197|
|  0.5533794340053553|
|  -5.204019455758822|
| -20.566686715507508|
|    -9.4497405180564|
|  -6.909112502719487|
|  -10.00431602969873|
|  2.0623978070504845|
|  3.1117508432954772|
|  -15.89360822941938|
|  -5.036284254673026|
|  6.4832158769943335|
|  12.429497299109002|
|  -20.32003219007654|
|    -2.0049838218725|
| -17.867901734183793|
|   7.646455887420495|
| -2.2653482182417406|
|-0.10308920436195645|
|  -1.380034070385301|
+--------------------+
only showing top 20 rows

RMSE: 10.189077167598473
r2: 0.022861466913958406
```
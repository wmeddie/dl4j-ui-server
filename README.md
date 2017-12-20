# dl4j-ui-server

An awesome Scala-based DeepLearning4J project.

## Building

You can generate an uberjar with `sbt assembly`

## Training

Use spark-submit (Local or Cluster) to train the model.

    $SPARK_HOME/bin/spark-submit \
      --master 'local[*]' \
      --class io.skymind.dl4juiserver.Train \
      target/scala-2.10/dl4juiserver-assembly-1.0.jar \
      --input hdfs:/data/trainInput \ 
      --output output.model \ 
      --epoch 5

## Evaluation

    $SPARK_HOME/bin/spark-submit \
      --master 'local[*]' \
      --class io.skymind.dl4juiserver.Evaluate \
      target/scala-2.10/dl4juiserver-assembly-1.0.jar \
      --input hdfs:/data/trainInput \ 
      --model output.model
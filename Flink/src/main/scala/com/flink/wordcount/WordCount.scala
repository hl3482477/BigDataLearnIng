package com.flink.wordcount


import org.apache.flink.api.scala.{DataSet, ExecutionEnvironment}

object WordCount {
  def main(args: Array[String]): Unit = {
    // 创建执行环境
    val env = ExecutionEnvironment.getExecutionEnvironment

    val inputPath = "";

   val inputDs:DataSet[String] = env.readTextFile(inputPath);


  }
}

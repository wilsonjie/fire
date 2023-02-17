/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.zto.fire.spark

/**
  * Structured Streaming通用父类
  * Created by ChengLong on 2019-03-11.
  */
trait BaseStructuredStreaming extends AbstractStructuredStreaming {

  /**
   * 初始化引擎上下文，如SparkSession、StreamExecutionEnvironment等
   * 可根据实际情况，将配置参数放到同名的配置文件中进行差异化的初始化
   */
  def main(args: Array[String]): Unit = {
    this.init(null, args)
  }
}

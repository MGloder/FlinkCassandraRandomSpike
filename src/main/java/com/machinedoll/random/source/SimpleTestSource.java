package com.machinedoll.random.source;

import com.machinedoll.random.entity.TestData;
import org.apache.flink.streaming.api.functions.source.RichSourceFunction;

public class SimpleTestSource extends RichSourceFunction<TestData> {
  private Boolean isRunning = true;

  @Override
  public void run(SourceContext<TestData> ctx) throws Exception {
    Long startId = 1L;
    int size = 10000;


    while (isRunning) {
      for (int i = 0; i < size; i++) {
        ctx.collect(new TestData(startId, "sensor-" + startId.toString(), System.currentTimeMillis()));
        startId += 1;
      }
    }
  }

  @Override
  public void cancel() {
    isRunning = false;
  }
}

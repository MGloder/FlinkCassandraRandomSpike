package com.machinedoll.random.source;

import com.machinedoll.random.entity.TestData;
import org.apache.flink.streaming.api.functions.source.RichParallelSourceFunction;

import java.util.Calendar;

public class SimpleTestSource extends RichParallelSourceFunction<TestData> {
  private Boolean isRunning = true;

  @Override
  public void run(SourceContext<TestData> ctx) throws Exception {
    Long startId = 1L;
    Calendar calendar = Calendar.getInstance();
    int size = 100;


    while (isRunning) {
      for (int i = 0; i < size; i++) {
        ctx.collect(new TestData(startId, "sensor-" + startId.toString(), calendar.getTimeInMillis()));
        startId += 1;
      }
      Thread.sleep(2000);
    }
  }

  @Override
  public void cancel() {
    isRunning = false;
  }
}

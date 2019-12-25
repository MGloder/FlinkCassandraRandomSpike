package com.machinedoll.random.entity;

public class TestData {
  private Long id;
  private String sensor;
  private Long timestamp;

  public TestData(Long id, String sensor, Long timestamp) {
    this.id = id;
    this.sensor = sensor;
    this.timestamp = timestamp;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSensor() {
    return sensor;
  }

  public void setSensor(String sensor) {
    this.sensor = sensor;
  }

  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }
}

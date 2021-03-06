package com.machinedoll.random.entity;

import com.datastax.driver.mapping.annotations.Column;
import com.datastax.driver.mapping.annotations.Table;

@Table(keyspace = "sipke", name = "testdata")
public class TestData {

  @Column(name = "id")
  private Long id;

  @Column(name = "sensor")
  private String sensor;

  @Column(name = "timestamp")
  private Long timestamp;

  public TestData() {
  }

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

  @Override
  public String toString() {
    return "TestData{" +
        "id=" + id +
        ", sensor='" + sensor + '\'' +
        ", timestamp=" + timestamp +
        '}';
  }
}

package com.ruoyi.pvadmin.domain.model;

import com.influxdb.annotations.Column;
import com.influxdb.annotations.Measurement;

import java.time.Instant;

/**
 * @author fanxinfu
 */
@Measurement(name = "HuaKong")
public class WritePoint {

  @Column(tag = true)
  private String tag;
  @Column
  private Double value;
  @Column(timestamp = true)
  private Instant time;

  public WritePoint(String tag, Double value, Instant time) {
    this.tag = tag;
    this.value = value;
    this.time = time;
  }
}

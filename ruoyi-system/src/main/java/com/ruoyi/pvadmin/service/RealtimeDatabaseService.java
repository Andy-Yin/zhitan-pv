package com.ruoyi.pvadmin.service;

import com.ruoyi.pvadmin.influxdb.GroupTimeType;
import com.ruoyi.pvadmin.domain.enums.QueryType;
import com.ruoyi.pvadmin.domain.model.TagValue;

import java.util.Date;
import java.util.List;

/**
 * @author 实时数据库访问接口.
 */
public interface RealtimeDatabaseService {

  /**
   * 获取单个测点的实时数据.
   *
   * @param tagCode 测点编号
   * @return 测试实时数据
   */
  TagValue retrieve(String tagCode);

  /**
   * 获取批量测点的实时数据.
   *
   * @param tagCodes 测点编码集合
   * @return 实时数据集合
   */
  List<TagValue> retrieve(List<String> tagCodes);

  /**
   * 获取测点的历史时刻值.
   *
   * @param tagCode  测点编号
   * @param dataTime 历史时刻
   * @return 测点历史时刻值
   */
  TagValue retrieve(String tagCode, Date dataTime);

  /**
   * 获取批量测点的历史时刻值.
   *
   * @param tagCodes 测点编号集合
   * @param dataTime 历史时刻
   * @return 测试历史时刻数据集合
   */
  List<TagValue> retrieve(List<String> tagCodes, Date dataTime);

  /**
   * 获取一个小时内所有数据
   *
   * @param tagCodes 测点编号
   * @param dataTime 开始时间
   * @return 测试历史时刻数据集合
   */
  List<TagValue> queryOneHour(List<String> tagCodes, Date dataTime);

  /**
   * 获取一段时间内测点的历史数据.
   *
   * @param tagCode    测点编号
   * @param beginTime  开始时间
   * @param endTime    结束时间
   * @param pointCount 测点得到的数据个数
   * @return 测点历史数据
   */
  List<TagValue> retrieve(String tagCode, Date beginTime, Date endTime, int pointCount);

  List<TagValue> retrieve(String tagCode, Date beginTime, Date endTime, long interval);

  /**
   * 获取一段时间内批量测点的历史数据.
   *
   * @param tagCodes   测点编号集合
   * @param beginTime  开始时间
   * @param endTime    结束时间
   * @param pointCount 每个测点得到的数据个数
   * @return 测点历史数据
   */
  List<TagValue> retrieve(List<String> tagCodes, Date beginTime, Date endTime, int pointCount);

  List<TagValue> retrieve(List<String> tagCodes, Date beginTime, Date endTime, long interval);

  /**
   * 获取测点在一段时间内的统计数据.
   *
   * @param tagCode   测点编号
   * @param beginTime 开始时间
   * @param endTime   结束时间
   * @param queryType 统计类型
   * @return 测点统计结果
   */
  TagValue statistics(String tagCode, Date beginTime, Date endTime, QueryType queryType);

  /**
   * 获取测点在一段时间内的统计数据.
   *
   * @param tagCodes  测点编号集合
   * @param beginTime 开始时间
   * @param endTime   结束时间
   * @param queryType 统计类型
   * @return 测点统计结果
   */
  List<TagValue> statistics(List<String> tagCodes, Date beginTime, Date endTime,
                            QueryType queryType);

  /**
   * 获取测点在一段时间内按照某一时间周期的统计数据.
   *
   * @param tagCodes  测点编号集合
   * @param beginTime 开始时间
   * @param endTime   结束时间,包括结束时间
   * @param queryType 统计类型
   * @param timeType  分组时间周期（分、时、天）
   * @return 测点统计结果
   */
  List<TagValue> statistics(List<String> tagCodes, Date beginTime, Date endTime,
                            QueryType queryType, GroupTimeType timeType);

  /**
   * 存储测点的实时数据.
   *
   * @param tagValues 测点实时数据
   */
  void storeData(List<TagValue> tagValues);

  /**
   * 插入测点历史时刻数据.
   *
   * @param tagValues 测点历史时刻数据
   */
  void insertData(List<TagValue> tagValues);


  /**
   * 获取测点在一段时间内的统计数据.
   *
   * @param tagCode   测点编号
   * @param beginTime 开始时间
   * @param endTime   结束时间
   * @param queryType 统计类型
   * @return 测点统计结果
   */
  TagValue statistics(String tagCode, String beginTime, String endTime, QueryType queryType);

  /**
   * 获取测点在一段时间内按照某一时间周期的统计数据.
   *
   * @param tagCodes  测点编号集合
   * @param beginTime 开始时间
   * @param endTime   结束时间,包括结束时间
   * @param queryType 统计类型
   * @param timeType  分组时间周期（分、时、天）
   * @return 测点统计结果
   */
  List<TagValue> statistics(String tagCodes, String beginTime, String endTime, QueryType queryType, GroupTimeType timeType);

  /**
   * 获取一段时间内批量测点的历史数据.
   *
   * @param tagCodes   测点编号集合
   * @param beginTime  开始时间
   * @param endTime    结束时间
   * @param pointCount 每个测点得到的数据个数
   * @return 测点历史数据
   */
  List<TagValue> retrieve(String tagCodes, String beginTime, String endTime, int pointCount);

  /**
   * 获取测点在一段时间内的统计数据.
   *
   * @param tagCodes  测点编号集合
   * @param beginTime 开始时间
   * @param endTime   结束时间
   * @param queryType 统计类型
   * @return 测点统计结果
   */
  List<TagValue> listStatistics(String tagCodes, String beginTime, String endTime, QueryType queryType);

  /**
   * 获取一段时间内批量测点的历史数据.
   *
   * @param tagCodeList 测点编号集合
   * @param beginTime   开始时间
   * @param endTime     结束时间
   * @param pointCount  每个测点得到的数据个数
   * @return 测点历史数据
   */
  List<TagValue> retrieve(List<String> tagCodeList, Long beginTime, Long endTime, int pointCount);

  /**
   * 获取一个小时内所有数据
   *
   * @param tagCodes 测点编号
   * @param dataTime 开始时间
   * @return 测试历史时刻数据集合
   */
  List<TagValue> queryOneHour(String tagCodes, Long dataTime);
}

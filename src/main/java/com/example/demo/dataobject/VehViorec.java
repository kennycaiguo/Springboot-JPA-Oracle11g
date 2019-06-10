package com.example.demo.dataobject;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

/**
 * @author ruanjiayu
 * @dateTime 2019/6/6 16:03
 */

@Entity
@Getter
@Setter
@Table(name = "VEH_VIOREC")
public class VehViorec implements Serializable{


    private static final long serialVersionUID = 285960064635501308L;
    /**
     * 序号
     */
    @Id
    private String xlh;

    /**
     * 号牌号码
     */
    private String hphm;

    /**
     * 号牌种类
     */
    private String hpzl;

    /**
     * 车身颜色
     */
    private String csys;

    /**
     * 违法时间
     */
    private Date wfsj;

    /**
     * 车道编号
     */
    private String cdbh;

    /**
     * 方向编号
     */
    private String fxbh;

    /**
     * 车辆类型
     */
    private String cllx;

    /**
     * 违法行为
     */
    private String wfxw;

    /**
     * 违法行为2
     */
    private String wfxw2;

    /**
     * 违法内容
     */
    private String wfnr;

    /**
     * 违法内容2
     */
    private String wfnr2;

    /**
     * 违法地点
     */
    private String wfdd;

    /**
     * 地点编号
     */
    private String ddbh;

    /**
     * 设备编号
     */
    private String sbbh;

    /**
     * 桩米数
     */
    private String zms;

    /**
     * 数据来源  H 电子警察
     F 智能卡口
     Z 视频设备
     E 6F雷达
     G 移动电子警察
     D 数码相机

     */
    private String sjly;

    /**
     * 图片状态  0-已上传 1－未上传 2－上传超过3次仍未成功
     */
    private String tpzt;

    /**
     * 号牌颜色
     */
    private String hpys;

    /**
     * 特写图片
     */
    private String cltp1;

    /**
     * 全景图片
     */
    private String cltp2;

    /**
     * 号牌图片
     */
    private String cltp3;

    /**
     * 车辆图片4
     */
    private String cltp4;

    /**
     * 车辆图片5
     */
    private String cltp5;

    /**
     * 车辆图片6
     */
    private String cltp6;

    /**
     * 车辆图片7
     */
    private String cltp7;

    /**
     * 大车限速 km/h
     */
    private Integer dcxs;

    /**
     * 小车限速 km/h
     */
    private Integer xcxs;

    /**
     * 车辆速度
     */
    private Integer clsd;

    /**
     * 证据存储方式 0-数据库 1-文件
     */
    private String zjccfs;

    /**
     * 车辆品牌
     */
    private String clpp;

    /**
     * "处理方式 0未处理（默认值）
     1 正常刄除 3-套牌 4-假牌 5-特殊车辆 6"""

     */
    private String clfs;

    /**
     * 违法时间2(区间测速驶出时间）
     */
    private Date wfsj2;

    /**
     * 违法地点2(区间测速驶出路口)
     */
    private String wfdd2;

    /**
     * 地点编号2(区间测速驶出路口编号)
     */
    private String ddbh2;

    /**
     * 人工校对的状态
     */
    private String jdzt;

    /**
     * 数据处理状态(0表示没处理 1表示处理过)
     */
    private String mark;

}

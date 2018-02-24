package com.example.demo.entity.ProjectBean;

import org.w3c.dom.DOMImplementation;

/**
 * All rights Reserved, Designed By hxjd
 *
 * @类名: ${CLASS_NAME}
 * @包名: com.example.demo.entity.ProjectBean
 * @描述: ${TODO}(用一句话描述该文件做什么)
 * @所属: 华夏九鼎
 * @日期: 2017/9/14 11:51
 * @版本: V1.0
 * @创建人：马东
 * @修改人：马东
 * @版权: 2017 hxjd Inc. All rights reserved.
 * 注意：本内容仅限于华夏九鼎内部传阅，禁止外泄以及用于其他的商业目的
 */
public class ProjectBean {
    private String projectCode;
    private String deviceId;
    private String sourceId;
    private String deviceCode;
    private String recordTime;
    private Double temperature;
    private Double humidity;
    private Double pm2p5;
    private Double pm10;
    private Double noise;
    private Double windSpeed;
    private Double windDirection;

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getDeviceCode() {
        return deviceCode;
    }

    public void setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
    }

    public String getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPm2p5() {
        return pm2p5;
    }

    public void setPm2p5(Double pm2p5) {
        this.pm2p5 = pm2p5;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getNoise() {
        return noise;
    }

    public void setNoise(Double noise) {
        this.noise = noise;
    }

    public Double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Double getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(Double windDirection) {
        this.windDirection = windDirection;
    }
}

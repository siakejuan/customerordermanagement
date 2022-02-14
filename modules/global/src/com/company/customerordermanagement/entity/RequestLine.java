package com.company.customerordermanagement.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "CUSTOMERORDERMANAGEMENT_REQUEST_LINE")
@Entity(name = "customerordermanagement_RequestLine")
public class RequestLine extends StandardEntity {
    private static final long serialVersionUID = -3841772968384188006L;

    @Column(name = "CONTAINER_NUMBER")
    private String containerNumber;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTAINER_ID")
    private Container container;

    @Column(name = "PLUG_ON")
    private Boolean plugOn;

    @Column(name = "PLUG_OFF")
    private Boolean plugOff;

    @Column(name = "REMARKS")
    private String remarks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REQUEST_ID")
    private Request request;

    @Column(name = "LOT_NUMBER")
    private String lotNumber;

    @Column(name = "CABLING_ON_VESSEL")
    private String cablingOnVessel;

    @Column(name = "FOUR_CORE")
    private String fourCore;

    @Column(name = "TEMPERATURE_READING")
    private Integer temperatureReading;

    @Column(name = "TEMPERATURE_START")
    private Integer temperatureStart;

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public Integer getTemperatureStart() {
        return temperatureStart;
    }

    public void setTemperatureStart(Integer temperatureStart) {
        this.temperatureStart = temperatureStart;
    }

    public Integer getTemperatureReading() {
        return temperatureReading;
    }

    public void setTemperatureReading(Integer temperatureReading) {
        this.temperatureReading = temperatureReading;
    }

    public String getFourCore() {
        return fourCore;
    }

    public void setFourCore(String fourCore) {
        this.fourCore = fourCore;
    }

    public String getCablingOnVessel() {
        return cablingOnVessel;
    }

    public void setCablingOnVessel(String cablingOnVessel) {
        this.cablingOnVessel = cablingOnVessel;
    }

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public void setPlugOff(Boolean plugOff) {
        this.plugOff = plugOff;
    }

    public Boolean getPlugOff() {
        return plugOff;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Boolean getPlugOn() {
        return plugOn;
    }

    public void setPlugOn(Boolean plugOn) {
        this.plugOn = plugOn;
    }

}
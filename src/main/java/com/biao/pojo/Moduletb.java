package com.biao.pojo;


import java.util.List;

public class Moduletb {

  private long moduleId;
  private long parentId;
  private String moduleName;
  private long moduleWeight;
  private String moduleUrl;
  private java.sql.Timestamp moduleCreateTime;
  private java.sql.Timestamp moduleLastUpdateTime;
  private List<Moduletb> Cherch;

  @Override
  public String toString() {
    return "Moduletb{" +
            "moduleId=" + moduleId +
            ", parentId=" + parentId +
            ", moduleName='" + moduleName + '\'' +
            ", moduleWeight=" + moduleWeight +
            ", moduleUrl='" + moduleUrl + '\'' +
            ", moduleCreateTime=" + moduleCreateTime +
            ", moduleLastUpdateTime=" + moduleLastUpdateTime +
            ", Cherch=" + Cherch +
            '}';
  }

  public long getModuleId() {
    return moduleId;
  }

  public void setModuleId(long moduleId) {
    this.moduleId = moduleId;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }


  public long getModuleWeight() {
    return moduleWeight;
  }

  public void setModuleWeight(long moduleWeight) {
    this.moduleWeight = moduleWeight;
  }


  public String getModuleUrl() {
    return moduleUrl;
  }

  public void setModuleUrl(String moduleUrl) {
    this.moduleUrl = moduleUrl;
  }


  public java.sql.Timestamp getModuleCreateTime() {
    return moduleCreateTime;
  }

  public void setModuleCreateTime(java.sql.Timestamp moduleCreateTime) {
    this.moduleCreateTime = moduleCreateTime;
  }


  public java.sql.Timestamp getModuleLastUpdateTime() {
    return moduleLastUpdateTime;
  }

  public void setModuleLastUpdateTime(java.sql.Timestamp moduleLastUpdateTime) {
    this.moduleLastUpdateTime = moduleLastUpdateTime;
  }

  public List<Moduletb> getCherch() {
    return Cherch;
  }

  public void setCherch(List<Moduletb> cherch) {
    Cherch = cherch;
  }
}

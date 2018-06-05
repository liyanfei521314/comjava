package com.biao.pojo;


public class Permissiontb {

  private long permissionId;
  private String permissionValue;
  private String permissionModule;
  private String permissionName;
  private java.sql.Timestamp permissionLastUpdateTime;

  @Override
  public String toString() {
    return "Permissiontb{" +
            "permissionId=" + permissionId +
            ", permissionValue='" + permissionValue + '\'' +
            ", permissionModule='" + permissionModule + '\'' +
            ", permissionName='" + permissionName + '\'' +
            ", permissionLastUpdateTime=" + permissionLastUpdateTime +
            '}';
  }

  public long getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(long permissionId) {
    this.permissionId = permissionId;
  }


  public String getPermissionValue() {
    return permissionValue;
  }

  public void setPermissionValue(String permissionValue) {
    this.permissionValue = permissionValue;
  }


  public String getPermissionModule() {
    return permissionModule;
  }

  public void setPermissionModule(String permissionModule) {
    this.permissionModule = permissionModule;
  }


  public String getPermissionName() {
    return permissionName;
  }

  public void setPermissionName(String permissionName) {
    this.permissionName = permissionName;
  }


  public java.sql.Timestamp getPermissionLastUpdateTime() {
    return permissionLastUpdateTime;
  }

  public void setPermissionLastUpdateTime(java.sql.Timestamp permissionLastUpdateTime) {
    this.permissionLastUpdateTime = permissionLastUpdateTime;
  }

}

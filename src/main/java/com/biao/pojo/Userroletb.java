package com.biao.pojo;


public class Userroletb {

  private long userRoleId;
  private long userId;
  private long roleId;
  private java.sql.Timestamp userRoleLastUpdateTime;

  @Override
  public String toString() {
    return "Userroletb{" +
            "userRoleId=" + userRoleId +
            ", userId=" + userId +
            ", roleId=" + roleId +
            ", userRoleLastUpdateTime=" + userRoleLastUpdateTime +
            '}';
  }

  public long getUserRoleId() {
    return userRoleId;
  }

  public void setUserRoleId(long userRoleId) {
    this.userRoleId = userRoleId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public java.sql.Timestamp getUserRoleLastUpdateTime() {
    return userRoleLastUpdateTime;
  }

  public void setUserRoleLastUpdateTime(java.sql.Timestamp userRoleLastUpdateTime) {
    this.userRoleLastUpdateTime = userRoleLastUpdateTime;
  }

}

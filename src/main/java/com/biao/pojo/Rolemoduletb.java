package com.biao.pojo;


public class Rolemoduletb {

  private long roleModuleId;
  private long roleId;
  private long moduleId;
  private java.sql.Timestamp roleModuleLastUpdateTime;

  @Override
  public String toString() {
    return "Rolemoduletb{" +
            "roleModuleId=" + roleModuleId +
            ", roleId=" + roleId +
            ", moduleId=" + moduleId +
            ", roleModuleLastUpdateTime=" + roleModuleLastUpdateTime +
            '}';
  }

  public long getRoleModuleId() {
    return roleModuleId;
  }

  public void setRoleModuleId(long roleModuleId) {
    this.roleModuleId = roleModuleId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getModuleId() {
    return moduleId;
  }

  public void setModuleId(long moduleId) {
    this.moduleId = moduleId;
  }


  public java.sql.Timestamp getRoleModuleLastUpdateTime() {
    return roleModuleLastUpdateTime;
  }

  public void setRoleModuleLastUpdateTime(java.sql.Timestamp roleModuleLastUpdateTime) {
    this.roleModuleLastUpdateTime = roleModuleLastUpdateTime;
  }

}

package com.biao.pojo;


public class Roletb {

  private long roleId;
  private String roleName;
  private String roleExplain;
  private java.sql.Timestamp roleCreateTime;
  private java.sql.Timestamp roleLastUpdateTime;

  @Override
  public String toString() {
    return "Roletb{" +
            "roleId=" + roleId +
            ", roleName='" + roleName + '\'' +
            ", roleExplain='" + roleExplain + '\'' +
            ", roleCreateTime=" + roleCreateTime +
            ", roleLastUpdateTime=" + roleLastUpdateTime +
            '}';
  }

  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }


  public String getRoleExplain() {
    return roleExplain;
  }

  public void setRoleExplain(String roleExplain) {
    this.roleExplain = roleExplain;
  }


  public java.sql.Timestamp getRoleCreateTime() {
    return roleCreateTime;
  }

  public void setRoleCreateTime(java.sql.Timestamp roleCreateTime) {
    this.roleCreateTime = roleCreateTime;
  }


  public java.sql.Timestamp getRoleLastUpdateTime() {
    return roleLastUpdateTime;
  }

  public void setRoleLastUpdateTime(java.sql.Timestamp roleLastUpdateTime) {
    this.roleLastUpdateTime = roleLastUpdateTime;
  }

}

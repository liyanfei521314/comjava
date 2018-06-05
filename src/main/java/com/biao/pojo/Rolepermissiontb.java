package com.biao.pojo;


public class Rolepermissiontb {

  private long rolePermissionId;
  private long roleId;
  private long permissionId;
  private java.sql.Timestamp rolePermissionLastUpdateTime;

  @Override
  public String toString() {
    return "Rolepermissiontb{" +
            "rolePermissionId=" + rolePermissionId +
            ", roleId=" + roleId +
            ", permissionId=" + permissionId +
            ", rolePermissionLastUpdateTime=" + rolePermissionLastUpdateTime +
            '}';
  }

  public long getRolePermissionId() {
    return rolePermissionId;
  }

  public void setRolePermissionId(long rolePermissionId) {
    this.rolePermissionId = rolePermissionId;
  }


  public long getRoleId() {
    return roleId;
  }

  public void setRoleId(long roleId) {
    this.roleId = roleId;
  }


  public long getPermissionId() {
    return permissionId;
  }

  public void setPermissionId(long permissionId) {
    this.permissionId = permissionId;
  }


  public java.sql.Timestamp getRolePermissionLastUpdateTime() {
    return rolePermissionLastUpdateTime;
  }

  public void setRolePermissionLastUpdateTime(java.sql.Timestamp rolePermissionLastUpdateTime) {
    this.rolePermissionLastUpdateTime = rolePermissionLastUpdateTime;
  }

}

package com.biao.pojo;


public class Usertb {

  private long userId;
  private String userName;
  private String userPassWord;
  private long userIsLockout;
  private java.sql.Timestamp userUpdateTime;
  private java.sql.Timestamp userCreateTime;
  private java.sql.Timestamp userLastLoginTime;
  private String userLastLoginIp;
  private long userPassWrongCout;
  private java.sql.Timestamp userLockoutTime;
  private String userEmail;
  private String userTelephone;

  @Override
  public String toString() {
    return "Usertb{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userPassWord='" + userPassWord + '\'' +
            ", userIsLockout=" + userIsLockout +
            ", userUpdateTime=" + userUpdateTime +
            ", userCreateTime=" + userCreateTime +
            ", userLastLoginTime=" + userLastLoginTime +
            ", userLastLoginIp='" + userLastLoginIp + '\'' +
            ", userPassWrongCout=" + userPassWrongCout +
            ", userLockoutTime=" + userLockoutTime +
            ", userEmail='" + userEmail + '\'' +
            ", userTelephone='" + userTelephone + '\'' +
            '}';
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserPassWord() {
    return userPassWord;
  }

  public void setUserPassWord(String userPassWord) {
    this.userPassWord = userPassWord;
  }


  public long getUserIsLockout() {
    return userIsLockout;
  }

  public void setUserIsLockout(long userIsLockout) {
    this.userIsLockout = userIsLockout;
  }


  public java.sql.Timestamp getUserUpdateTime() {
    return userUpdateTime;
  }

  public void setUserUpdateTime(java.sql.Timestamp userUpdateTime) {
    this.userUpdateTime = userUpdateTime;
  }


  public java.sql.Timestamp getUserCreateTime() {
    return userCreateTime;
  }

  public void setUserCreateTime(java.sql.Timestamp userCreateTime) {
    this.userCreateTime = userCreateTime;
  }


  public java.sql.Timestamp getUserLastLoginTime() {
    return userLastLoginTime;
  }

  public void setUserLastLoginTime(java.sql.Timestamp userLastLoginTime) {
    this.userLastLoginTime = userLastLoginTime;
  }


  public String getUserLastLoginIp() {
    return userLastLoginIp;
  }

  public void setUserLastLoginIp(String userLastLoginIp) {
    this.userLastLoginIp = userLastLoginIp;
  }


  public long getUserPassWrongCout() {
    return userPassWrongCout;
  }

  public void setUserPassWrongCout(long userPassWrongCout) {
    this.userPassWrongCout = userPassWrongCout;
  }


  public java.sql.Timestamp getUserLockoutTime() {
    return userLockoutTime;
  }

  public void setUserLockoutTime(java.sql.Timestamp userLockoutTime) {
    this.userLockoutTime = userLockoutTime;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getUserTelephone() {
    return userTelephone;
  }

  public void setUserTelephone(String userTelephone) {
    this.userTelephone = userTelephone;
  }

}

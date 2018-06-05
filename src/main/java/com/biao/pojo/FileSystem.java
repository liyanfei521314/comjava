package com.biao.pojo;


public class FileSystem {

  private long idfile_System;
  private String file_System_OldName;
  private String file_System_NewName;
  private String file_System_Type;
  private String file_System_UploadDate;
  private String file_System_Path;

  @Override
  public String toString() {
    return "FileSystem{" +
            "idfile_System=" + idfile_System +
            ", file_System_OldName='" + file_System_OldName + '\'' +
            ", file_System_NewName='" + file_System_NewName + '\'' +
            ", file_System_Type='" + file_System_Type + '\'' +
            ", file_System_UploadDate='" + file_System_UploadDate + '\'' +
            ", file_System_Path='" + file_System_Path + '\'' +
            '}';
  }

  public long getIdfile_System() {
    return idfile_System;
  }

  public void setIdfile_System(long idfile_System) {
    this.idfile_System = idfile_System;
  }


  public String getFile_System_OldName() {
    return file_System_OldName;
  }

  public void setFile_System_OldName(String file_System_OldName) {
    this.file_System_OldName = file_System_OldName;
  }


  public String getFile_System_NewName() {
    return file_System_NewName;
  }

  public void setFile_System_NewName(String file_System_NewName) {
    this.file_System_NewName = file_System_NewName;
  }


  public String getFile_System_Type() {
    return file_System_Type;
  }

  public void setFile_System_Type(String file_System_Type) {
    this.file_System_Type = file_System_Type;
  }


  public String getFile_System_UploadDate() {
    return file_System_UploadDate;
  }

  public void setFile_System_UploadDate(String file_System_UploadDate) {
    this.file_System_UploadDate = file_System_UploadDate;
  }


  public String getFile_System_Path() {
    return file_System_Path;
  }

  public void setFile_System_Path(String file_System_Path) {
    this.file_System_Path = file_System_Path;
  }

}

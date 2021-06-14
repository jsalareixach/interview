/*
 * Copyright 2021 StreamSets Inc.
 */

package com.streamsets.offset.manager;

public class FileOffset {
  private int pointer;
  private FileStatus fileStatus;

  FileOffset() {
    this.pointer = 0;
    this.fileStatus = FileStatus.PENDING;
  }

  public int getPointer() {
    return pointer;
  }

  public void setPointer(int pointer) {
    this.pointer = pointer;
  }

  public FileStatus getFileStatus() {
    return fileStatus;
  }

  public void setFileStatus(FileStatus fileStatus) {
    this.fileStatus = fileStatus;
  }
}
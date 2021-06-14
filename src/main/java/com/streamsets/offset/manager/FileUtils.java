package com.streamsets.offset.manager;

public class FileUtils {

  public boolean isHalfFile () {
    return true;
  }

  public boolean fileFinished () {
    return true;
  }

  public void someCode() { }

  /*
   * Reads from Amazon S3 source and returns the new offset
   */
  public FileOffset readFile(FileOffset fileOffset) {
    someCode();

    // if condition1 is met offset is set to the new offset
    if (isHalfFile()) {
      fileOffset.setPointer(5);
    }
    someCode();

    // if file is finished, offset is set to Integer.MAX_VALUE
    if (fileFinished()) {
      fileOffset.setPointer(Integer.MAX_VALUE);
    }
    return fileOffset;
  }
}

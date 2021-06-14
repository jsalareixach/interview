package com.streamsets.offset.manager;

public class FileReader {

  private FileOffset fileOffset;
  private final FileUtils fileUtils;

  public FileReader(FileOffset fileOffset, FileUtils fileUtils) {
    this.fileOffset = fileOffset;
    this.fileUtils = fileUtils;
  }

  /**
   * Reads a file, updates the fileOffset accordingly, and returns the number of positions the pointer advanced
   * - If the pointer has advanced (new pointer > initial pointer) then update the status to UPDATED/FINISHED
   *
   * @return the number of positions advanced
   */
  public int read() {
    // initial offset
    fileOffset = new FileOffset();
    FileOffset initialOffset = fileOffset;

    // read from file and return new offset
    FileOffset newOffset = fileUtils.readFile(fileOffset);

    // if the returned offset is newer than the old one, update offset map
    if (newOffset.getPointer() > initialOffset.getPointer()) {
      if (newOffset.getPointer() < Integer.MAX_VALUE) {
        newOffset.setFileStatus(FileStatus.IN_PROGRESS);
      } else {
        newOffset.setFileStatus(FileStatus.FINISHED);
      }
      int read = newOffset.getPointer() - initialOffset.getPointer();
    }
    return 0;
  }

  public FileOffset getFileOffset() {
    return fileOffset;
  }
}
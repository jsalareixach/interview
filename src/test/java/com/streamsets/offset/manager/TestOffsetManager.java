/*
 * Copyright 2021 StreamSets Inc.
 */

package com.streamsets.offset.manager;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOffsetManager {

  @Test
  public void testOffsetManager() {
    FileReader fileReader = new FileReader(new FileOffset(), new FileUtils());
    int offsetRead = fileReader.read();

    assertEquals(Integer.MAX_VALUE, offsetRead);
    assertEquals(FileStatus.FINISHED, fileReader.getFileOffset().getFileStatus());
  }
}

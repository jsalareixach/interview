/*
 * Copyright (c) 2021 StreamSets Inc.
 */

package com.streamsets.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCustomLinkedList {

  private CustomLinkedList<Integer> customList;

  @BeforeEach
  public void setUp() {
    customList = new CustomLinkedList<>();
  }

  @Test
  public void testAdd() {
    customList.add(5);
    customList.add(4);
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
  }

  @Test
  public void testAddAtIndex() {
    customList.add(5);
    customList.add(4);
    customList.add(0, 2);
    Assert.assertEquals(Integer.valueOf(2), customList.get(0));
    Assert.assertEquals(Integer.valueOf(5), customList.get(1));
    Assert.assertEquals(Integer.valueOf(4), customList.get(2));
  }

  @Test
  public void testRemove() {
    customList.add(5);
    customList.add(4);
    customList.add(1);
    Assert.assertEquals(3, customList.size());
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    Assert.assertEquals(Integer.valueOf(1), customList.get(2));

    customList.remove(1);
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(1), customList.get(1));
  }

  @Test
  public void testSize() {
    customList.add(4);
    customList.add(20);
    Assert.assertEquals(2, customList.size());
  }

  @Test
  public void testIsEmpty() {
    Assert.assertTrue(customList.isEmpty());
    customList.add(5);
    Assert.assertFalse(customList.isEmpty());
    customList.remove(0);
    Assert.assertTrue(customList.isEmpty());
  }

  @Test
  public void testClear() {
    Assert.assertTrue(customList.isEmpty());
    customList.add(5);
    customList.add(-1);
    Assert.assertFalse(customList.isEmpty());

    customList.clear();
    Assert.assertTrue(customList.isEmpty());
    Assert.assertEquals(0, customList.size());
  }

  @Test
  public void testSet() {
    customList.add(5);
    customList.add(4);
    customList.add(1);
    Assert.assertEquals(3, customList.size());
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    Assert.assertEquals(Integer.valueOf(1), customList.get(2));

    customList.set(0, -1);
    Assert.assertEquals(3, customList.size());
    Assert.assertEquals(Integer.valueOf(-1), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    Assert.assertEquals(Integer.valueOf(1), customList.get(2));
  }
}
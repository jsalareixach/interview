/*
 * Copyright (c) 2021 StreamSets Inc.
 */

package com.streamsets.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCustomLinkedList {

  CustomLinkedList<Integer> customList;

  @BeforeEach
  void setUp() {
    customList = new CustomLinkedList<>();
  }

  @Test
  void testSize() {
    Assert.assertEquals(0, customList.size());
    customList.add(5);
    Assert.assertEquals(1, customList.size());
    customList.add(2);
    Assert.assertEquals(2, customList.size());
    customList.add(-3);
    Assert.assertEquals(3, customList.size());
    customList.add(7);
    Assert.assertEquals(4, customList.size());
    customList.get(2);
    Assert.assertEquals(4, customList.size());
    customList.remove(2);
    Assert.assertEquals(3, customList.size());
  }

  @Test
  void testIsEmpty() {
    Assert.assertTrue(customList.isEmpty());
    customList.add(5);
    Assert.assertFalse(customList.isEmpty());
    customList.remove(0);
    Assert.assertTrue(customList.isEmpty());
  }

  @Test
  void testClear() {
    Assert.assertTrue(customList.isEmpty());
    customList.add(5);
    customList.add(-1);
    Assert.assertFalse(customList.isEmpty());
    customList.clear();
    Assert.assertTrue(customList.isEmpty());
  }

  @Test
  void testAdd() {
    Assert.assertEquals(0, customList.size());
    customList.add(5);
    Assert.assertEquals(1, customList.size());
    customList.add(4);
    Assert.assertEquals(2, customList.size());
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
  }

  @Test
  void testAddAtIndex() {
    Assert.assertEquals(0, customList.size());
    customList.add(5);
    Assert.assertEquals(1, customList.size());
    customList.add(4);
    Assert.assertEquals(2, customList.size());
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    customList.add(0, 2);
    Assert.assertEquals(3, customList.size());
    Assert.assertEquals(Integer.valueOf(2), customList.get(0));
    Assert.assertEquals(Integer.valueOf(5), customList.get(1));
    Assert.assertEquals(Integer.valueOf(4), customList.get(2));
    try {
      customList.add(5, 5);
      Assert.fail("IndexOutOfBoundsException expected but it wasn't thrown");
    } catch (IndexOutOfBoundsException ex) {
      // we must get an exception
    }
  }

  @Test
  void testSet() {
    Assert.assertEquals(0, customList.size());
    customList.add(5);
    Assert.assertEquals(1, customList.size());
    customList.add(4);
    Assert.assertEquals(2, customList.size());
    customList.add(1);
    Assert.assertEquals(3, customList.size());
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    Assert.assertEquals(Integer.valueOf(1), customList.get(2));
    customList.set(0, -1);
    Assert.assertEquals(Integer.valueOf(-1), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    Assert.assertEquals(Integer.valueOf(1), customList.get(2));
    customList.set(2, -8);
    Assert.assertEquals(Integer.valueOf(-1), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    Assert.assertEquals(Integer.valueOf(-8), customList.get(2));
    try {
      customList.set(5, 10);
      Assert.fail("IndexOutOfBoundsException expected but it wasn't thrown");
    } catch (IndexOutOfBoundsException ex) {
      // we must get an exception
    }
  }

  @Test
  void testGet() {
    Assert.assertEquals(0, customList.size());
    customList.add(5);
    Assert.assertEquals(1, customList.size());
    customList.add(4);
    Assert.assertEquals(2, customList.size());
    customList.add(1);
    Assert.assertEquals(3, customList.size());
    Assert.assertEquals(Integer.valueOf(5), customList.get(0));
    Assert.assertEquals(Integer.valueOf(4), customList.get(1));
    Assert.assertEquals(Integer.valueOf(1), customList.get(2));
    try {
      customList.get(5);
      Assert.fail("IndexOutOfBoundsException expected but it wasn't thrown");
    } catch (IndexOutOfBoundsException ex) {
      // we must get an exception
    }
  }

  @Test
  void testRemove() {
    customList.add(5);
    customList.add(2);
    customList.add(-3);
    Assert.assertEquals(3, customList.size());
    customList.remove(2);
    Assert.assertEquals(2, customList.size());
    customList.remove(0);
    Assert.assertEquals(1, customList.size());
    customList.remove(0);
    Assert.assertEquals(0, customList.size());
    Assert.assertTrue(customList.isEmpty());
    try {
      customList.remove(0);
      Assert.fail("IndexOutOfBoundsException expected but it wasn't thrown");
    } catch (IndexOutOfBoundsException ex) {
      // we must get an exception
    }
  }
}
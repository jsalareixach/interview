/*
 * Copyright (c) 2021 StreamSets Inc.
 */

package com.streamsets.linkedlist;

public class CustomLinkedList<T> implements List<T> {

  private Node<T> firstElement;
  private Node<T> lastElement;

  public CustomLinkedList() {
    firstElement = null;
    lastElement = null;
  }

  @Override
  public T get(int index) {
    // TODO
    return null;
  }

  @Override
  public void add(T value) {
    // TODO
  }

  @Override
  public void add(int index, T value) {
    // TODO
  }

  @Override
  public T set(int index, T value) {
    // TODO
    return null;
  }

  @Override
  public T remove(int index) {
    // TODO
    return null;
  }

  @Override
  public int size() {
    // TODO
    return 0;
  }

  @Override
  public boolean isEmpty() {
    // TODO
    return false;
  }

  @Override
  public void clear() {
    // TODO
  }
}

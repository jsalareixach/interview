/*
 * Copyright (c) 2021 StreamSets Inc.
 */

package com.streamsets.linkedlist;

public class Node<T> {

  private T value;
  private Node<T> next;
  private Node<T> previous;

  public Node() {
    this(null, null, null);
  }

  public Node(T value) {
    this(value, null, null);
  }

  public Node(T value, Node<T> previous) {
    this(value, previous, null);
  }

  public Node(T value, Node<T> previous, Node<T> next) {
    this.value = value;
    this.next = next;
    this.previous = previous;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public Node<T> getPrevious() {
    return previous;
  }

  public void setPrevious(Node<T> previous) {
    this.previous = previous;
  }
}

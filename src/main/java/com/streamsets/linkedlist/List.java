/*
 * Copyright (c) 2021 StreamSets Inc.
 */

package com.streamsets.linkedlist;

public interface List<E> {

  /**
   * Returns the number of elements in this list.
   *
   * @return the number of elements in this list
   */
  int size();

  /**
   * Returns <tt>true</tt> if this list contains no elements.
   *
   * @return <tt>true</tt> if this list contains no elements
   */
  boolean isEmpty();

  /**
   * Removes all of the elements from this list.
   * The list will be empty after this call returns.
   */
  void clear();

  /**
   * Appends the specified element to the end of this list.
   *
   * @param e element to be appended to this list
   * @throws ListFullException if size == Integer.MAX_VALUE
   */
  void add(E e);

  /**
   * Removes the element at the specified position in this list.
   * Shifts any subsequent elements to the left (subtracts one
   * from their indices).  Returns the element that was removed from the
   * list.
   *
   * @param index the index of the element to be removed
   * @return the element previously at the specified position
   * @throws IndexOutOfBoundsException if the index is out of range
   *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
   */
  E remove(int index);

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index index of the element to return
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range
   *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
   */
  E get(int index);

  /**
   * Inserts the specified element at the specified position in this list.
   * Shifts the element currently at that position
   * (if any) and any subsequent elements to the right (adds one to their
   * indices).
   *
   * @param index index at which the specified element is to be inserted
   * @param element element to be inserted
   * @throws IndexOutOfBoundsException if the index is out of range
   *         (<tt>index &lt; 0 || index &gt; size()</tt>)
   * @throws ListFullException if size == Integer.MAX_VALUE
   */
  void add(int index, E element);

  /**
   * Replaces the element at the specified position in this list with the
   * specified element.
   *
   * @param index index of the element to replace
   * @param element element to be stored at the specified position
   * @return the element previously at the specified position
   * @throws IndexOutOfBoundsException if the index is out of range
   *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
   */
  E set(int index, E element);

}

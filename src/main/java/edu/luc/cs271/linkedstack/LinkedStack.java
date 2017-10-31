package edu.luc.cs271.linkedstack;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class LinkedStack<E> implements IStack<E> {

  /** The topmost node of this stack. The stack gets pushed down from here. */
  private Node<E> top;
  
  // DONE why don't we need an explicit constructor?

  @Override
  public E push(final E obj) {
    // DONE
    if(top == null){
      top = new Node<E>(obj);
    }
    else{
      Node<E> temp = new Node(top.data, top.next);
      top = new Node(obj);
      top.next = new Node(temp.data, temp.next);
    }
    return obj;
  }

  @Override
  public E peek() {
    // DONE
    if(top != null){
      if(top.data != null){
      return top.data;
      }
    }
    
    else throw new NoSuchElementException();
    return null;
  }

  @Override
  public E pop() {
    // DONE
    if(top == null) throw new NoSuchElementException();
    if(top.data == null) throw new NoSuchElementException();
    E popped = top.data;
    top = top.next;
    return popped;
  }

  @Override
  public boolean isEmpty() {
    // DONE
    if(top == null) return true;
    if(top.data == null) return true;
    else return false;
  }

  @Override
  public List<E> asList() {
   final ArrayList<E> result = new ArrayList<>();
   populateList(top, result); // DONE replace null with the right reference
   return result;
 }  
 
 private void populateList(final Node<E> curr, final List<E> result) {
  // DONE recursively populate the list in the desired order
  if(curr!=null){
   if(curr.data!=null){
     result.add(curr.data);
     populateList(curr.next,result);
   }
  }
  }

@Override
public List<E> asFifoList() {
  final ArrayList<E> result = new ArrayList<>();
  populateFifoList(top, result); // DONE replace null with the right reference
  return result;
}

private void populateFifoList(final Node<E> curr, final List<E> result) {
  // DONE recursively populate the list in the desired order
  if(curr!=null){
    if(curr.next!=null){
      result.add(0,curr.data);
      populateFifoList(curr.next,result);
    }
    else result.add(0,curr.data);
  }
}

}

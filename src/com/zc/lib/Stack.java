package com.zc.lib;

import java.util.Iterator;

/**
 * 栈数据结构，后进先出，使用数组实现
 * 
 * @author JustinZhang
 *
 */
public class Stack<Item> implements Iterable<Item>{
	
	private Item[] items;
	private int N = 0;
	
	public Stack() {
		items = (Item[]) new Object[10];
	}
	
	private Item[] resizeArray(Item[] arr,int newSize){
	//	int doubleSize = arr.length *2;
		Item[] newArray = (Item[])new Object[newSize];
		
		for (int i = 0; i<N; i++) {
			newArray[i]=arr[i];
		}
		return newArray;
	}

	public void push(Item item){
		if(item == null){
			return;
		}
		
		if(N == items.length){
			items = resizeArray(items,items.length*2);
		}
		items[N++] = item;
	}
	
	public Item pop(){
		
		if(N==0){
			return null;
		}
		
		Item last = items[--N];
		
		items[N]=null;
		
		if(N>0&&N < items.length/4){
			items = resizeArray(items, items.length/2);
		}
		
		return last;
	}
	
	public boolean isEmpty(){
		return N==0;
	}
	public int size(){
		return N;
	}

	@Override
	public Iterator<Item> iterator() {
		
		return new ReserveIterator();
	}
	
	private class ReserveIterator implements Iterator<Item>{

		int i =N;
		@Override
		public boolean hasNext() {
			return i>0;
		}

		@Override
		public Item next() {
			return items[--i];
		}

		@Override
		public void remove() {
			
		}
		
	}
}

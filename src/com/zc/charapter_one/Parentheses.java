package com.zc.charapter_one;

import com.zc.lib.Stack;

public class Parentheses {

	/**
	 * P102 1.3.4
	 * 读取字符串，看括号配对是否正确 
	 * 1,将字符串分离，
	 * 2,读入一个栈stackOne中 
	 * 3,从stackOne中弹出字符，从stackTwo中弹出字符
	 * 4,判断如果两个字符可以不能抵消，那么两个数值都压入stackTwo中
	 * 5，循环第3部直到stackOne为空
	 * @param s
	 * @return
	 */
	public boolean parent(String s) {

		Stack<Character> stackOne = new Stack<Character>();
		Stack<Character> stackTwo = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			stackOne.push(s.charAt(i));
		}

		while (!stackOne.isEmpty()) {
			Character one = stackOne.pop();
			Character two = stackTwo.pop();
			if (!discharge(one, two)) {
				stackTwo.push(two);
				stackTwo.push(one);
			}
		}

		if(stackTwo.isEmpty()){
			return true;
		}
		
		return false;
	}

	/**
	 * 是否能够抵消
	 * 注：例子只配对了3个
	 * @param one
	 * @param two
	 * @return
	 */
	public boolean discharge(Character one, Character two) {
		if(one == null || two == null){
			return false;
		}
		if (one == '[' && two == ']') {
			return true;
		}
		if (one == '{' && two == '}') {
			return true;
		}

		if (one == '(' && two == ')') {
			return true;
		}

		return false;
	}

}

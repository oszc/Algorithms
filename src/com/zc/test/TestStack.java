package com.zc.test;

import com.zc.charapter_one.Parentheses;
import com.zc.lib.Stack;

public class TestStack {

	public static void main(String[] args) {
		/*
		Stack<String> stack = new Stack<>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		for(String s : stack){
			System.out.println(s);
		}
		*/
		
		Parentheses p = new Parentheses();
		System.out.println(p.parent("[()]{}{[()()]()}"));
		System.out.println(p.parent("[(])"));
		
	}
	
		
}

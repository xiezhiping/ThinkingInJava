package holding;

import java.util.LinkedList;

public class LinkedListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> nums = new LinkedList<>();
		nums.addFirst(new Integer(1));
		System.out.println("nums.getFirst():" + nums.getFirst());
		nums.add(new Integer(5));
		System.out.println("after add:" + nums.get(0));
	}

}

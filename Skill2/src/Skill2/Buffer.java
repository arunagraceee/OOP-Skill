package Skill2;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hello");
sb.append(" Java");
		System.out.println("After append: "+sb);
		sb.insert(6, " Everyone");
		System.out.println("After insert: "+sb);
		sb.replace(6,15,"Welcome to");
		System.out.println("After replace: "+sb);
		sb.delete(6,15);
		System.out.println("After delete: "+sb);
		sb.reverse();
		System.out.println("After reverse:"+sb);
		System.out.println("Capacity: "+sb.capacity());
		System.out.println("Length: "+sb.length());
		

	}

}

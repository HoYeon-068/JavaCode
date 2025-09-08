package days16;

import java.util.Arrays;

public class StringComparator {

	public static void main(String[] args) {
		//문제 내용은 String n과 m이 순서 상관없고 대소문자 상관없이 같은지 확인
		//문자열 2개를 sort로 오름차순 이후에 비교
		String n = "keNik";   
		String m = "kKnie"; 
		
		n=n.toUpperCase();
		m=m.toUpperCase();
		
		char[] nArr=n.toCharArray();
		char[] mArr=m.toCharArray();
		
		Arrays.sort(nArr);
		Arrays.sort(mArr);
		
		n=String.valueOf(nArr);
		m=String.valueOf(mArr);
		
		System.out.println(n.equals(m)?"같다":"다르다");
	}

}

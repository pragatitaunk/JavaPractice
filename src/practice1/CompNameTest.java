package practice1;

import java.util.Comparator;

public class CompNameTest implements Comparator<TestComparable>{

	@Override
	public int compare(TestComparable o1, TestComparable o2) {
		return o1.getName().compareTo(o2.getName());
		
	}

}

package practice1;

import java.util.Comparator;

public class CompAgeTest implements Comparator<TestComparable>{

	@Override
	public int compare(TestComparable o1, TestComparable o2) {
		if(o1.getAge()==o2.getAge()){
			return 0;
		}
		else if(o1.getAge()>o2.getAge()){
			return 1;
		}else{
			return -1;	
		}
		
	}

}

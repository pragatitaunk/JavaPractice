package practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateCharsInString {

	public static void main(String args[]){
		String s = "geeks for g eeks";
		String str[] = s.split("");
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String dupchar: str){
			if(!map.containsKey(dupchar)){
				map.put(dupchar, 1);
			}else{
				map.put(dupchar, map.get(dupchar)+1);
			}
		}
		Set key = map.keySet();
		Iterator it = key.iterator();
		while(it.hasNext()){
			String charac = (String) it.next();
			if(map.get(charac)>1){
				System.out.println("char " +charac +" appears " +map.get(charac) +" times..");
			}
		}
			}
}

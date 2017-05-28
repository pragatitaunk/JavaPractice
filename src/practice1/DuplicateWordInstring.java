package practice1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateWordInstring {
	public static void main(String args[]){
		String s = "rain rain go Again come again and go again";
		String str[] = s.split(" ");
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
				System.out.println("word " +charac +" appears " +map.get(charac) +" times..");
			}
		}
			}
}

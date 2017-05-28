package practice1;

import java.util.Arrays;

public class PalindromeStr {

	public static void main(String args[]){
		String str = "madam";
		String arr[] = str.split("");
		String arr2[]= new String[arr.length];
		boolean flag =false;
		int i=0;
		int j = arr.length-1;
		for(;j>=0;j--){
			arr2[i]=arr[j];
			i++;
		}
		System.out.println("reversed array" +Arrays.toString(arr2));
		for(int k=0;k < arr.length;k++){
			if(arr[k].equals(arr2[k])){
				flag = true;
			}
			else
				flag=false;
		}
		if(flag)
			System.out.println("it is palindrome");
		else
			System.out.println("it is not palindrome");
	}
}

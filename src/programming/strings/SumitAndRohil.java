package programming.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumitAndRohil {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        List<String> groupList = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
        	String str = br.readLine();
            if(!groupList.isEmpty()){
            	int listSize = groupList.size();
            	for(int j=0;j<listSize;j++){
            		String groupStr = groupList.get(j);
            		int groupLength = groupStr.length();
            		int length = str.length();
            		if(groupLength == length && groupStr.charAt(0) == str.charAt(0) && groupStr.charAt(groupLength-1)==str.charAt(length-1) && isAnagram(groupStr,str)){
            			break;
            		}
            		else{
            			if(j == listSize -1)
            				groupList.add(str);
            		}
            	}
            	
            }
            else{
            	groupList.add(str);
            }
        }
        System.out.println(groupList.size());

	}

	private static boolean isAnagram(String groupStr, String str) {
		char[] groupAr = groupStr.toCharArray();
		char[] ar = str.toCharArray();
		Arrays.sort(groupAr);
		Arrays.sort(ar);
		return new String(groupAr).equals(new String(ar));
	}

}

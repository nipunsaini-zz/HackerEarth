package com.hacker.earth;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MicroMini {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            char[] chars = br.readLine().toCharArray();
            int length = chars.length;
            Map<String, Boolean> map = new HashMap<String, Boolean>();
            for (int j = 0; j < length; j++) {
                String s = new String(chars);
                if (!map.containsKey(s))
                    map.put(s, true);
                char last = chars[length-1];
                for(int index = length-2; index >= 0; index--)
                    chars[index+1] = chars[index];
                chars[0] = last;
            }
            System.out.println(map.keySet().size());
        }
    }

    public void extra() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int length = s.length();
            Map<String, Boolean> map = new HashMap<String, Boolean>();
            for (int j = 0; j < length; j++) {
                if (!map.containsKey(s))
                    map.put(s, true);
                StringBuilder sb = new StringBuilder();
                s = sb.append(String.valueOf(s.charAt(length-1))).append(s.substring(0, length-1)).toString();
            }
            System.out.println(map.keySet().size());
        }

    }

    public void extra2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int T = Integer.parseInt(line);
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int length = s.length();
            if (s.replaceAll(String.valueOf(s.charAt(0)), "").length() == 0){
                System.out.println(1);
                continue;
            } else if ((length%2 == 0) && s.substring(0, length/2-1).equals(s.substring(length/2, length-1))){
                System.out.println(length/2);
                continue;
            } else {
                System.out.println(length);
                continue;
            }

            /*Map<String, Boolean> map = new HashMap<String, Boolean>();
            for (int j = 0; j < length; j++) {
                if (!map.containsKey(s))
                    map.put(s, true);
                StringBuilder sb = new StringBuilder();
                s = sb.append(String.valueOf(s.charAt(length-1))).append(s.substring(0, length-1)).toString();
                System.out.println(s);

            }
            System.out.println(map.keySet().size());*/
        }

    }
}

package com.revature.main;

import java.util.ArrayList;
import java.util.List;

public class driver {
    public static void main(String[] args){
        for(String x : bucketize("she sells sea shells by the sea", 10)){
            System.out.println(x);
        }

    }

    public static String[] bucketize(String s, int l){
        String[] sp = s.split(" ");

        //int mark = 0;
        int len = 0;
        List<String> ret = new ArrayList<String>();
        for(int i = 0; i < sp.length; i++){
            len = sp[i].length();
            StringBuilder temp;
            if(sp[i].length() <= l){
                temp = new StringBuilder(sp[i] + " ");
            }
            else {return new String[0];}
            for (int g = i + 1; g < sp.length; g++){
                if ((len += sp[g].length()) <= l){
                    temp.append(sp[g] + " ");
                    if(g == sp.length - 1){
                        ret.add(temp.toString().trim());
                        return ret.toArray(new String[0]);
                    }
                }
                else {
                    i = g - 1;
                    ret.add(temp.toString().trim());
                    break;}}
        }

        return ret.toArray(new String[0]);
    }


}

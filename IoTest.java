package com.qin_vic.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by qin_vic
 * 2018/9/11 23:24
 */
public class IoTest {

    private static final String PATH = "d:\\demo.txt";

    public static void main(String[] args) throws IOException {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("tom", 11);
        map.put("jerry", 12);
        map.put("jack", 13);

        list.add(map);

        File file = new File(PATH);
        if (!file.isFile()) {
            file.createNewFile();
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        StringBuffer stringBuffer = new StringBuffer();

//            for (String s : str.keySet()) {
//                s += ",";
//                bw.write(s);
//            }
            String s = "";
            for (int i = 0; i < list.size(); i++) {
                Map<String, Object> ss = list.get(i);
                if (i < ss.keySet().size()) {
                s += ss.keySet() + ",";
                } else {
                    s += ss.keySet();
                }
            }
            bw.write(s);

        bw.close();
        System.out.println("GG......");

    }

}

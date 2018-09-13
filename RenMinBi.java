package com.qin_vic.demo;

/**
 * 人民币转换
 * 阿拉伯数字转为中文大写
 *
 * @Author: qin_vic
 * 2018/8/28 22:22
 */
public class RenMinBi {

    private static final char[] data = new char[]{
            '零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖'
    };
    private static final char[] units = new char[]{
            '元', '拾', '佰', '仟', '万', '拾', '佰', '仟', '亿'
    };

    public static void main(String[] args) {
        System.out.println(convert(135689123));
    }

    private static String convert(int money) {
        StringBuffer sbuff = new StringBuffer();
        int num = 0;
        while (money != 0) {
            sbuff.insert(0, units[num++]);
            int count = money % 10;
            sbuff.insert(0, data[count]);
            money /= 10;
        }
        return sbuff.toString();
    }


}

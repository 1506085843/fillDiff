package com.diff;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {
        //对比 F:\n1.txt 和 F:\n2.txt 两个文件，获得不同点
        List<String> diffString = DiffHandleUtils.diffString("F:\\n1.txt","F:\\n2.txt");
        //在F盘生成一个diff.html 文件，打开便可看到两个文件的对比
        DiffHandleUtils.generateDiffHtml(diffString,"F:\\diff.html");
    }
}

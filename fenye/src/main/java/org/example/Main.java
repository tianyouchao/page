package org.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // String chara=new String();
       // chara=("0123456789");
        //char[] chars=chara.toCharArray();
        Integer page[]={0,1,2,3,4,5,6,7,8,9};
        HashMap<Integer,String>sites=new HashMap<>();
        sites.put(Integer.valueOf(page[0]),"1,2,3,4,5.,6,7,8,9,10");
        sites.put(Integer.valueOf(page[1]),"11,12,13,14,15,16,17,18,19,20");
        sites.put(Integer.valueOf(page[2]),"21,22,23,24,25.,26,27,28,29,30");
        sites.put(Integer.valueOf(page[3]),"31,32,33,34,35.,36,37,38,39,40");
        sites.put(Integer.valueOf(page[4]),"41,42,43,44,45.,46,47,48,49,50");
        sites.put(Integer.valueOf(page[5]),"51,52,53,54,55.,56,57,58,59,60");
        sites.put(Integer.valueOf(page[6]),"61,62,63,64,65.,66,67,68,69,70");
        sites.put(Integer.valueOf(page[7]),"71,72,73,74,75.,76,77,78,79,80");
        sites.put(Integer.valueOf(page[8]),"81,82,83,84,85.,86,87,88,89,90");
        sites.put(Integer.valueOf(page[9]),"91,92,93,94,95.,96,97,98,99,100");
        Integer i=0;

        System.out.println("您当前在第0页，数据为"+sites.get(0));
        Scanner in=new Scanner(System.in);
        String str2=new String();
        if (in.hasNextLine()) {
            str2 = in.nextLine();
            System.out.println("输入的数据为：" + str2);
        }
        in.close();
        switch (str2){
            case "first":
                System.out.println("跳转到第"+0+"页"+sites.get(0));
                break;
            case "last":
                System.out.println("跳转到第"+9+"页"+sites.get(9));
                break;
            case "next":
                System.out.println("跳转到下一页"+sites.get(i+1));
                break;
            case "pre":
                System.out.println("跳转到上一页"+sites.get(i-1));
                break;
            default :
                if(str2!=null){i = Integer.valueOf(str2);}
                for(int j=0;j<=9;j++){
                    if(i.equals(page[j])){
                        System.out.println("跳转到第"+j+"页，内容为"+sites.get(j));
                    }
                }
                }
    }
}
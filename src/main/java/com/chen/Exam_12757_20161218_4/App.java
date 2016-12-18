package com.chen.Exam_12757_20161218_4;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner  =  new Scanner(System.in);
    	System.out.print("请输入日期：");
    	String strDate=scanner.nextLine();
    	int dayOfTheYear=0;
    	SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
    	String strMonth = strDate.substring(5, 7);
    	String strDay = strDate.substring(8, 10);
    	String strYear = strDate.substring(0, 4);
    	if(strMonth.charAt(0)=='0'){
    		strMonth = String.valueOf(strMonth.charAt(1));
    	}
    	if(strDay.charAt(0)=='0'){
    		strDay = String.valueOf(strDay.charAt(1));
    	}
    	int year = Integer.parseInt(strYear);
    	int month = Integer.parseInt(strMonth);
    	int day = Integer.parseInt(strDay);
    	int[] days = new int[11];
    	days[0] = 31;
    	days[1] = 28+days[0];
    	days[2] = 31+days[1];
    	days[3] = 30+days[2];
    	days[4] = 31+days[3];
    	days[5] = 30+days[4];
    	days[6] =31+days[5];
    	days[7] = 31+days[6];
    	days[8] = 30+days[7];
    	days[9] = 31+days[8];
    	days[10] = 30+days[9];
    	
    	dayOfTheYear =days[month-2];
    	
    	dayOfTheYear+=day;
    	if((year%4==0&&year%100!=0)||(year%400==0)){
    		if(month==2&&day>28){
    			throw new RuntimeException("日期输入不正确");
    		}
    		dayOfTheYear+=1;
    	}
    	
    	System.out.println(dayOfTheYear);
    }
}

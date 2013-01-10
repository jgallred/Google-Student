package com.student;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;

import java.util.Calendar;

public class TestHelper {
	
	public static Date makeDate(int month, int date, int year) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.MONTH, month);
		calendar.set(Calendar.DATE, date);
		calendar.set(Calendar.YEAR, year);
		return calendar.getTime();
	}
	
	public static Date makeTime(int hour, int minute, boolean am) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.set(Calendar.HOUR, hour);
		calendar.set(Calendar.MINUTE, minute);
		calendar.set(Calendar.AM_PM, (am) ? Calendar.AM : Calendar.PM );
		return calendar.getTime();
	}
	
	public static void datesEqual(Date d1, Date d2) {
		GregorianCalendar cal1 = new GregorianCalendar();
		GregorianCalendar cal2 = new GregorianCalendar();
		cal1.setTime(d1);
		cal2.setTime(d2);
		
		assertEquals(cal1.get(Calendar.MONTH), cal2.get(Calendar.MONTH));
		assertEquals(cal1.get(Calendar.DATE), cal2.get(Calendar.DATE));
		assertEquals(cal1.get(Calendar.YEAR), cal2.get(Calendar.YEAR));
	}
	
	public static void timesEqual(Date d1, Date d2) {
		GregorianCalendar cal1 = new GregorianCalendar();
		GregorianCalendar cal2 = new GregorianCalendar();
		cal1.setTime(d1);
		cal2.setTime(d2);
		
		assertEquals(cal1.get(Calendar.HOUR), cal2.get(Calendar.HOUR));
		assertEquals(cal1.get(Calendar.MINUTE), cal2.get(Calendar.MINUTE));
		assertEquals(cal1.get(Calendar.AM_PM), cal2.get(Calendar.AM_PM));
	}

}

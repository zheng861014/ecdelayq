package org.n3r.jedis;

import java.util.Date;
import java.util.Timer; 

public class Test {

	/**
	 * @param args
	 */
	
	public void execute() {
		Timer timer = new Timer();
		RunDelayQ mydelayQ = new RunDelayQ();
		Date date = new Date();
		long timestamp = 60000;
		/** *//**
		* myTimeTask 指定执行的线程 date 指定第一次日期执行的时间 timestamp 指定每格多久再次执行一次
		*/
		timer.schedule(mydelayQ, date, timestamp);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.execute();
		
	}

}

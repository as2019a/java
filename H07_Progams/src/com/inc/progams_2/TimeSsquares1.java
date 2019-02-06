package com.inc.progams_2;

import java.util.Timer;
import java.util.TimerTask;

public class TimeSsquares1 {
	
	public static int count;
	
	public static void main(String[] args) {
		
		count = 0;
		
		Timer m_Timer = new Timer();
		TimerTask mTask = TimerTask();
		
		@Override
		Public void run() {
			if(count < 5) {
				System.out.println("Morph");
				count++;
			}else {
				m_Timer.cancel();
			}
		}
		m_Timer.schedule(m_task, 5000, 2000);
	}

	private static TimerTask TimerTask() {
		// TODO Auto-generated method stub
		return null;
	}
}

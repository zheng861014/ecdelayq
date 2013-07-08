package org.n3r.jedis;

import java.util.Set;
import java.util.TimerTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunDelayQ extends TimerTask {

	public void run() {
		Logger logger = LoggerFactory.getLogger(RunDelayQ.class);
		EcRocJedis jedis = new EcRocJedis("132.35.81.197", 6379);
		jedis.setDelay("delayqueue", "remark", 30);
		logger.info("setDelayQ operate");
		Set<String> response = jedis.getDelay("delayqueue");
		logger.info(response.toString());
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		response = jedis.getDelay("delayqueue");
		logger.info(response.toString());

	}
}

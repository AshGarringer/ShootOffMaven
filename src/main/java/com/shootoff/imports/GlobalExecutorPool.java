package com.shootoff.imports;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

  public class GlobalExecutorPool {
  	public static class DaemonThreadFactory implements ThreadFactory {
  		@Override
  		public Thread newThread(Runnable paramRunnable) {
  			Thread t = new Thread(paramRunnable);
  			t.setDaemon(true);
  			return t;
  		}
  	}

  	private static ThreadPoolExecutor pool = (ThreadPoolExecutor) Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), new DaemonThreadFactory());

  	public static ThreadPoolExecutor getPool() {
  		return pool;
  	}
}


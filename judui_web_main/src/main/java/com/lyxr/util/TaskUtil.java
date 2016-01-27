package com.lyxr.util;

public class TaskUtil {
	
	public interface Cycle{//任务周期
		public static final int EVERYDAY = 0;//每天
		public static final int EVERYWEEK = 1;//每周
		public static final int EVERYMONTH = 2;//每月
		public static final int EVERYHOUR = 3;//没小时
		public static final int ONLYONE = 4;//一次
	}
	
	public static final int ONREADY = 1;//初始
	public static final int ONDONE = 2;//执行中
	public static final int YES = 3;//完成
	public static final int NO =4;//未完成
	
}

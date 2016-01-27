package com.lyxr.util;

public class Common {
	
	public interface Code{
		public static final Integer SUCCESS = 200;//成功
		public static final Integer ERROR = 400;//失败
		public static final Integer NOTFOUND = 404;//没有找到
		public static final Integer SHUTDOWN = 505;//中断
	}
	
	public interface Msg{
		public static String BLANK="数据为空!";
		public static String PARAMERROR="参数错误!";
		public static String FAILURE="操作失败!";
		public static String SUCCESS="操作成功!";
		public static String DATA_ERROR="数据错误!";
		public static String UNKOWN_ERROR="未知错误!";
		public static String EXIST="数据已存在!";
	}
}

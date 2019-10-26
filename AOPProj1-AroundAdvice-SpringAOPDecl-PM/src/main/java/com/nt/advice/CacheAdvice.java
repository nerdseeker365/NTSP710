package com.nt.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CacheAdvice implements MethodInterceptor {
   private Map<String,Object> cacheMap=new HashMap();
   
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		String key=null;
		Object retVal=null;
		key=invocation.getMethod().getName()+Arrays.toString(invocation.getArguments());
		if(cacheMap.containsKey(key)) {
			System.out.println("from cache");
			retVal=cacheMap.get(key);
		}
		else {
			System.out.println("from target method");
			retVal=invocation.proceed();
			cacheMap.put(key,retVal);
		}
		//access and modify target method return value
		retVal=((Float)retVal)+((Float)retVal)*0.1f;
		
		return retVal;
	}//method
}//class

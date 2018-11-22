package typeinfo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class HiddenImplementation {
	static void callHiddenMethod(Object a, String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method g = a.getClass().getDeclaredMethod(methodName);
		g.setAccessible(true);
		g.invoke(a);
	}
}

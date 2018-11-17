package interfaces.interfaceprocessor;

public interface Processor {
	String name(); // java中接口不显示声明为public的则编译器会隐私转为public访问权限
	Object process(Object input);
}

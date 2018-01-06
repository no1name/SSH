/*
  注释的内容不会被执行
  1.多行注释 /*开头   *斜杠结尾 
  2.文档注释 /**  *斜杠结尾  
  3.单行注释 //
  注意:多行和文档注释 不要嵌套使用
  
  创建第一个java程序
	1.class--类名  class后面的名称第一个字母大写  
			如果class前面有public名称必须与文件名一致
	
	2.public static void main  主方法(函数)入口  
	  方法的(String args []) 叫参数 
	  System.out.print()打印 的方法 
	  java程序 每一行代码 以;结束
	  
	问题1:'javac' 不是内部或外部命令，也不是可运行的程序
		   或批处理文件。
		解决方案1：把.java文件放到 javac的同级目录 
		解决方案2：通过配置环境变量自动找javac
		           path--环境变量
	问题2: 错误: 编码GBK的不可映射字符	
		大陆默认是GBK编码，notpad默认是utf-8
		把编码改成ANSI的就可以了
		
	问题3:错误: 在类 MyFirst 中找不到主方法, 请将主方法定义为:
		在文件中一定要声明 public static void main方法 --暂时这么理解
	
	问题4:错误: 程序包system不存在
		java是严格区分大小写
		
	注意:1.java MyFirst  执行的时候 使用java命令  不要加文件后缀
		 2.改过源代码.java文件，那么要重新编译 
*/

public class MyFirst{
	public static void main(String args []){
		System.out.print("hello world");
	}
	
}

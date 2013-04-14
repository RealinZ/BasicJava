/* 已用变量名：demo age score b S c */
class demo
{
  public static void main(String[] args) 
	{
		System.out.println("========================【运算符】=========================");

		System.out.println("------------------------[逻辑运算符]-----------------------");
		System.out.println((3==4) && (1/0==0));       //false    说名程序只执行到了   （3==4）
		System.out.println((3==3) || (1/0==0));       //true	说名程序只执行到了   （3==3）
		//System.out.println((3==4) & (1/0==0));     
		/*  提示 Exception in thread "main" java.lang.ArithmeticException: / by zero，说名程序运行到了(1/0==0)     
		(3==3) | (1/0==0)也相同 */

		int demo = 5;
		demo += 5;    // demo = demo + 5
		System.out.println(demo);
		// 执行到此时，变量demo的值为10
		demo -=5;  // demo = demo-5
		
		System.out.println(demo); 

		System.out.println("--------------------[三目运算表达式]-----------------"); 
		/*  三目运算表达的结果由语句1和语句2来决定，一般来说语句1和语句2的类型是一样的 
			
			boolean表达式 ？ 语句1 ： 语句2

			boolean表达式有两种结果：
			true： 执行语句1
			false：执行语句2    
			
			boolean表达式范例：  age >= 18

			*/
		int age = 18;
		System.out.println(age >= 18 ? "成年" : "未成年"); 
		age = 17;
		System.out.println(age >= 18 ? "成年" : "未成年"); 
		/*      如果  age  >=18   那么显示  成年  ，否则显示   未成年*/
		System.out.println("");
		int score = 60;
		System.out.println(score >= 60 ? "及格" : "不及格");
		score = 59;
		System.out.println(score >= 60 ? "及格" : "不及格");						
		

																    //boolean b = score >= 60 ? "及格" : "不及格"；
																	/*   demo.java:22: 错误: 非法字符: \65307
																	boolean b = score >= 60 ? "及格" : "不及格"；*/





																	/*boolean b = score >=60 ? 1 : 0;     
																	demo.java:39: 错误: 不兼容的类型
																	boolean b = score >=60 ? 1 : 0;
		                       ^
																	需要: boolean
																	找到:    int
																	1 个错误 */
		
		int b = score>=60 ? 0:1;
		System.out.println(b);    // 1

		String S = score >= 60 ?  "及格" :   "不及格";

		System.out.println(S);// 不及格
		
		char c = score>=60 ? 'A' : 'B';
		System.out.println(c);
	
	
		System.out.println("--------------------位运算操作----------------");
		/*   
				二进制数 a	二进制数 b	与(&)	或(|)	异或(^)
					0			0		0		0		0
					1			0		0		1		1
					1			0		0		1		1
					1			1		1		1		0
		*/


		System.out.println("3 & 5=" + (3 & 5)); //1

		/*
		0b00000000_00000000_00000000_00000011     3的二进制
		0b00000000_00000000_00000000_00000101	  5的二进制
		----------------------------------------------------
		0b00000000_00000000_00000000_00000001     1的二进制
		*/
		
		//移位
		//若是正数使用0补充。若是负数使用1补充
		System.out.println("8 << 2=" + (8 << 2));
		/*
			0b00000000_00000000_00000000_000001000   8的二进制
	左移两位0b00000000_00000000_00000000_000100000    32的二进制
		*/
		System.out.println("8 >> 2=" + (8 >> 2));
		/*
			0b00000000_00000000_00000000_000001000   8的二进制
	右移两位0b00000000_00000000_00000000_000000010    2的二进制
		*/ 
		System.out.println("-8 >> 2=" + (-8 >> 2));
		/*
			0b11111111_11111111_11111111_111111000   -8的二进制
	右移两位0b11111111_11111111_11111111_111111110    -2的二进制
		*/
		
		//    >>>无符号右移




		

	}
}
		


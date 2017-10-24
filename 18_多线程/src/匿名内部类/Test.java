package 匿名内部类;

public class Test {
	public static void main(String[] args) {
		/*
		 * 调用Animal#eat();
		 * 思路: 普通做法
		 * 	1. 创建一个类去继承Animal类.
		 *  2. 重写Animal#eat().
		 *  3. 创建Animal类的子类对象, 然后调用eat().
		 *  
		 *  匿名对象:
		 *    概述: 没有名字的对象.
		 *    格式: new 类名();
		 */
		Cat cat = new Cat();
		cat.eat();
		
		//上边的代码可以变形为:
						  // new Cat(): Cat类的一个匿名对象
		new Cat().eat();  // new Cat(): Animal类的子类的一个匿名对象
		
		
		/*
		 * 我的本意只是调用Animal#eat(), 但是上述的做法太复杂了, 居然要三步才能实现,
		 * 有没有简单点的做法呢? 这就是接下来要讲的: 匿名内部类.
		 * 匿名内部类:
		 * 	格式:
		 * 		new 类名(接口名) {
		 * 			//重写类中(接口中)的所有抽象方法
		 * 		};
		 * 	本质: 其实就是类(接口)的子类的匿名对象.
		 *  专业的说法: 匿名内部类的本质其实是一个继承了类(或者实现了接口)的匿名的子类对象.
		 */
		new Animal() {
			public void eat() {
				System.out.println("我是匿名内部类的方式实现的");
			}
		}.eat();
		
		
		new Cat();
		new Animal() {
			public void eat() {
				
			}
		};
	}
}

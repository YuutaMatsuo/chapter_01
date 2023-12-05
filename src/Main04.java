
public class Main04 {
	public static void main(String[] args) {
		final double PI = 3.14; //円周率を定数として初期化
		int pie = 5; //円の半径
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
//		PI = 10; //値の再代入(定数への再代入はできない）
		pie = 10; //値の再代入
		System.out.println("半径" + pie +"cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		}
}

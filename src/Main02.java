
public class Main02 {
	public static void main(String[] args) {
		int age; //データ型はint型で変数名は「age」という変数の箱を準備
//		int age;	同じエリア内では、同じ変数名を宣言することはできない
		int age2;
		int age3;
//		int int; 予約語を変数名として使うことはできない！
		
		age = 30; //変数「age」に対して。「30という値を代入する。
//		age4 = 30;  宣言せずに代入しようとするとエラーになる。
		
		//変数「age」の中身「30」を参照して、それを出力する。
		System.out.println(age);
		
		
//		-----整数の型------
		int myAge;
		int yourAge;
		
		byte number1;
		number1 = 127; 	//number1に127を代入
		number1 = -128; //numberに-128を代入
//		number1 = 128;  //取り扱うことができる値の範囲が決まっている
		
		short number2; //整数
		number2 =32767;
		number2 = -32768;
		
		//変数の宣言と、値の代入を同時に行う（変数の初期化）
		int number3 = 2100000000; //整数
		long number4 = 9000000000000000000L; //数値の最後にLをつける
		
		
//		-----小数の型-----
		
		float weight; //すこし曖昧でもよい小数
		weight = 67.59F;
		double height; //普通の小数
		height = 171.2;
		
		
//		-----真偽値の型----
		
		boolean result; //真偽値を格納することができる
		result = true;  // 真
		result = false; // 偽
		
		
//		-----文字-----
		
		char zodiac;
		zodiac = '申'; //シングルクォーテーションで囲う
		
		
//		-----文字列-----
		
		String name;
		name = "みなと"; //ダブルクォーテーションで囲う
		}
}
package sample.chapter1;

public class FieldAndLocalVariable {
	int fieldVariable; // フィールド変数
	
	void method1(int localVariable) { // ←引数の変数もローカル変数
		int localVariable2 = 10; // ローカル変数
		System.out.println(localVariable);	// 同メソッド内ではローカル変数は使用可能
		System.out.println(localVariable2);	// 同メソッド内ではローカル変数は使用可能
	}

	void method2() {
		System.out.println(fieldVariable);		// フィールド変数はクラス内であればどこからでも使用可能
		//System.out.println(localVariable);	// method1()で定義したローカル変数は使用不可能
		//System.out.println(localVariable2);	// method1()で定義したローカル変数は使用不可能
	}
}

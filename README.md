# JavaLambdaFormula
ラムダ式

## 処理
[JavaClassAndObject](https://github.com/xekid78/JavaClassAndObject)の処理をラムダ式にして見ました。

## コード
```
public class Sample46 {

	public static void main(String[] args) {
		Msg2 msg = () -> { System.out.println("Hello World"); };

		msg.HelloWorld();

	}

}

interface Msg2 {
	public void HelloWorld();
}

```

## 出力結果  
```
Hello World
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |

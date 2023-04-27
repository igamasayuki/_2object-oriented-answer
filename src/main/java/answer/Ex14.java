package answer;

public class Ex14 {
	public static void main(String[] args) {

		Ex14Triathlete triathlete = new Ex14Triathlete();

		// サイクリングロードに行きます
		triathlete.move("サイクリングロード");

		// ツールを自転車に変更します
		triathlete.changeTool("自転車");

		// トレーニングします
		triathlete.training();

		// 海に行きます
		triathlete.move("海");

		// ツールをシューズに変更します
		triathlete.changeTool("シューズ");
		
		// トレーニングします
		triathlete.training();
		
		// 公園に行きます
		triathlete.move("公園");

		// ツールをシューズに変更します
		triathlete.changeTool("シューズ");
		
		// トレーニングします
		triathlete.training();
	}
}
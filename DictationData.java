import java.util.ArrayList;
import java.util.List;

public class DictationData {

	//Define the range of your own dictation here.
	
	public static List<Japanese> hiraganas = new ArrayList<>();  
	public static List<Japanese> katakanas = new ArrayList<>();  
	public static List<Japanese> myList = new ArrayList<>();
	
	
	public DictationData() {
		fillHiraganas();
		fillKatakanas();
		fillMyList();
	}
	
	public List<Japanese> getHiraganas(){
		return hiraganas;
	}
	
	public List<Japanese> getKatakanas(){
		return katakanas;
	}
	
	public List<Japanese> getMyList(){
		return katakanas;
	}
	
	public static void fillMyList() {
		myList.add(new Japanese("Good Morning!(polite)","おはようございます"));
		myList.add(new Japanese("Hello","こんにちわ"));
		myList.add(new Japanese("Good evening","こんばんは"));
		myList.add(new Japanese("Goodbye (to your teacher)","しつれします"));
		myList.add(new Japanese("See you again! (to your friend)","じゃあ、また"));
		myList.add(new Japanese("Thank you(polite)","ありがとうございます"));
		myList.add(new Japanese("Um, excuse me.","あのう、すみません"));
		myList.add(new Japanese("You are welcome.","どういたしまして。"));
	}
	public static void fillHiraganas() {

		hiraganas.add(new Japanese("a","あ"));
		hiraganas.add(new Japanese("i","い"));
		hiraganas.add(new Japanese("u","う"));
		hiraganas.add(new Japanese("e","え"));
		hiraganas.add(new Japanese("o","お"));
		hiraganas.add(new Japanese("ka","か"));
		hiraganas.add(new Japanese("ki","き"));
		hiraganas.add(new Japanese("ku","く"));
		hiraganas.add(new Japanese("ke","け"));
		hiraganas.add(new Japanese("ko","こ"));
		hiraganas.add(new Japanese("sa","さ"));
		hiraganas.add(new Japanese("shi","し"));
		hiraganas.add(new Japanese("su","す"));
		hiraganas.add(new Japanese("se","せ"));
		hiraganas.add(new Japanese("so","そ"));
		hiraganas.add(new Japanese("ta","た"));
		hiraganas.add(new Japanese("chi","ち"));
		hiraganas.add(new Japanese("tsu","つ"));
		hiraganas.add(new Japanese("te","て"));
		hiraganas.add(new Japanese("to","と"));
		hiraganas.add(new Japanese("na","な"));
		hiraganas.add(new Japanese("ni","に"));
		hiraganas.add(new Japanese("nu","ぬ"));
		hiraganas.add(new Japanese("ne","ね"));
		hiraganas.add(new Japanese("no","の"));
		hiraganas.add(new Japanese("ha","は"));
		hiraganas.add(new Japanese("hi","ひ"));
		hiraganas.add(new Japanese("fu","ふ"));
		hiraganas.add(new Japanese("he","へ"));
		hiraganas.add(new Japanese("ho","ほ"));
		hiraganas.add(new Japanese("ma","ま"));
		hiraganas.add(new Japanese("mi","み"));
		hiraganas.add(new Japanese("mu","む"));
		hiraganas.add(new Japanese("me","め"));
		hiraganas.add(new Japanese("mo","も"));
		hiraganas.add(new Japanese("ya","や"));
		hiraganas.add(new Japanese("yu","ゆ"));
		hiraganas.add(new Japanese("yo","よ"));
		hiraganas.add(new Japanese("ra","ら"));
		hiraganas.add(new Japanese("ri","り"));
		hiraganas.add(new Japanese("ru","る"));
		hiraganas.add(new Japanese("re","れ"));
		hiraganas.add(new Japanese("ro","ろ"));
		hiraganas.add(new Japanese("wa","わ"));
		hiraganas.add(new Japanese("wo","を"));
		hiraganas.add(new Japanese("n","ん"));
		
		hiraganas.add(new Japanese("pa","ぱ"));
		hiraganas.add(new Japanese("pi","ぴ"));
		hiraganas.add(new Japanese("pu","ぷ"));
		hiraganas.add(new Japanese("pe","ぺ"));
		hiraganas.add(new Japanese("po","ぽ"));
		
		hiraganas.add(new Japanese("ba","ば"));
		hiraganas.add(new Japanese("bi","び"));
		hiraganas.add(new Japanese("bu","ぶ"));
		hiraganas.add(new Japanese("be","べ"));
		hiraganas.add(new Japanese("bo","ぼ"));
		
		hiraganas.add(new Japanese("da","だ"));
		hiraganas.add(new Japanese("ji","じ"));
		hiraganas.add(new Japanese("dzu","づ"));
		hiraganas.add(new Japanese("de","で"));
		hiraganas.add(new Japanese("do","ど"));
		
		hiraganas.add(new Japanese("za","ざ"));
		hiraganas.add(new Japanese("ji","ぢ"));
		hiraganas.add(new Japanese("zu","ず"));
		hiraganas.add(new Japanese("ze","ぜ"));
		hiraganas.add(new Japanese("zo","ぞ"));
		
		hiraganas.add(new Japanese("ga","が"));
		hiraganas.add(new Japanese("gi","ぎ"));
		hiraganas.add(new Japanese("gu","ぐ"));
		hiraganas.add(new Japanese("ge","げ"));
		hiraganas.add(new Japanese("go","ご"));
		
		 }
	public static void fillKatakanas() {

		katakanas.add(new Japanese("a","ア"));
		katakanas.add(new Japanese("i","イ"));
		katakanas.add(new Japanese("u","ウ"));
		katakanas.add(new Japanese("e","エ"));
		katakanas.add(new Japanese("o","オ"));
		katakanas.add(new Japanese("ka","カ"));
		katakanas.add(new Japanese("ki","キ"));
		katakanas.add(new Japanese("ku","ク"));
		katakanas.add(new Japanese("ke","ケ"));
		katakanas.add(new Japanese("ko","コ"));
		katakanas.add(new Japanese("sa","サ"));
		katakanas.add(new Japanese("shi","シ"));
		katakanas.add(new Japanese("su","ス"));
		katakanas.add(new Japanese("se","セ"));
		katakanas.add(new Japanese("so","ソ"));
		katakanas.add(new Japanese("ta","タ"));
		katakanas.add(new Japanese("chi","チ"));
		katakanas.add(new Japanese("tsu","ツ"));
		katakanas.add(new Japanese("te","テ"));
		katakanas.add(new Japanese("to","ト"));
		katakanas.add(new Japanese("na","ナ"));
		katakanas.add(new Japanese("ni","ニ"));
		katakanas.add(new Japanese("nu","ヌ"));
		katakanas.add(new Japanese("ne","ネ"));
		katakanas.add(new Japanese("no","ノ"));
		katakanas.add(new Japanese("ha","ハ"));
		katakanas.add(new Japanese("hi","ヒ"));
		katakanas.add(new Japanese("fu","フ"));
		katakanas.add(new Japanese("he","ヘ"));
		katakanas.add(new Japanese("ho","ホ"));
		katakanas.add(new Japanese("ma","マ"));
		katakanas.add(new Japanese("mi","ミ"));
		katakanas.add(new Japanese("mu","ム"));
		katakanas.add(new Japanese("me","メ"));
		katakanas.add(new Japanese("mo","モ"));
		katakanas.add(new Japanese("ya","ヤ"));
		katakanas.add(new Japanese("yu","ユ"));
		katakanas.add(new Japanese("yo","ヨ"));
		katakanas.add(new Japanese("ra","ラ"));
		katakanas.add(new Japanese("ri","リ"));
		katakanas.add(new Japanese("ru","ル"));
		katakanas.add(new Japanese("re","レ"));
		katakanas.add(new Japanese("ro","ロ"));
		katakanas.add(new Japanese("wa","ワ"));
		katakanas.add(new Japanese("wo","ヲ"));
		katakanas.add(new Japanese("n","ン"));
		
		katakanas.add(new Japanese("pa","パ"));
		katakanas.add(new Japanese("pi","ピ"));
		katakanas.add(new Japanese("pu","プ"));
		katakanas.add(new Japanese("pe","ペ"));
		katakanas.add(new Japanese("po","ポ"));
		
		katakanas.add(new Japanese("ba","バ"));
		katakanas.add(new Japanese("bi","ビ"));
		katakanas.add(new Japanese("bu","ブ"));
		katakanas.add(new Japanese("be","ベ"));
		katakanas.add(new Japanese("bo","ボ"));
		
		katakanas.add(new Japanese("da","ダ"));
		katakanas.add(new Japanese("ji","シ"));
		katakanas.add(new Japanese("dzu","ヅ"));
		katakanas.add(new Japanese("de","デ"));
		katakanas.add(new Japanese("do","ド"));
		
		katakanas.add(new Japanese("za","ザ"));
		katakanas.add(new Japanese("ji","ジ"));
		katakanas.add(new Japanese("zu","ズ"));
		katakanas.add(new Japanese("ze","ゼ"));
		katakanas.add(new Japanese("zo","ゾ"));
		
		katakanas.add(new Japanese("ga","ガ"));
		katakanas.add(new Japanese("gi","ギ"));
		katakanas.add(new Japanese("gu","グ"));
		katakanas.add(new Japanese("ge","ゲ"));
		katakanas.add(new Japanese("go","ギ"));
		
		 }

	
}


package kadai_021;

import java.util.HashMap;
import java.util.List;

public class Dictionary_Chapter21 {

	public void lookup_in_dict(List<String> list) {

		HashMap<String, String> dictionary = new HashMap<>();

		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウイ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");

		for (String str : list) {

			String word = dictionary.get(str);

			if (word == null) {
				System.out.println(str + "は辞書に存在しません");

			} else {
				System.out.println(str + "の意味は" + word);
			}
		}
	}
}

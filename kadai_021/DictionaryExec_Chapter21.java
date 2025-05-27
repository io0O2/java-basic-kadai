package kadai_021;

import java.util.ArrayList;
import java.util.List;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		List<String> list = new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("grape");
		list.add("orange");

		dictionary.lookup_in_dict(list);

	}
}

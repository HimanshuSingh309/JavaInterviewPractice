package practice;

class Test {
	public static void main(String[] args) {
		String str = "aaaabbcccd";
		char ch[] = str.toCharArray();
		// char [] ch = str.tocharArray(str);
		int count = 1;
		for (int i = 0; i <= ch.length - 1; i++) {

			for (int j = i + 1; j <= ch.length - 1; j++) {
				if (ch[i] == (ch[j])) {
					count++;
					ch[j] = '_';
				}
			}
			if (count >= 1 && ch[i] != '_') {
				System.out.println(ch[i] + "----" + count);
			}
			count = 1;
		}
	}
}

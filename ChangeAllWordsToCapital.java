package p1;
//program to change the each word first letter to capital

/*
input:: "india is my country.all indians are my brothers and sisters,so proud of it"
India Is My Country.All Indians Are My Brothers And Sisters,So Proud Of It
*/

public class ChangeAllWordsToCapital {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s = new StringBuffer("india is my country.all indians are my brothers and sisters,so proud of it");
		String st = new String(Character.toString(s.charAt(0)).toUpperCase());
		s.replace(0, 1, st);
		for (int i = 1; i < s.length() - 1; i++) {
			if (s.charAt(i) == ' ' || s.charAt(i) == '.' || s.charAt(i) == ',') {
				String st1 = new String(Character.toString(s.charAt(i + 1)).toUpperCase());
				s.replace(i + 1, i + 2, st1);
			}
		}
		System.out.println(s);
	}

}

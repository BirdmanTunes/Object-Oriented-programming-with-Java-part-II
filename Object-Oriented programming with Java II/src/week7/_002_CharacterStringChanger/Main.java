package week7._002_CharacterStringChanger;

public class Main {

	public static void main(String[] args) {
        Changer scandiesAway = new Changer();
        scandiesAway.addChange(new Change('�', 'a'));
        scandiesAway.addChange(new Change('�', 'o'));
        System.out.println(scandiesAway.change("��li� �l� ly�, ��li� l�ikkyy"));
	}
}

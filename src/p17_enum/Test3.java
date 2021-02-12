package p17_enum;

public class Test3 {
	public static void main(String[] args) {
		DzienTygodnia3 wtorek = DzienTygodnia3.WTO;		
		System.out.print(wtorek + " ");
		System.out.println(wtorek.handelDozwolony());
		System.out.println(wtorek.name() + " " + wtorek.ordinal());		
		System.out.println(wtorek.getClass());
		System.out.println(wtorek.getClass().getSuperclass());
		System.out.println(wtorek.getClass().getSuperclass().getSuperclass());
		System.out.println(wtorek.getClass().getSuperclass().getSuperclass().getSuperclass());
		
		System.out.println();
		DzienTygodnia3 niedziela = DzienTygodnia3.NIE;		
		System.out.print(niedziela + " ");
		System.out.println(niedziela.handelDozwolony());
		System.out.println(niedziela.name() + " " + niedziela.ordinal());		
		System.out.println(niedziela.getClass());
		System.out.println(niedziela.getClass().getSuperclass());
		System.out.println(niedziela.getClass().getSuperclass().getSuperclass());
		System.out.println(niedziela.getClass().getSuperclass().getSuperclass().getSuperclass());
	}
}

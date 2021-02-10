package p04_operatory;

public class ZagadkiPlusPlus {

	public static void main(String[] args) {
		int x, y, z;

		x = 1;
		x = x++ + ++x; // 1 + 3
		System.out.println(x);
		
		x = 1;
		x = ++x + x++; // 2 + 2
		System.out.println(x);
		
		y = 1;
		y += y++;
		// y = (y + y++)
		// y = 1 + 1
		System.out.println(y);

		z = 1;
		z += z++ + ++z;
		// z = z + z++ + ++z
		// z = 1 + 1 + 3 = 5
		System.out.println(z);
	}
}

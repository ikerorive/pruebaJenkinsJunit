package cesarMavenTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.mondragon.junit.cesar.CifradoCesar;

public class CifradoCesarTest {

	@Test
	public void cifrarCadenaTest() {
		CifradoCesar cif = new CifradoCesar("abcdefghijklmnopqrstuvwxyz");
		String expected = "defghijklmnopqrstuvwxyzcba";
		String real = cif.cifrarCadena();
		assertEquals(expected, real, (Object) expected);
	}

	@Test
	public void descifrarCadenaTest() {
		CifradoCesar cif = new CifradoCesar("defghijklmnopqrstuvwxyzcba");
		String expected = "abcdefghijklmnopqrstuvwxyz";
		String real = cif.descifrarCadena();
		assertEquals(expected, real, (Object) expected);
	}

	@Test
	public void testElse() {
		CifradoCesar cif = new CifradoCesar("ñ");
		String expected = "ñ";
		String real = cif.cifrarCadena();
		assertEquals(expected, real, (Object) expected);
	}

	@Test
	public void mainTest() {
		CifradoCesar.main(new String[] { "arg1", "arg2", "arg3" });
	}
}

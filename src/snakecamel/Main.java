package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String expected = "abc_def_gh";
		String actual = SnakeCamelUtil.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));

	}

}

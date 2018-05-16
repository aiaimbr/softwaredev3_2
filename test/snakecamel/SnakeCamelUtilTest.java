package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	
	@Test
	public void snakeToCamelcaseでabc_dからAbcDに変換できる(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcDefGh";
		String actual = sc.snakeToCamelcase("abc__def__gh");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでAbCdからab_cdに変換できる(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = sc.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}
	@Test 
	public void capitalizeでabcからAbcに変換できる(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "Abc";
		String actual = sc.capitalize("abc");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeでAbcからabcに変換できる(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "abc";
		String actual = sc.uncapitalize("Abc");
		assertThat(actual, is(expected));
	}

}

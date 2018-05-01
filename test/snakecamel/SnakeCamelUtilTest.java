package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	
	@Test
	public void snakeToCamelcaseでabc_dからAbcDに変換できる(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "AbcD";
		String actual = sc.snakeToCamelcase("abc_d");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでAbCdからab_cdに変換できる(){
		SnakeCamelUtil sc = new SnakeCamelUtil();
		String expected = "ab_cd";
		String actual = sc.camelToSnakecase("AbCd");
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

package teoriainterfazfuncional00;

public class PruebaReferencialMethodsStatic09 {

	public static void main(String[] args) {
		Converter<Float,String> converterLambda=(String f) -> {return Float.valueOf(f);};
		Converter<Float,String> converter=
				Float::valueOf;
		Float otro=converter.convert("16.9");
		System.out.println(otro);
	}

}

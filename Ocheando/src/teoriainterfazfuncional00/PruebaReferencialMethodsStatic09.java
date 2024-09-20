package teoriainterfazfuncional00;

public class PruebaReferencialMethodsStatic09 {

	public static void main(String[] args) {
		Converter<Float, String> converterLambda = (String f) -> {
			return Float.valueOf(f);
		};
		Converter<Float, String> converter = Float::valueOf;
		Float otro = converter.convert("16.9");
		System.out.println(otro);
		Converter<Float, String> converterRef = ParaConverter::convertir;
		Converter<String, Float> converterBack = ParaConverterBack::convertir;
	}

}

class ParaConverterOther {
	public static String convertir(Float valor) {
		String retorno = "impar";
		if (valor % 2 == 0) {
			retorno = "par";
		}
		return retorno;
	}
}

class ParaConverterBack {
	public static String convertir(Float valor) {
		if (valor == 5f) {
			return "cinco";
		}
		return "nada";
	}
}

class ParaConverter {
	public static Float convertir(String valor) {
		if (valor.startsWith("a")) {
			return 5f;
		}
		return -1f;
	}
}
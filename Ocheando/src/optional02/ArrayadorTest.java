package optional02;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class ArrayadorTest {

	@Test
	void test() {
		//sin optional
		ArrayList<String> array = new Arrayador().getArray("hola");
		if(array==null) {
			array=new ArrayList<>();
			System.out.println(array.size());
		}else {
			
		}
	}
	@Test
	void testoption() {
		//sin optional
		Optional<ArrayList<String>> optionalArray = new Arrayador().getArrayOptional("hola");
		optionalArray.ifPresent((array)->{
			System.out.println(array.size());
		});
		
	}

}

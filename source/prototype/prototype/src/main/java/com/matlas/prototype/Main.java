package com.matlas.prototype;

import java.io.File;
import java.lang.module.Configuration;
import java.util.HashMap;
import java.util.Map;
import static org.asciidoctor.Asciidoctor.Factory.create;
import static org.asciidoctor.OptionsBuilder.options;
import org.asciidoctor.Asciidoctor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello World !");
		Asciidoctor asciidoctor = create();
		
		
		Map<String, Object> options = options()
				  .inPlace(true)
				  .backend("pdf")
				  .asMap();

				String outfile = asciidoctor.convertFile(new File("src\\main\\resources\\matlasPla.adoc"), options);
		

	}
	
	

}

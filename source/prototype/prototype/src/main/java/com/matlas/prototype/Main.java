package com.matlas.prototype;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import static org.asciidoctor.Asciidoctor.Factory.create;
import static org.asciidoctor.OptionsBuilder.options;
import static org.asciidoctor.AttributesBuilder.attributes;
import org.asciidoctor.Asciidoctor;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hello World !");
		
		Map<String, Object> model = new HashMap<>();
		model.put("major", "test");
		
		Configuration cfg = new Configuration (new Version(2,3,30));
		cfg.setClassForTemplateLoading(Main.class,"/templates");
		cfg.setDefaultEncoding(Charset.defaultCharset().displayName());
		cfg.setLocale(Locale.FRANCE);
		
		File adocFile = new File(new File("target"),"matlass.adoc");
		try(final Writer fileWirter = new FileWriter(adocFile);){
			Template templete = cfg.getTemplate("test.ftl");
			
			templete.process(model, fileWirter);
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		Asciidoctor asciidoctor = create();
		
		Map<String, Object> attributes = attributes().backend("docbook") 
                .asMap();
		
		Map<String, Object> options = options()
				  .inPlace(true)
				  .attributes(attributes)
				  .backend("pdf")
				  .asMap();
	
				String outfile = asciidoctor.convertFile(adocFile, options);
				File filefinal = new File(new File("target"),"matlass.pdf");
				
		System.out.println("document généré");

	}
	
	

}

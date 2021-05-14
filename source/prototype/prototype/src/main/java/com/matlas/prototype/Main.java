package com.matlas.prototype;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
	
	static List<Date> dateList = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("hello World !");
		createPlanning();
		createFile();
		

	}
	public static void createPlanning() throws Exception {
		
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date startDate = formatter.parse("2020-10-01");
		Date endDate = formatter.parse("2021-10-02");
		
		Calendar start = Calendar.getInstance();
		start.setTime(startDate);
		Calendar end = Calendar.getInstance();
		end.setTime(endDate);

		for (Date date = start.getTime(); start.before(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
		    // Do your job here with `date
			dateList.add(date);
		    System.out.println(date);
		}
		
	}
	

	
	public static void createFile() {
		Map<String, Object> model = new HashMap<>();
		model.put("major", "test");
		int es = 2;
		model.put("test", es);
		model.put("planning", dateList);
		
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

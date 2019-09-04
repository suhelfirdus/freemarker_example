/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package freemarker;


import freemarker.core.ParseException;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.Version;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author u640115
 */
public class FirstExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedTemplateNameException, ParseException, TemplateException {
        try {
            // TODO code application logic here
            Configuration cfg = new Configuration(Configuration.VERSION_2_3_28);
            // Where do we load the templates from:
            
            cfg.setClassForTemplateLoading(FirstExample.class, "");
            
            // Some other recommended settings:
            cfg.setIncompatibleImprovements(new Version(2, 3, 28));
            cfg.setDefaultEncoding("UTF-8");
            cfg.setLocale(Locale.US);
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            // 2. Proccess template(s)
            //
            // You will do this for several times in typical applications.
            
            // 2.1. Prepare the template input:
            Map<String, Object> input = new HashMap<String, Object>();
            input.put("title", "Vogella example");
            input.put("exampleObject1", new ValueExampleObject("Suhel Firdus", "$5000","Y"));
            //input.put("exampleObject1", new ValueExampleObject("Kiran Hebbali", "$5000","Yes"));
            
            //List<ValueExampleObject> systems = new ArrayList<ValueExampleObject>();
            //systems.add(new ValueExampleObject("Android", "Google","one"));
            //systems.add(new ValueExampleObject("iOS States", "Apple","two"));
            //systems.add(new ValueExampleObject("Ubuntu", "Canonical","three"));
            //systems.add(new ValueExampleObject("Windows7", "Microsoft","four"));
            //input.put("systems", systems);
            
            // 2.2. Get the template
            Template template = cfg.getTemplate("employee.ftl");
            
            // 2.3. Generate the output
            
            // Write output to the console
            Writer consoleWriter = new OutputStreamWriter(System.out);
            try {
                template.process(input, consoleWriter);
            } catch (TemplateException ex) {
                Logger.getLogger(FirstExample.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            // For the sake of example, also write output into a file:
            Writer fileWriter = new FileWriter(new File("C:\\Users\\u640115\\Desktop\\Suhel\\output.html"));
            try {
                template.process(input, fileWriter);
            } finally {
                fileWriter.close();
            }
            
        }   catch (IOException ex) {
            Logger.getLogger(FirstExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
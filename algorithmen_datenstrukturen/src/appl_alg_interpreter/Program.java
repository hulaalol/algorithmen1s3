package appl_alg_interpreter;

import java.io.File;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Program {
	String main;
	Hashtable<String,Function> functions;
	ArrayList<File> files;
	
	public Program(String main, Hashtable<String,Function> functions, ArrayList<File> files) {
		this.main = main;
		this.functions = functions;
		this.files = files;
	}
	
	public Object execute(Hashtable<String, Object> params) throws Exception {
		Function mainFct = functions.get(main);
		return mainFct.execute(params);
	}
	
	public void parseFiles() throws Exception {
		for (int i=0; i<files.size(); i++) {
			ApplAlgParser parser;
			parser = new ApplAlgParser(files.get(i));
			Program p = parser.parse();
			Hashtable<String,Function> new_functions = p.functions;
			Enumeration<String> names = new_functions.keys();
			while (names.hasMoreElements()) {
				String name = names.nextElement();
				if (functions.containsKey(name)) {
					String message = "Parsing error in " + files.get(i) + ": duplicated function '" + name + "'."; 
					throw new Exception(message);
				}
				this.functions.put(name, new_functions.get(name));
			}
		}
	}
}

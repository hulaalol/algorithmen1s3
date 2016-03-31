package appl_alg_interpreter;

import java.util.ArrayList;
import java.util.Hashtable;

public class Function {
	String name;
	ArrayList<String> formal_params;
	Expression body;
	
	public Function(String name,
			ArrayList<String> formal_params, Expression body) {
		this.name = name;
		this.formal_params = formal_params;
		this.body = body;
	}

	Object execute(Hashtable<String,Object> params) throws Exception {
		return body.evaluate(params);
	}
} 

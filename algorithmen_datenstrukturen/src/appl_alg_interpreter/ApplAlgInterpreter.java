package appl_alg_interpreter;

import java.io.File;
import java.util.Hashtable;

public class ApplAlgInterpreter {
	
	public static Hashtable<String,Function> functions;

	public static void main(String[] args) throws Exception {
		
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/factorial.apl"));
		
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/euklid.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/euklid2.apl"));
		
		
		//ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/russe.apl"));
		
		//ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/klausur_palindrom.apl"));
		
		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/primzahlen03.apl"));
		
		
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/sum.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/sum2.apl"));
		
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/GgT.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/Hanoi.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/IntegerToBinary.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/Primes.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/Sqrt.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/ChangeLetterCase.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/TextSearch.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/TextSearchBruteForce.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/BoyerMooreMatchTable.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/Palindrome.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/Quersumme.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/BinarySearch.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/QuickSort3.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/Fibonacci.apl"));
//		ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/Fibonacci2.apl"));
		
		//ApplAlgParser parser = new ApplAlgParser(new File("appl_algs/PrimeFactorDecomposition.apl"));

		Program p = parser.parse();
		ApplAlgInterpreter.functions = p.functions;
		
		System.out.println("\nResult: " + execute(p));
	}
	
	private static Object execute(Program p) {
		Object result = null;
		
		try {
			result = p.execute(new Hashtable<String, Object>());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return result;
	}
}

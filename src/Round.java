/**
 * Program to round numbers to the nearest integer
 * @author user
 *
 */
public class Round {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (0 == args.length) usage();
		
		for (int i = 0; i < args.length; i++) {

        		int asRoundedInt = round(args[i]);
        		
        		Log.info("Round %s => %d", args[i], asRoundedInt);

		}
	}	
	
	public static int round(String val) {

		// because Java is a strongly typed language in order
		// to convert one type to another (a String to a float)
		// we must `cast` the value to the new type
		float asFloat = Float.parseFloat( val );
		
		asFloat = asFloat + 0.5f;
		
		int asInt = (int) asFloat;
		
		return asInt;
	}
	
	/**
	 * Print program usage statement and exit
	 */
	private static void usage()
	{
		System.err.println("Main [value1] ... [valueN]");
		System.err.println("values - a list  of values to be rounded, e.g. 5.8 3.4 2.1");
		System.exit(1);
	}
	
	/**
	 * Simple logging mechanism
	 */
	static class Log 
	{
		/**
		 * Print a message
		 * @param msg
		 */
		public static void info( String msg )
		{
			System.out.println("INFO: " + msg );
		}
		/**
		 * Print a formatted message
		 * @param format
		 * @param args
		 */
		public static void info( String format, Object...args)
		{
			info(String.format(format, args));
		}
		/**
		 * Print an error to the console
		 * @param err
		 */
		public static void error( String err )
		{
			System.err.println("ERROR: " + err);
		}
	}

}

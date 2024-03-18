package obj;

public class Count {

	public int a = 0;
	public static int b = 0;
		
	public static int doit(){ 
	  //return ++a  -Cannot make a static reference to the nstatic fleid
		++new Count().a;
		return ++b;
	}

}

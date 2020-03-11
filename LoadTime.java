package STD_LIB;

public class LoadTime {

	static long _starttime;
	static long _endtime;
	static double totaltime;
	static double seconds;

	
	public static long starttime() {
		
		_starttime=System.currentTimeMillis();
		return _starttime;
		
	}
	
public static long endtime() {
		
	_endtime=System.currentTimeMillis();
		return _endtime;
		
	}

public static double  totaltime(){
	totaltime=(_endtime-_starttime)/1000.0;
	return totaltime;
	
}
}

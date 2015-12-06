public class Line {
	private EndPoint start;
	private EndPoint end;
	private Boolean isHorizontal;
	
	//assume first and second are in order of increasing x or decreasing y
	public Line(EndPoint first, EndPoint second, Boolean isHoriz) {
		start = first;
		end = second;
		isHorizontal = isHoriz;
	}
	
	public EndPoint start() {
		return start;
	}
	
	public EndPoint end() {
		return end;
	}
	
	public Boolean isHoriz() {
		return isHorizontal;
	}
	

	public toString() {
		return "[ (" + start.x() + " , " + start.y() + "), (" + start.x() + ", " + end.y() + ")]";
	}
	
}
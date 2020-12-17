package sig.oss;

public class Calc {
	public int r = 0;
	public int add(int x, int y) { return x+y; }
	public int sub(int x, int y) { return x-y; }
	public int inc(int d) { 
		r += d;
		return r; 
	} // 작업중...
	public int dec(int d) {
		r -= d;
		return r;
	}
	// 서버에서 수정된 내용
}
///

public class p45 {
//done
	public static void main(String[] args) {
		int tri = 285, pen = 165, hex = 143;
		long curTri = 0, curPen = 0, curHex = 0;
		while(true){
			curHex = getHex(++hex);
			System.out.println(curHex);
			while(curTri < curHex){
				curTri = getTri(++tri);
			}
			while(curPen < curHex){
				curPen = getPen(++pen);
			}
			if(curTri == curPen && curPen == curHex){
				return;
			}
		}
	}

	public static long getTri(int i) {
		return i * (i + 1L) / 2L;
	}

	public static long getPen(int i) {
		return i * (3L * i - 1L) / 2;
	}

	public static long getHex(int i) {
		return i * (2L * i - 1L);
	}
}

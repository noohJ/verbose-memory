package myobj.RSP;

public class Idcenter {
	private String id;
	private int win,draw,lose,score;
	private int[] wdls= {win,draw,lose,score};
	
	public String getid() {
		return id;
	}
	public int[] getwdls() {
		return wdls;
	}
	public String setid(String id) {
		return id;
	}
	public int[] setwdls(int win,int draw, int lose, int score) {
		wdls[0] = win;
		wdls[1] = draw;
		wdls[2] = lose;
		wdls[3] = score;
		return wdls;
	}
}

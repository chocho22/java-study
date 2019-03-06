package db.board;

public class Board12InfoVO {
	private Integer num;
	private String title;
	private String content;
	private String credat;
	
	public Integer getNum() {
		return num;
	}
	public int setNum(Integer num) {
		return this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCredat() {
		return credat;
	}
	public void setCredat(String credat) {
		this.credat = credat;
	}
	@Override
	public String toString() {
		return "Board12InfoVO [num=" + num + ", title=" + title + ", content=" + content + ", credat=" + credat + "]";
	}
	
}

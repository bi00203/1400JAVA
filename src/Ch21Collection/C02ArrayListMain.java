package Ch21Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BoardDTO
{
	private int No;
	private String title;
	private String content;
	private String writer;
	private String regdate;
	
	public BoardDTO(int no, String title, String content, String writer, String regdate) {
		super();
		No = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.regdate = regdate;
	}

	public int getNo() {
		return No;
	}

	public void setNo(int no) {
		No = no;
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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "BoardDTO [No=" + No + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regdate="
				+ regdate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof BoardDTO) {
			BoardDTO down = (BoardDTO)obj;
			return this.No==down.No;
		}
		return false;
	}
	
	
	
}
public class C02ArrayListMain {

	public static void addDTO(List<BoardDTO> list, BoardDTO dto) {
		list.add(dto);
	}
	public static void ShowDTO(List<BoardDTO> list){
		for(BoardDTO dto : list) {
			System.out.println(dto.toString());
		}
		
		
	}
		public static void main(String[] args) {
		
		List<BoardDTO> list = new ArrayList();
		// 키보드로 BoardDTO 단위의 값을 하나 이상받아(no, title, content, writer, regdate)
		// list에 저장하세요
		// list에 저장된 BoardDTO를 모두 확인해보세요
		
		addDTO(list, new BoardDTO(1,"나무","내용1","베르","2022-08-01"));
		addDTO(list, new BoardDTO(2,"개미","내용2","나르","2022-09-01"));
		addDTO(list, new BoardDTO(3,"바리","내용3","황","2022-10-01"));
		addDTO(list, new BoardDTO(4,"데기","내용4","석","2022-11-01"));
		
		BoardDTO search = new BoardDTO(2,"개미","내용2","나르","2022-09-01");
		if(list.contains(search)) {
			System.out.println("존재 합니다.");
		}
		else
		{
			System.out.println("존재하지 않습니다.");
		}
		
		ShowDTO(list);

	}

}

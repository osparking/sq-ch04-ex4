package components.impl;

import components.CommentRepository;
import domain.Comment;
import utility.PrintUtil;

public class DBCommRepo implements CommentRepository {

	@Override
	public void storeComment(Comment comment) {
		PrintUtil.printStream.println("저장된 주석 텍스트: " + comment.getText());
	}

}

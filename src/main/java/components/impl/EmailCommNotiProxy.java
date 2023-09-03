package components.impl;

import components.CommentNotiProxy;
import domain.Comment;
import utility.PrintUtil;

public class EmailCommNotiProxy implements CommentNotiProxy {

	@Override
	public void notifyCommEmail(Comment comment) {
		PrintUtil.printStream.println("이메일로 통지된 코멘트 내용: " + comment.getText());
	}

}

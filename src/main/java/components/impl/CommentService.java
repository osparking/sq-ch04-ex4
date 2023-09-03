package components.impl;

import components.CommentNotiProxy;
import components.CommentRepository;
import domain.Comment;

public class CommentService {
	private CommentRepository repository;
	private CommentNotiProxy notiProxy;

	public CommentService(CommentRepository repository,
			CommentNotiProxy notiProxy) {
		super();
		this.repository = repository;
		this.notiProxy = notiProxy;
	}

	public void publishComment(Comment comment) {
		repository.storeComment(comment);
		notiProxy.notifyCommEmail(comment);
	}
}

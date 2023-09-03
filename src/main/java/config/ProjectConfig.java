package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import components.impl.CommentService;
import components.impl.DBCommRepo;
import components.impl.EmailCommNotiProxy;

@Configuration
public class ProjectConfig {

	@Bean
	DBCommRepo dBCommRepo() {
		var repository = new DBCommRepo();
		return repository;
	}

	@Bean
	EmailCommNotiProxy emailCommNotiProxy() {
		var notiProxy = new EmailCommNotiProxy();
		return notiProxy;
	}

	@Bean
	CommentService commentService(DBCommRepo dbCommRepo,
			EmailCommNotiProxy emailCommNotiProxy) {
		var commentService = 
				new CommentService(dbCommRepo, emailCommNotiProxy);
		return commentService;
	}

}

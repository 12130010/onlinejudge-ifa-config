package onlinejudge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class OnlinejudgeConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(OnlinejudgeConfigApplication.class, args);
	}
}

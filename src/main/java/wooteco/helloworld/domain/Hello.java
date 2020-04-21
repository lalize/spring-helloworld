package wooteco.helloworld.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

public class Hello {
    @Id
    private Long id;
    private String name;
    private LocalDateTime createdAt;

    public Hello(String name) {
        this.name = name;
        this.createdAt = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}

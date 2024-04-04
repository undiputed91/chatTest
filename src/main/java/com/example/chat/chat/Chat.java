package com.example.chat.chat;

import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data //롬복 어노테이션 getter setter toString() equals() hashcode() 포함
@Document(collection = "chat") //mysql의 @entity느낌인듯?
public class Chat {
    @Id
    private String id; //몽고디비에서는 기본으로 Bson타입이라는 데이터타입으로 저장하지만 String으로 초기설정
    private String msg;
    private String sender;
    private String receiver;

    private LocalDateTime createdAt;
}

package com.hl.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDTO {
    private int id;
    private String title;
    private String content;
    private String profile;
    private String writer;
    private LocalDateTime created_at;
}

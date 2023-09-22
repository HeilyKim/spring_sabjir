package com.hl.board.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReplyDTO {
    private int rid;
    private int cid;
    private String rcontent;
    private String rwriter;
    private LocalDateTime rcreated_at;
}

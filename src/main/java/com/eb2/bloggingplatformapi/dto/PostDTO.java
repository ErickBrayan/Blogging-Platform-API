package com.eb2.bloggingplatformapi.dto;


import java.util.List;

public record PostDTO(
        String title,
        String content,
        String category,
        List<String>tags
) {
}

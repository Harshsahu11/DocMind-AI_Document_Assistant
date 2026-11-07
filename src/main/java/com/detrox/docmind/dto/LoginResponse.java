package com.detrox.docmind.dto;

public record LoginResponse(
        String accessToken,
        UserDto user
) {
}

package com.detrox.docmind.dto;

public record RegisterUserRequest(
        String username,
        String email,
        String password
) {
}

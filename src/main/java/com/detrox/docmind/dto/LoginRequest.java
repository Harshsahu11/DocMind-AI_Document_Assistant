package com.detrox.docmind.dto;

public record LoginRequest(
        String username,
        String password
) {
}

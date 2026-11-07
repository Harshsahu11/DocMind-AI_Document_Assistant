package com.detrox.docmind.dto;

import com.detrox.docmind.entity.Role;

public record UserDto(
        Long id,
        String username,
        String email,
        Role role
) {
}

package com.example.demo.dto;


import java.time.Instant;
import java.util.Set;
import java.util.UUID;

import com.example.demo.entity.Role;

public record UserResponse(
    UUID id,
    String fullName,
    String email,
    Set<Role> roles,
    boolean enabled,
    Instant createdAt
) {
}
package com.example.demo.dto;

import java.time.Instant;
import java.util.UUID;

import com.example.demo.entity.TicketCategory;
import com.example.demo.entity.TicketPriority;
import com.example.demo.entity.TicketStatus;

public record TicketResponse(
    UUID id,
    String title,
    String description,
    TicketCategory category,
    TicketPriority priority,
    TicketStatus status,
    UUID createdByUserId,
    UUID assignedToUserId,
    Instant createdAt,
    Instant updatedAt,
    Instant resolvedAt,
    long version
) {
}
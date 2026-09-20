package com.example.demo.repository;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.entity.Ticket;
import com.example.demo.entity.TicketStatus;

public interface TicketRepository
    extends JpaRepository<Ticket, UUID>,
            JpaSpecificationExecutor<Ticket> {

    Page<Ticket> findByCreatedByUserId(
        UUID userId,
        Pageable pageable
    );

    Page<Ticket> findByAssignedToUserId(
        UUID userId,
        Pageable pageable
    );

    Page<Ticket> findByStatus(
        TicketStatus status,
        Pageable pageable
    );
}
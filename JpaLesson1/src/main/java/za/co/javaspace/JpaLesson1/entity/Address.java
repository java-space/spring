/*
 * Copyright 2023 , All Rights Reserved
 * Licensed under the Apache License, Version 2.0 (the "License");
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential
 * @author  Mothusi Molorane
 * @since 1.0
 */

package za.co.javaspace.JpaLesson1.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@NoArgsConstructor
public class Address extends AbstractEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Person person;

    private Boolean isCompleted = false;

    private LocalDate dueDate;

    private String description;

    private Boolean isFavourite = false;

    @PrePersist
    public void init() {
        this.setCreatedDate(LocalDateTime.now());
        this.setIsDeleted(false);
        this.isCompleted = false;
    }
}

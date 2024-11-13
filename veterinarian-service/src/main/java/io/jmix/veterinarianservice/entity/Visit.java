package io.jmix.veterinarianservice.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;

import java.time.OffsetDateTime;
import java.util.UUID;

@JmixEntity
@Table(name = "VISIT")
@Entity
public class Visit {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_OF_VISIT")
    private OffsetDateTime dateOfVisit;

    @Column(name = "RESULT_")
    @Lob
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public OffsetDateTime getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(OffsetDateTime dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
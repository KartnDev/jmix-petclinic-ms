package io.jmix.veterinarianservice.entity;

import io.jmix.core.entity.annotation.JmixId;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.JmixProperty;

import java.util.List;
import java.util.UUID;

@JmixEntity
public class PetProjection {
    @JmixProperty(mandatory = true)
    @JmixId
    private UUID id;

    @InstanceName
    private String name;

    private Integer age;

    private String legal;

    private List<PetProjection> visits;

    public List<PetProjection> getVisits() {
        return visits;
    }

    public void setVisits(List<PetProjection> visits) {
        this.visits = visits;
    }

    public String getLegal() {
        return legal;
    }

    public void setLegal(String legal) {
        this.legal = legal;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
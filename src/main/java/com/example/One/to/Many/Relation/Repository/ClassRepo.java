package com.example.One.to.Many.Relation.Repository;

import com.example.One.to.Many.Relation.Entity.ClassInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepo extends JpaRepository<ClassInfoEntity, Long> {
}

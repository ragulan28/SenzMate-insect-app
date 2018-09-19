package com.ragul.insect.repository;

import com.ragul.insect.model.Insect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsectRepository extends JpaRepository<Insect, String> {
}

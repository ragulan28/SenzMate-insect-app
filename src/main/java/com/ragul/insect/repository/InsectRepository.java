package com.ragul.insect.repository;

import com.ragul.insect.model.Insect;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InsectRepository extends MongoRepository<Insect, String> {
}

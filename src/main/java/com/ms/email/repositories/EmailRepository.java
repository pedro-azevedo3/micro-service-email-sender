package com.ms.email.repositories;

import com.ms.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, BigInteger> {
}

package com.example.ConferenceApplication.repositories;

import com.example.ConferenceApplication.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {

}

package com.example.ConferenceApplication.repositories;

import com.example.ConferenceApplication.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}

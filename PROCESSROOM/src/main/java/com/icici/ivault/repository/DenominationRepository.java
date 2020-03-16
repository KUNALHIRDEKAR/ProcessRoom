package com.icici.ivault.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.icici.ivault.processRoomBO.Denomination;

public interface DenominationRepository extends JpaRepository<Denomination, Integer> {

}

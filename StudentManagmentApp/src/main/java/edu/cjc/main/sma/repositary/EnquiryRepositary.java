package edu.cjc.main.sma.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.cjc.main.sma.model.EquiryFrom;
@Repository
public interface EnquiryRepositary extends JpaRepository<EquiryFrom, Integer>
{

}

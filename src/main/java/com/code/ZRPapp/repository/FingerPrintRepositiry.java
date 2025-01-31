package com.code.ZRPapp.repository;

import com.code.ZRPapp.models.FingerPrintForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FingerPrintRepositiry extends JpaRepository<FingerPrintForm,Long> {
}

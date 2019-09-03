package com.mgs.web.repository;

import com.mgs.web.model.TRun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = true)
public interface TRunRepository extends JpaRepository<TRun, Integer> {

    @Override
    @Transactional
    TRun save(TRun user);

    @Override
    List<TRun> findAll();
}

package com.mgs.web.service;

import com.mgs.web.model.TRun;
import com.mgs.web.repository.TRunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mgs.web.service.TRunService;

import java.util.List;

@Service
public class TRunServiceImpl implements  TRunService {

    @Autowired
    TRunRepository runRepository;

    @Override
    public TRun addTestRun(TRun tRun) {
        TRun result = runRepository.saveAndFlush(tRun);
        return result;
    }

    @Override
    public TRun editTestRun(TRun tRun) {
        TRun result = runRepository.saveAndFlush(tRun);
        return result;
    }

    @Override
    public TRun getById(Integer id) {
        TRun result = runRepository.getOne(id);
        return result;
    }

    @Override
    public List<TRun> getAll() {
        return runRepository.findAll();
    }
}

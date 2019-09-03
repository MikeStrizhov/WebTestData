package com.mgs.web.service;

import com.mgs.web.model.TRun;

import java.util.List;

public interface TRunService {
    TRun addTestRun(TRun tRun);
    TRun editTestRun(TRun tRun);
    TRun getById(Integer id);
    List<TRun> getAll();
}

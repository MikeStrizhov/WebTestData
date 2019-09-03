package com.mgs.web.repository;

import com.mgs.web.model.TRun;
import com.mgs.web.service.TRunService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TRunRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    TRunRepository repository;

    @Test
    public void save() {
        TRun tRun = new TRun();
        String name = "t2";
        tRun.setName(name);
        tRun.setStartTime(new Date());
        entityManager.persist(tRun);
        entityManager.flush();

        List<TRun> tRunList = repository.findAll();
        Assert.assertEquals(tRunList.get(1).getName(), name);
    }

    @Test
    public void findAll() {
        List<TRun> tRunList = repository.findAll();
        int sizeBeforeTest = tRunList.size();

        TRun tRun = new TRun();
        String name = "t2";
        tRun.setName(name);
        tRun.setStartTime(new Date());
        entityManager.persist(tRun);
        entityManager.flush();

        tRunList = repository.findAll();

        Assert.assertEquals(tRunList.size(), sizeBeforeTest+1);
    }
}
package com.mgs.web.service;

import com.mgs.web.model.TRun;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TRunServiceImplTest {

    @Autowired
    TRunService tRunService;

    @Test
    public void addTestRun() {

        TRun tRun = new TRun();
        tRun.setName("test1");
        tRunService.addTestRun(tRun);
        List<TRun> tRunList = tRunService.getAll();

        Assert.assertEquals(tRunList.get(1).getName(), tRun.getName());
    }

    @Test
    public void editTestRun() {
        //ToDo implement test
    }

    @Test
    public void getAll() {

        List<TRun> tRunList = tRunService.getAll();
        Assert.assertEquals(tRunList.size(), 1);
    }
}
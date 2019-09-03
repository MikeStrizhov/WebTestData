package com.mgs.web.web;

import com.mgs.web.model.TRun;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class TRunControllerTest {

    @Autowired
    TRunController tRunController;

    private ExtendedModelMap model = new ExtendedModelMap();

    @Test
    public void testRunList() {
        String result = tRunController.testRunList(model);
        assertEquals("list",result);
    }

    @Test
    @Transactional
    public void testInfo() {
        String result = tRunController.testInfo(1,model);
        assertEquals("testInfo",result);
        TRun testRunInfo = (TRun) model.get("testInfo");
        assertEquals("t1",testRunInfo.getName());
    }
}
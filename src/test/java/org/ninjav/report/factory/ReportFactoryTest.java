/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ninjav.report.factory;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.ninjav.report.engine.Report;

/**
 *
 * @author apickard
 */
public class ReportFactoryTest {

    public ReportFactoryTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of createReport method, of class ReportFactory.
     */
    @Test
    public void testCreateReport() {
        System.out.println("createReport");
        ReportFactory instance = new CfbReportFactory();
        Report result = instance.createReport();
        result.process();
    }
}